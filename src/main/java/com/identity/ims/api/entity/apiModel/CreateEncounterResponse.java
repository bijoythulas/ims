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
import com.identity.ims.api.entity.apiModel.FacialImageIdentifier;



public class CreateEncounterResponse   {
  
  private  String encounterId;
  private  List<FacialImageIdentifier> facialImageIdentifiers = new ArrayList<>();

  /**
   * Unique encounter resource Identifier
   **/
  public CreateEncounterResponse encounterId(String encounterId) {
    this.encounterId = encounterId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique encounter resource Identifier")
  @JsonProperty("encounterId")
  public String getEncounterId() {
    return encounterId;
  }
  public void setEncounterId(String encounterId) {
    this.encounterId = encounterId;
  }

  /**
   * Face-image identifiers
   **/
  public CreateEncounterResponse facialImageIdentifiers(List<FacialImageIdentifier> facialImageIdentifiers) {
    this.facialImageIdentifiers = facialImageIdentifiers;
    return this;
  }

  
  @ApiModelProperty(value = "Face-image identifiers")
  @JsonProperty("facialImageIdentifiers")
  public List<FacialImageIdentifier> getFacialImageIdentifiers() {
    return facialImageIdentifiers;
  }
  public void setFacialImageIdentifiers(List<FacialImageIdentifier> facialImageIdentifiers) {
    this.facialImageIdentifiers = facialImageIdentifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEncounterResponse createEncounterResponse = (CreateEncounterResponse) o;
    return Objects.equals(this.encounterId, createEncounterResponse.encounterId) &&
        Objects.equals(this.facialImageIdentifiers, createEncounterResponse.facialImageIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterId, facialImageIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEncounterResponse {\n");
    
    sb.append("    encounterId: ").append(toIndentedString(encounterId)).append("\n");
    sb.append("    facialImageIdentifiers: ").append(toIndentedString(facialImageIdentifiers)).append("\n");
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

