package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.EncounterRegisterDetails;
import com.identity.ims.api.Entity.ApiModel.PersonEncounterRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Details to be registered or posted when recording an encounter
 **/
@ApiModel(description = "Details to be registered or posted when recording an encounter")
public class EncounterRequest   {
  
  private  EncounterRegisterDetails encounterRegisterDetails;
  private  PersonEncounterRequest personDetails;

  /**
   **/
  public EncounterRequest encounterRegisterDetails(EncounterRegisterDetails encounterRegisterDetails) {
    this.encounterRegisterDetails = encounterRegisterDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("encounterRegisterDetails")
  public EncounterRegisterDetails getEncounterRegisterDetails() {
    return encounterRegisterDetails;
  }
  public void setEncounterRegisterDetails(EncounterRegisterDetails encounterRegisterDetails) {
    this.encounterRegisterDetails = encounterRegisterDetails;
  }

  /**
   **/
  public EncounterRequest personDetails(PersonEncounterRequest personDetails) {
    this.personDetails = personDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("personDetails")
  public PersonEncounterRequest getPersonDetails() {
    return personDetails;
  }
  public void setPersonDetails(PersonEncounterRequest personDetails) {
    this.personDetails = personDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncounterRequest encounterRequest = (EncounterRequest) o;
    return Objects.equals(this.encounterRegisterDetails, encounterRequest.encounterRegisterDetails) &&
        Objects.equals(this.personDetails, encounterRequest.personDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterRegisterDetails, personDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterRequest {\n");
    
    sb.append("    encounterRegisterDetails: ").append(toIndentedString(encounterRegisterDetails)).append("\n");
    sb.append("    personDetails: ").append(toIndentedString(personDetails)).append("\n");
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

