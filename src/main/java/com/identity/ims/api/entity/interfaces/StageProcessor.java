package com.identity.ims.api.entity.interfaces;

import com.identity.ims.api.entity.orchestrator.FlowInstance;

public interface StageProcessor {
    boolean ProcessStage(FlowInstance flowInstance); 
}
