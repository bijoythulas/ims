package com.identity.ims.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.identity.ims.api.Entity.Orchestrator.Payload;
import com.identity.ims.api.Entity.Orchestrator.PayloadType;
import com.identity.ims.api.repository.PayloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayloadService {

  @Autowired
  private ObjectMapper objectMapper;

  @Autowired
  private PayloadRepository payloadRepository;

  public <T> void PersistPayload(
    Integer flowInstanceId,
    PayloadType payloadType,
    T payLoadClassInstance
  )
    throws Exception {
    Payload payload = new Payload(
      payloadType,
      flowInstanceId,
      objectMapper.writeValueAsString(payLoadClassInstance)
    );
    payloadRepository.save(payload);
  }

  /**
   * 
   * @param <T>
   * @param flowInstanceId
   * @param payloadType
   * @param target  eg . classname.class  string will be transformed to this class
   * @return
   * @throws Exception
   */
  public <T> T RetrievePayLoad(
    Integer flowInstanceId,
    PayloadType payloadType,
    Class<T> target
  )
    throws Exception {
    Payload payload = payloadRepository.RetrievePayload(
      flowInstanceId,
      payloadType
    );

    return objectMapper.readValue(payload.getPayload(), target);
  }
}
