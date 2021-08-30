package com.identity.ims.api.Entity.Orchestrator;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.identity.ims.api.Entity.BaseEntity;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
public class FlowInstance extends BaseEntity {
    
    /**encounter id passed back to id01 callers is saved here
     * 
     */
    private Integer encounterId;

    /**this indicates at what stage of the orchestration stage the flow instance has reached
     * 
     */
    @Enumerated(EnumType.STRING)
    private FlowInstanceStatusType flowInstanceStatusCode;

    /** orchestrator will only process the encounters created on api instance 
     * this enable horizontal scaling of encounter processing     * 
     */
    private String processingServerName;

    
}
