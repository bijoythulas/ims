package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.Identifier;



public class Association   {
  
  private  String encounterId;
  private  String partyType;
  private  Identifier relatedPartyIdentifier;
  private  String relationshipType;
  private  String resolutionStatusCode;

  /**
   **/
  public Association encounterId(String encounterId) {
    this.encounterId = encounterId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("encounterId")
  public String getEncounterId() {
    return encounterId;
  }
  public void setEncounterId(String encounterId) {
    this.encounterId = encounterId;
  }

  /**
   * A party can be either a person or organisation.
   **/
  public Association partyType(String partyType) {
    this.partyType = partyType;
    return this;
  }

  
  @ApiModelProperty(value = "A party can be either a person or organisation.")
  @JsonProperty("partyType")
  public String getPartyType() {
    return partyType;
  }
  public void setPartyType(String partyType) {
    this.partyType = partyType;
  }

  /**
   **/
  public Association relatedPartyIdentifier(Identifier relatedPartyIdentifier) {
    this.relatedPartyIdentifier = relatedPartyIdentifier;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("relatedPartyIdentifier")
  public Identifier getRelatedPartyIdentifier() {
    return relatedPartyIdentifier;
  }
  public void setRelatedPartyIdentifier(Identifier relatedPartyIdentifier) {
    this.relatedPartyIdentifier = relatedPartyIdentifier;
  }

  /**
   **/
  public Association relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("relationshipType")
  public String getRelationshipType() {
    return relationshipType;
  }
  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  /**
   **/
  public Association resolutionStatusCode(String resolutionStatusCode) {
    this.resolutionStatusCode = resolutionStatusCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resolutionStatusCode")
  public String getResolutionStatusCode() {
    return resolutionStatusCode;
  }
  public void setResolutionStatusCode(String resolutionStatusCode) {
    this.resolutionStatusCode = resolutionStatusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Association association = (Association) o;
    return Objects.equals(this.encounterId, association.encounterId) &&
        Objects.equals(this.partyType, association.partyType) &&
        Objects.equals(this.relatedPartyIdentifier, association.relatedPartyIdentifier) &&
        Objects.equals(this.relationshipType, association.relationshipType) &&
        Objects.equals(this.resolutionStatusCode, association.resolutionStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterId, partyType, relatedPartyIdentifier, relationshipType, resolutionStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Association {\n");
    
    sb.append("    encounterId: ").append(toIndentedString(encounterId)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
    sb.append("    relatedPartyIdentifier: ").append(toIndentedString(relatedPartyIdentifier)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    resolutionStatusCode: ").append(toIndentedString(resolutionStatusCode)).append("\n");
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

