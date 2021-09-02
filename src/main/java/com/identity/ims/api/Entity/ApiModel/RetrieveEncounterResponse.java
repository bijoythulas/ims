package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.PersonData;
import com.identity.ims.api.Entity.ApiModel.PersonEncounterDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class RetrieveEncounterResponse   {
  
  private  String encounterId;
  private  String personId;

public enum EncounterStatusEnum {

    PENDING(String.valueOf("PENDING")), IN_DOUBT(String.valueOf("IN_DOUBT")), RESOLVED(String.valueOf("RESOLVED")), ICT_RESOLUTION(String.valueOf("ICT_RESOLUTION")), OF_CONCERN(String.valueOf("OF_CONCERN")), IMPOSTER(String.valueOf("IMPOSTER")), DELETED(String.valueOf("DELETED"));


    private String value;

    EncounterStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static EncounterStatusEnum fromValue(String value) {
        for (EncounterStatusEnum b : EncounterStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private  EncounterStatusEnum encounterStatus;
  private  PersonData personData;
  private  PersonEncounterDetails personEncounterDetails;

  /**
   * This is the unique encounter resource id
   **/
  public RetrieveEncounterResponse encounterId(String encounterId) {
    this.encounterId = encounterId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "This is the unique encounter resource id")
  @JsonProperty("encounterId")
  public String getEncounterId() {
    return encounterId;
  }
  public void setEncounterId(String encounterId) {
    this.encounterId = encounterId;
  }

  /**
   * This is the identifier for the person that this encounter is linked to
   **/
  public RetrieveEncounterResponse personId(String personId) {
    this.personId = personId;
    return this;
  }

  
  @ApiModelProperty(value = "This is the identifier for the person that this encounter is linked to")
  @JsonProperty("personId")
  public String getPersonId() {
    return personId;
  }
  public void setPersonId(String personId) {
    this.personId = personId;
  }

  /**
   * This is the current status of the encounter
   **/
  public RetrieveEncounterResponse encounterStatus(EncounterStatusEnum encounterStatus) {
    this.encounterStatus = encounterStatus;
    return this;
  }

  
  @ApiModelProperty(value = "This is the current status of the encounter")
  @JsonProperty("encounterStatus")
  public EncounterStatusEnum getEncounterStatus() {
    return encounterStatus;
  }
  public void setEncounterStatus(EncounterStatusEnum encounterStatus) {
    this.encounterStatus = encounterStatus;
  }

  /**
   **/
  public RetrieveEncounterResponse personData(PersonData personData) {
    this.personData = personData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("personData")
  public PersonData getPersonData() {
    return personData;
  }
  public void setPersonData(PersonData personData) {
    this.personData = personData;
  }

  /**
   **/
  public RetrieveEncounterResponse personEncounterDetails(PersonEncounterDetails personEncounterDetails) {
    this.personEncounterDetails = personEncounterDetails;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("personEncounterDetails")
  public PersonEncounterDetails getPersonEncounterDetails() {
    return personEncounterDetails;
  }
  public void setPersonEncounterDetails(PersonEncounterDetails personEncounterDetails) {
    this.personEncounterDetails = personEncounterDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveEncounterResponse retrieveEncounterResponse = (RetrieveEncounterResponse) o;
    return Objects.equals(this.encounterId, retrieveEncounterResponse.encounterId) &&
        Objects.equals(this.personId, retrieveEncounterResponse.personId) &&
        Objects.equals(this.encounterStatus, retrieveEncounterResponse.encounterStatus) &&
        Objects.equals(this.personData, retrieveEncounterResponse.personData) &&
        Objects.equals(this.personEncounterDetails, retrieveEncounterResponse.personEncounterDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterId, personId, encounterStatus, personData, personEncounterDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEncounterResponse {\n");
    
    sb.append("    encounterId: ").append(toIndentedString(encounterId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    encounterStatus: ").append(toIndentedString(encounterStatus)).append("\n");
    sb.append("    personData: ").append(toIndentedString(personData)).append("\n");
    sb.append("    personEncounterDetails: ").append(toIndentedString(personEncounterDetails)).append("\n");
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

