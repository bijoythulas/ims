package com.identity.ims.api.services;

import com.identity.ims.api.Entity.Orchestrator.FlowInstance;
import com.identity.ims.api.Entity.Orchestrator.FlowInstanceStatusType;
import com.identity.ims.api.repository.FlowInstanceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowInstanceService {

  @Autowired
  private FlowInstanceRepository flowInstanceRepository;

  List<FlowInstance> findOpenFlowInstances() {
    return flowInstanceRepository.findOpenFlowInstances();
  }

  void MoveFlowToStage(FlowInstance flowInstance,FlowInstanceStatusType flowInstanceStatusType)
  {
    flowInstance.setFlowInstanceStatusCode(flowInstanceStatusType);
    flowInstanceRepository.save(flowInstance);
  }

}
