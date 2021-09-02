package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.Biographic;
import com.identity.ims.api.Entity.ApiModel.EncounterDetails;
import com.identity.ims.api.Entity.ApiModel.Identifier;
import com.identity.ims.api.Entity.ApiModel.PersonEncounterDetailsLinks;
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
 * Encounter core details
 **/
@ApiModel(description = "Encounter core details")
public class PersonEncounterDetails   {
  
  private  EncounterDetails encounterDetails;
  private  List<Biographic> biographics = new ArrayList<>();
  private  List<Identifier> identifiers = new ArrayList<>();
  private  PersonEncounterDetailsLinks links;

  /**
   **/
  public PersonEncounterDetails encounterDetails(EncounterDetails encounterDetails) {
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
   * Encounter biographics details
   **/
  public PersonEncounterDetails biographics(List<Biographic> biographics) {
    this.biographics = biographics;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter biographics details")
  @JsonProperty("biographics")
  public List<Biographic> getBiographics() {
    return biographics;
  }
  public void setBiographics(List<Biographic> biographics) {
    this.biographics = biographics;
  }

  /**
   * Identifiers recorded with an encounter
   **/
  public PersonEncounterDetails identifiers(List<Identifier> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  
  @ApiModelProperty(value = "Identifiers recorded with an encounter")
  @JsonProperty("identifiers")
  public List<Identifier> getIdentifiers() {
    return identifiers;
  }
  public void setIdentifiers(List<Identifier> identifiers) {
    this.identifiers = identifiers;
  }

  /**
   **/
  public PersonEncounterDetails links(PersonEncounterDetailsLinks links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("links")
  public PersonEncounterDetailsLinks getLinks() {
    return links;
  }
  public void setLinks(PersonEncounterDetailsLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonEncounterDetails personEncounterDetails = (PersonEncounterDetails) o;
    return Objects.equals(this.encounterDetails, personEncounterDetails.encounterDetails) &&
        Objects.equals(this.biographics, personEncounterDetails.biographics) &&
        Objects.equals(this.identifiers, personEncounterDetails.identifiers) &&
        Objects.equals(this.links, personEncounterDetails.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encounterDetails, biographics, identifiers, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonEncounterDetails {\n");
    
    sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
    sb.append("    biographics: ").append(toIndentedString(biographics)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

