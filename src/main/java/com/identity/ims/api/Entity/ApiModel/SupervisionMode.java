package com.identity.ims.api.Entity.ApiModel;

import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Level supervision surrounding the capture of biometrics or document images.
 */
public enum SupervisionMode {
  
  COMMERCIAL_NON_SDP("COMMERCIAL_NON-SDP"),
  
  COMMERCIAL_SDP("COMMERCIAL_SDP"),
  
  GOVERNMENT_SDP("GOVERNMENT_SDP"),
  
  NOT_SPECIFIED("NOT_SPECIFIED"),
  
  UNSUPERVISED("UNSUPERVISED"),
  
  DEPARTMENT("DEPARTMENT");

  private String value;

  SupervisionMode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SupervisionMode fromValue(String value) {
    for (SupervisionMode b : SupervisionMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


