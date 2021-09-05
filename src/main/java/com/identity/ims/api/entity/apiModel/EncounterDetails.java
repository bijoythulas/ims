package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.BusinessCaptureType;
import com.identity.ims.api.entity.apiModel.PartySystemIdentifier;
import com.identity.ims.api.entity.apiModel.SupervisionMode;


/**
 * Encounter core details
 **/
@ApiModel(description = "Encounter core details")
public class EncounterDetails   {
  
  private  BusinessCaptureType businessCaptureType;
  private  String encounterLocation;
  private  OffsetDateTime encounterTimeStamp;
  private  PartySystemIdentifier partySystemIdentifier;
  private  String sourceSystem;
  private  OffsetDateTime sourceSystemTimeStamp;
  private  String sourceSystemUserId;
  private  SupervisionMode supervisionMode;

  /**
   **/
  public EncounterDetails businessCaptureType(BusinessCaptureType businessCaptureType) {
    this.businessCaptureType = businessCaptureType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("businessCaptureType")
  public BusinessCaptureType getBusinessCaptureType() {
    return businessCaptureType;
  }
  public void setBusinessCaptureType(BusinessCaptureType businessCaptureType) {
    this.businessCaptureType = businessCaptureType;
  }

  /**
   * Location where an encounter took place.
   **/
  public EncounterDetails encounterLocation(String encounterLocation) {
    this.encounterLocation = encounterLocation;
    return this;
  }

  
  @ApiModelProperty(value = "Location where an encounter took place.")
  @JsonProperty("encounterLocation")
  public String getEncounterLocation() {
    return encounterLocation;
  }
  public void setEncounterLocation(String encounterLocation) {
    this.encounterLocation = encounterLocation;
  }

  /**
   **/
  public EncounterDetails encounterTimeStamp(OffsetDateTime encounterTimeStamp) {
    this.encounterTimeStamp = encounterTimeStamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("encounterTimeStamp")
  public OffsetDateTime getEncounterTimeStamp() {
    return encounterTimeStamp;
  }
  public void setEncounterTimeStamp(OffsetDateTime encounterTimeStamp) {
    this.encounterTimeStamp = encounterTimeStamp;
  }

  /**
   **/
  public EncounterDetails partySystemIdentifier(PartySystemIdentifier partySystemIdentifier) {
    this.partySystemIdentifier = partySystemIdentifier;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("partySystemIdentifier")
  public PartySystemIdentifier getPartySystemIdentifier() {
    return partySystemIdentifier;
  }
  public void setPartySystemIdentifier(PartySystemIdentifier partySystemIdentifier) {
    this.partySystemIdentifier = partySystemIdentifier;
  }

  /**
   * The system that provided the encounter.
   **/
  public EncounterDetails sourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The system that provided the encounter.")
  @JsonProperty("sourceSystem")
  public String getSourceSystem() {
    return sourceSystem;
  }
  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }

  /**
   **/
  public EncounterDetails sourceSystemTimeStamp(OffsetDateTime sourceSystemTimeStamp) {
    this.sourceSystemTimeStamp = sourceSystemTimeStamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sourceSystemTimeStamp")
  public OffsetDateTime getSourceSystemTimeStamp() {
    return sourceSystemTimeStamp;
  }
  public void setSourceSystemTimeStamp(OffsetDateTime sourceSystemTimeStamp) {
    this.sourceSystemTimeStamp = sourceSystemTimeStamp;
  }

  /**
   * Source system UserId for the person or officer associated with the encounter.
   **/
  public EncounterDetails sourceSystemUserId(String sourceSystemUserId) {
    this.sourceSystemUserId = sourceSystemUserId;
    return this;
  }

  
  @ApiModelProperty(value = "Source system UserId for the person or officer associated with the encounter.")
  @JsonProperty("sourceSystemUserId")
  public String getSourceSystemUserId() {
    return sourceSystemUserId;
  }
  public void setSourceSystemUserId(String sourceSystemUserId) {
    this.sourceSystemUserId = sourceSystemUserId;
  }

  /**
   **/
  public EncounterDetails supervisionMode(SupervisionMode supervisionMode) {
    this.supervisionMode = supervisionMode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("supervisionMode")
  public SupervisionMode getSupervisionMode() {
    return supervisionMode;
  }
  public void setSupervisionMode(SupervisionMode supervisionMode) {
    this.supervisionMode = supervisionMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncounterDetails encounterDetails = (EncounterDetails) o;
    return Objects.equals(this.businessCaptureType, encounterDetails.businessCaptureType) &&
        Objects.equals(this.encounterLocation, encounterDetails.encounterLocation) &&
        Objects.equals(this.encounterTimeStamp, encounterDetails.encounterTimeStamp) &&
        Objects.equals(this.partySystemIdentifier, encounterDetails.partySystemIdentifier) &&
        Objects.equals(this.sourceSystem, encounterDetails.sourceSystem) &&
        Objects.equals(this.sourceSystemTimeStamp, encounterDetails.sourceSystemTimeStamp) &&
        Objects.equals(this.sourceSystemUserId, encounterDetails.sourceSystemUserId) &&
        Objects.equals(this.supervisionMode, encounterDetails.supervisionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessCaptureType, encounterLocation, encounterTimeStamp, partySystemIdentifier, sourceSystem, sourceSystemTimeStamp, sourceSystemUserId, supervisionMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterDetails {\n");
    
    sb.append("    businessCaptureType: ").append(toIndentedString(businessCaptureType)).append("\n");
    sb.append("    encounterLocation: ").append(toIndentedString(encounterLocation)).append("\n");
    sb.append("    encounterTimeStamp: ").append(toIndentedString(encounterTimeStamp)).append("\n");
    sb.append("    partySystemIdentifier: ").append(toIndentedString(partySystemIdentifier)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    sourceSystemTimeStamp: ").append(toIndentedString(sourceSystemTimeStamp)).append("\n");
    sb.append("    sourceSystemUserId: ").append(toIndentedString(sourceSystemUserId)).append("\n");
    sb.append("    supervisionMode: ").append(toIndentedString(supervisionMode)).append("\n");
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

