package com.identity.ims.api.services;

import com.identity.ims.api.entity.interfaces.StageProcessor;
import com.identity.ims.api.entity.orchestrator.FlowInstance;
import com.identity.ims.api.entity.orchestrator.FlowInstanceStatusType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrchestratorService {

  @Autowired
  FlowInstanceService flowInstanceService;

  @Autowired
  OrchestratorInitialStatusService orchestratorInitialStatusService;

  public void ProcessEncounters() {
    List<FlowInstance> listFlowInstance = flowInstanceService.findOpenFlowInstances();

    //process referrals in parallel using all the cores on the server
    listFlowInstance
      .stream()
      .parallel()
      .forEach(
        //  listFlowInstance.forEach(
        flowInstance -> {
          StageProcessor stageProcessor = GetStageProcessor(
            flowInstance.getFlowInstanceStatusCode()
          );

          try {
            stageProcessor.ProcessStage(flowInstance);
          } catch (Exception e) {
            throw new RuntimeException(
              "error processing flow stage" + flowInstance.getId(),
              e
            );
          }
        }
      );
  }

  StageProcessor GetStageProcessor(
    FlowInstanceStatusType flowInstanceStatusType
  ) {
    switch (flowInstanceStatusType) {
      case INITIAL:
        return orchestratorInitialStatusService;
      default:
        throw new RuntimeException(
          "unknown flow stage:" + flowInstanceStatusType.name()
        );
    }
  }
}
