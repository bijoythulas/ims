package com.identity.ims.api.Entity.ApiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Types of person or party level system identifiers that this service will accept.
 **/
@ApiModel(description = "Types of person or party level system identifiers that this service will accept.")
public class PartySystemIdentifier   {
  
  private  String partySystemId;
  private  String partySystemIdType;

  /**
   **/
  public PartySystemIdentifier partySystemId(String partySystemId) {
    this.partySystemId = partySystemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("partySystemId")
  public String getPartySystemId() {
    return partySystemId;
  }
  public void setPartySystemId(String partySystemId) {
    this.partySystemId = partySystemId;
  }

  /**
   **/
  public PartySystemIdentifier partySystemIdType(String partySystemIdType) {
    this.partySystemIdType = partySystemIdType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("partySystemIdType")
  public String getPartySystemIdType() {
    return partySystemIdType;
  }
  public void setPartySystemIdType(String partySystemIdType) {
    this.partySystemIdType = partySystemIdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartySystemIdentifier partySystemIdentifier = (PartySystemIdentifier) o;
    return Objects.equals(this.partySystemId, partySystemIdentifier.partySystemId) &&
        Objects.equals(this.partySystemIdType, partySystemIdentifier.partySystemIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partySystemId, partySystemIdType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartySystemIdentifier {\n");
    
    sb.append("    partySystemId: ").append(toIndentedString(partySystemId)).append("\n");
    sb.append("    partySystemIdType: ").append(toIndentedString(partySystemIdType)).append("\n");
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

