package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.EncounterPatchRequestIdentifiers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Encounter details that can be added to an existing encounter.
 **/
@ApiModel(description = "Encounter details that can be added to an existing encounter.")
public class EncounterPatchRequest   {
  
  private  List<EncounterPatchRequestIdentifiers> identifiers = new ArrayList<>();

  /**
   **/
  public EncounterPatchRequest identifiers(List<EncounterPatchRequestIdentifiers> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("identifiers")
  public List<EncounterPatchRequestIdentifiers> getIdentifiers() {
    return identifiers;
  }
  public void setIdentifiers(List<EncounterPatchRequestIdentifiers> identifiers) {
    this.identifiers = identifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncounterPatchRequest encounterPatchRequest = (EncounterPatchRequest) o;
    return Objects.equals(this.identifiers, encounterPatchRequest.identifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterPatchRequest {\n");
    
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
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

