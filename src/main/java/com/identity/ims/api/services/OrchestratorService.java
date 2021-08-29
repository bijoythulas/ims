package com.identity.ims.api.services;

import com.identity.ims.api.Entity.Orchestrator.FlowInstance;
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
    listFlowInstance.forEach(
      flowInstance -> {
        System.out.println(flowInstance.getLastModifiedBy());
      }
    );
  }

  boolean ProcessFlowInstance(FlowInstance flowInstance) {
    switch (flowInstance.getFlowInstanceStatusCode()) {
      case INITIAL:
        orchestratorInitialStatusService.ProcessStage(flowInstance);
        break;
      default:
        break;
    }
    return true;
  }
}
