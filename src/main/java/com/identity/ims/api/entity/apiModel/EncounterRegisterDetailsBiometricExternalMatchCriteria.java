package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class EncounterRegisterDetailsBiometricExternalMatchCriteria   {
  
  private  String matchSystem;

  /**
   **/
  public EncounterRegisterDetailsBiometricExternalMatchCriteria matchSystem(String matchSystem) {
    this.matchSystem = matchSystem;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("matchSystem")
  public String getMatchSystem() {
    return matchSystem;
  }
  public void setMatchSystem(String matchSystem) {
    this.matchSystem = matchSystem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncounterRegisterDetailsBiometricExternalMatchCriteria encounterRegisterDetailsBiometricExternalMatchCriteria = (EncounterRegisterDetailsBiometricExternalMatchCriteria) o;
    return Objects.equals(this.matchSystem, encounterRegisterDetailsBiometricExternalMatchCriteria.matchSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterRegisterDetailsBiometricExternalMatchCriteria {\n");
    
    sb.append("    matchSystem: ").append(toIndentedString(matchSystem)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

