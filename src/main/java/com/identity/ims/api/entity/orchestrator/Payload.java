package com.identity.ims.api.entity.orchestrator;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.identity.ims.api.entity.enums.PayloadFormat;
import com.identity.ims.api.entity.idh.BaseEntity;

import org.hibernate.annotations.Nationalized;

import lombok.*;
/**
 * 
 * 
   
    flowInstanceId
    payload
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payload extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @NonNull
    private PayloadType payloadTypeCode;

    @NonNull
    private Integer flowInstanceId; 

    @Enumerated(EnumType.STRING)
    @NonNull
    private PayloadFormat payloadFormat ; 


    @NonNull
    @Nationalized
    @Column(columnDefinition = "varchar(max)")
    private String payload;



}
