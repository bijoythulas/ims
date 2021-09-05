package com.identity.ims.api.services;

import com.identity.ims.api.entity.interfaces.StageProcessor;
import com.identity.ims.api.entity.orchestrator.FlowInstance;
import com.identity.ims.api.entity.orchestrator.FlowInstanceStatusType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrchestratorInitialStatusService implements StageProcessor {

  @Autowired
  PayloadService payloadService;

  @Autowired
  FlowInstanceService flowInstanceService;

  public boolean ProcessStage(FlowInstance flowInstance) {
    /*

        //store the id05 payload for later use
        payloadService.PersistPayload(flowInstance.getId()
        , 
        PayloadType.ID005_REQUEST, 
        ID005_REQUESTOBJECT);
        
        
        ID05Response = Id005Match(ID005_REQUESTOBJECT);

        payloadService.PersistPayload(flowInstance.getId()
        , 
        PayloadType.ID005_REQUEST, 
        ID05Response);

        process everything like id05 (persist payload only if needed later)
        until we  get to the stage where we need to wait for external response

        once we are waiting update flow status to reflect what we are waiting on

        eg below
        
        */
    flowInstanceService.MoveFlowToStage(
      flowInstance,
      FlowInstanceStatusType.AWAITING_CDH_SV765
    );
    return true;
  }
}
