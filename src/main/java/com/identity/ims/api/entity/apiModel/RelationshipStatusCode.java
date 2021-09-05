package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A person&#39;s relationship-status details.
 */
public enum RelationshipStatusCode {
  
  DEFACTO_PARTNER("DEFACTO_PARTNER"),
  
  DIVORCED("DIVORCED"),
  
  ENGAGED("ENGAGED"),
  
  MARRIED("MARRIED"),
  
  NEVER_MARRIED_DEFACTO("NEVER_MARRIED/DEFACTO"),
  
  NOT_STATED("NOT_STATED"),
  
  SEPARATED("SEPARATED"),
  
  WIDOWED("WIDOWED");

  private String value;

  RelationshipStatusCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RelationshipStatusCode fromValue(String value) {
    for (RelationshipStatusCode b : RelationshipStatusCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


