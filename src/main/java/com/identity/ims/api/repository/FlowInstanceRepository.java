package com.identity.ims.api.repository;

import java.util.List;

import com.identity.ims.api.Entity.Orchestrator.FlowInstance;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface FlowInstanceRepository
  extends JpaRepository<FlowInstance, Integer> {
  @Query (value = "select f from FlowInstance f where flowInstanceStatusCode !=com.identity.ims.api.Entity.Orchestrator.FlowInstanceStatusType.COMPLETED" )
  List<FlowInstance> findOpenFlowInstances();

  
  }
