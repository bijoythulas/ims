package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.EncounterDetails;
import com.identity.ims.api.entity.apiModel.EncounterRegisterDetailsBiometricExternalMatchCriteria;
import com.identity.ims.api.entity.apiModel.PartySystemIdentifier;
import com.identity.ims.api.entity.apiModel.WatchlistEnrolment;


/**
 * Encounter details and control fields to include when posting or registering an encounter with Identity.
 **/
@ApiModel(description = "Encounter details and control fields to include when posting or registering an encounter with Identity.")
public class EncounterRegisterDetails   {
  
  private  EncounterDetails encounterDetails;
  private  String agencyName;
  private  List<EncounterRegisterDetailsBiometricExternalMatchCriteria> biometricExternalMatchCriteria = new ArrayList<>();
  private  Boolean matchBiometricsFlag = true;
  private  PartySystemIdentifier targetPartySystemIdentifier;
  private  Boolean watchlistCheckFlag = false;
  private  WatchlistEnrolment watchlistEnrolment;

  /**
   **/
  public EncounterRegisterDetails encounterDetails(EncounterDetails encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("encounterDetails")
  public EncounterDetails getEncounterDetails() {
    return encounterDetails;
  }
  public void setEncounterDetails(EncounterDetails encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

  /**
   * Name of Agency the encounter provider is associated with.
   **/
  public EncounterRegisterDetails agencyName(String agencyName) {
    this.agencyName = agencyName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of Agency the encounter provider is associated with.")
  @JsonProperty("agencyName")
  public String getAgencyName() {
    return agencyName;
  }
  public void setAgencyName(String agencyName) {
    this.agencyName = agencyName;
  }

  /**
   * Option to provide one or more Biometric External Match Criteria
   **/
  public EncounterRegisterDetails biometricExternalMatchCriteria(List<EncounterRegisterDetailsBiometricExternalMatchCriteria> biometricExternalMatchCriteria) {
    this.biometricExternalMatchCriteria = biometricExternalMatchCriteria;
    return this;
  }

  
  @ApiModelProperty(value = "Option to provide one or more Biometric External Match Criteria")
  @JsonProperty("biometricExternalMatchCriteria")
  public List<EncounterRegisterDetailsBiometricExternalMatchCriteria> getBiometricExternalMatchCriteria() {
    return biometricExternalMatchCriteria;
  }
  public void setBiometricExternalMatchCriteria(List<EncounterRegisterDetailsBiometricExternalMatchCriteria> biometricExternalMatchCriteria) {
    this.biometricExternalMatchCriteria = biometricExternalMatchCriteria;
  }

  /**
   * A flag to perform biometric matching. Most consumers are to leave this set to true regardless of whether biometrics are present or not; specific consumers will set this to be false.
   **/
  public EncounterRegisterDetails matchBiometricsFlag(Boolean matchBiometricsFlag) {
    this.matchBiometricsFlag = matchBiometricsFlag;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A flag to perform biometric matching. Most consumers are to leave this set to true regardless of whether biometrics are present or not; specific consumers will set this to be false.")
  @JsonProperty("matchBiometricsFlag")
  public Boolean getMatchBiometricsFlag() {
    return matchBiometricsFlag;
  }
  public void setMatchBiometricsFlag(Boolean matchBiometricsFlag) {
    this.matchBiometricsFlag = matchBiometricsFlag;
  }

  /**
   **/
  public EncounterRegisterDetails targetPartySystemIdentifier(PartySystemIdentifier targetPartySystemIdentifier) {
    this.targetPartySystemIdentifier = targetPartySystemIdentifier;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targetPartySystemIdentifier")
  public PartySystemIdentifier getTargetPartySystemIdentifier() {
    return targetPartySystemIdentifier;
  }
  public void setTargetPartySystemIdentifier(PartySystemIdentifier targetPartySystemIdentifier) {
    this.targetPartySystemIdentifier = targetPartySystemIdentifier;
  }

  /**
   * A flag to perform watchlist checking. Most consumers are to leave this set to true, specific consumers will set this to be false.
   **/
  public EncounterRegisterDetails watchlistCheckFlag(Boolean watchlistCheckFlag) {
    this.watchlistCheckFlag = watchlistCheckFlag;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A flag to perform watchlist checking. Most consumers are to leave this set to true, specific consumers will set this to be false.")
  @JsonProperty("watchlistCheckFlag")
  public Boolean getWatchlistCheckFlag() {
    return watchlistCheckFlag;
  }
  public void setWatchlistCheckFlag(Boolean watchlistCheckFlag) {
    this.watchlistCheckFlag = watchlistCheckFlag;
  }

  /**
   **/
  public EncounterRegisterDetails watchlistEnrolment(WatchlistEnrolment watchlistEnrolment) {
    this.watchlistEnrolment = watchlistEnrolment;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("watchlistEnrolment")
  public WatchlistEnrolment getWatchlistEnrolment() {
    return watchlistEnrolment;
  }
  public void setWatchlistEnrolment(WatchlistEnrolment watchlistEnrolment) {
    this.watchlistEnrolment = watchlistEnrolment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncounterRegisterDetails encounterRegisterDetails = (EncounterRegisterDetails) o;
    return Objects.equals(this.encounterDetails, encounterRegisterDetails.encounterDetails) &&
        Objects.equals(this.agencyName, encounterRegisterDetails.agencyName) &&
        Objects.equals(this.biometricExternalMatchCriteria, encounterRegisterDetails.biometricExternalMatchCriteria) &&
        Objects.equals(this.matchBiometricsFlag, encounterRegisterDetails.matchBiometricsFlag) &&
        Objects.equals(this.targetPartySystemIdentifier, encounterRegisterDetails.targetPartySystemIdentifier) &&
        Objects.equals(this.watchlistCheckFlag, encounterRegisterDetails.watchlistCheckFlag) &&
        Objects.equals(this.watchlistEnrolment, encounterRegisterDetails.watchlistEnrolment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterDetails, agencyName, biometricExternalMatchCriteria, matchBiometricsFlag, targetPartySystemIdentifier, watchlistCheckFlag, watchlistEnrolment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterRegisterDetails {\n");
    
    sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
    sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
    sb.append("    biometricExternalMatchCriteria: ").append(toIndentedString(biometricExternalMatchCriteria)).append("\n");
    sb.append("    matchBiometricsFlag: ").append(toIndentedString(matchBiometricsFlag)).append("\n");
    sb.append("    targetPartySystemIdentifier: ").append(toIndentedString(targetPartySystemIdentifier)).append("\n");
    sb.append("    watchlistCheckFlag: ").append(toIndentedString(watchlistCheckFlag)).append("\n");
    sb.append("    watchlistEnrolment: ").append(toIndentedString(watchlistEnrolment)).append("\n");
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

