package com.identity.ims.api.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.identity.ims.api.entity.enums.PayloadFormat;
import com.identity.ims.api.entity.orchestrator.Payload;
import com.identity.ims.api.entity.orchestrator.PayloadType;
import com.identity.ims.api.repository.PayloadRepository;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayloadService {

  @Autowired
  private ObjectMapper objectMapper;

  @Autowired
  private PayloadRepository payloadRepository;

  <T> String ConvertObjectToPayloadFormat(
    T payLoadClassInstance,
    PayloadFormat payloadFormat
  ) {
    switch (payloadFormat) {
      case JSON:
        {
          try {
            return objectMapper.writeValueAsString(payLoadClassInstance);
          } catch (JsonProcessingException e) {
            throw new RuntimeException("error reading json payload", e);
          }
        }
      case XML:
        {
          try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.writeValueAsString(payLoadClassInstance);
          } catch (JsonProcessingException e) {
            throw new RuntimeException("error reading xml payload", e);
          }
        }
      default:
        throw new RuntimeException("unhandled payload format");
    }
  }

  public <T> Payload PersistPayload(
    Integer flowInstanceId,
    PayloadType payloadType,
    T payLoadClassInstance
  ) {
    Payload payload = new Payload(
      payloadType,
      flowInstanceId,
      PayloadFormat.JSON,
      ConvertObjectToPayloadFormat(payLoadClassInstance, PayloadFormat.JSON)
    );

    payloadRepository.save(payload);
    return payload;
  }

  public <T> Payload PersistRawXMLPayload(
    Integer flowInstanceId,
    PayloadType payloadType,
    String payloadXMLString,
    PayloadFormat payloadFormat

  ) {

    Payload payload = new Payload(
      payloadType,
      flowInstanceId,
      PayloadFormat.XML,
      payloadXMLString
    );

    payloadRepository.save(payload);
    return payload;
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
  ) {
    try {
      Payload payload = payloadRepository.RetrievePayload(
        flowInstanceId,
        payloadType
      );

      switch (payload.getPayloadFormat()) {
        case JSON:
          return objectMapper.readValue(payload.getPayload(), target);
        case XML:
          {
            return objectMapper.readValue(payload.getPayload(), target);
          }
        default:
          {
            throw new RuntimeException("unhandled payload format");
          }
      }
    } catch (JsonProcessingException e) {
      throw new RuntimeException("error reading payload", e);
    }
  }

  public <T> T RetrievePayLoadById(Integer id, Class<T> target) {
    try {
      Payload payload = payloadRepository.findById(id).get();
      return objectMapper.readValue(payload.getPayload(), target);
    } catch (NoSuchElementException e) {
      throw new RuntimeException("Record not found", e);
    } catch (JsonProcessingException e) {
      throw new RuntimeException("error reading payload", e);
    }
  }
}
