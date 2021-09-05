package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gender and sex types are Female, Male and Other for other, not stated or unknown.
 */
public enum GenderSexType {
  
  FEMALE("FEMALE"),
  
  MALE("MALE"),
  
  OTHER("OTHER");

  private String value;

  GenderSexType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GenderSexType fromValue(String value) {
    for (GenderSexType b : GenderSexType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


