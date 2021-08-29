package com.identity.ims.api.repository;

import com.identity.ims.api.Entity.Orchestrator.Payload;
import com.identity.ims.api.Entity.Orchestrator.PayloadType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PayloadRepository extends JpaRepository<Payload, Integer> {

    @Query(value= "select p from Payload p where flowInstanceId= ?1 and payloadTypeCode = ?2")
    //@Query (value = "select f from flowInstance f where flowInstanceStatusCode !='COMPLETED'" )
    Payload RetrievePayload(Integer flowInstanceId,PayloadType payloadType );
}
