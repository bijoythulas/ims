package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class PersonEncounterDetailsLinks   {
  
  private  String biographics;
  private  String biometrics;
  private  String businessContexts;
  private  String contactMethods;
  private  String documentImages;
  private  String documents;
  private  String facialImages;
  private  String self;

  /**
   * Link to the encounter&#39;s biographics details
   **/
  public PersonEncounterDetailsLinks biographics(String biographics) {
    this.biographics = biographics;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the encounter's biographics details")
  @JsonProperty("biographics")
  public String getBiographics() {
    return biographics;
  }
  public void setBiographics(String biographics) {
    this.biographics = biographics;
  }

  /**
   * Link to the encounter&#39;s biometrics details
   **/
  public PersonEncounterDetailsLinks biometrics(String biometrics) {
    this.biometrics = biometrics;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the encounter's biometrics details")
  @JsonProperty("biometrics")
  public String getBiometrics() {
    return biometrics;
  }
  public void setBiometrics(String biometrics) {
    this.biometrics = biometrics;
  }

  /**
   * Link to the encounter&#39;s business-contexts details
   **/
  public PersonEncounterDetailsLinks businessContexts(String businessContexts) {
    this.businessContexts = businessContexts;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the encounter's business-contexts details")
  @JsonProperty("businessContexts")
  public String getBusinessContexts() {
    return businessContexts;
  }
  public void setBusinessContexts(String businessContexts) {
    this.businessContexts = businessContexts;
  }

  /**
   * Link to the encounter&#39;s contact-methods details
   **/
  public PersonEncounterDetailsLinks contactMethods(String contactMethods) {
    this.contactMethods = contactMethods;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the encounter's contact-methods details")
  @JsonProperty("contactMethods")
  public String getContactMethods() {
    return contactMethods;
  }
  public void setContactMethods(String contactMethods) {
    this.contactMethods = contactMethods;
  }

  /**
   * Link to the encounter&#39;s document-images
   **/
  public PersonEncounterDetailsLinks documentImages(String documentImages) {
    this.documentImages = documentImages;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the encounter's document-images")
  @JsonProperty("documentImages")
  public String getDocumentImages() {
    return documentImages;
  }
  public void setDocumentImages(String documentImages) {
    this.documentImages = documentImages;
  }

  /**
   * Link to the encounter&#39;s document details
   **/
  public PersonEncounterDetailsLinks documents(String documents) {
    this.documents = documents;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the encounter's document details")
  @JsonProperty("documents")
  public String getDocuments() {
    return documents;
  }
  public void setDocuments(String documents) {
    this.documents = documents;
  }

  /**
   * Link to the encounter&#39;s facial-images
   **/
  public PersonEncounterDetailsLinks facialImages(String facialImages) {
    this.facialImages = facialImages;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the encounter's facial-images")
  @JsonProperty("facialImages")
  public String getFacialImages() {
    return facialImages;
  }
  public void setFacialImages(String facialImages) {
    this.facialImages = facialImages;
  }

  /**
   * Link to the current encounter&#39;s resource
   **/
  public PersonEncounterDetailsLinks self(String self) {
    this.self = self;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the current encounter's resource")
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }
  public void setSelf(String self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonEncounterDetailsLinks personEncounterDetailsLinks = (PersonEncounterDetailsLinks) o;
    return Objects.equals(this.biographics, personEncounterDetailsLinks.biographics) &&
        Objects.equals(this.biometrics, personEncounterDetailsLinks.biometrics) &&
        Objects.equals(this.businessContexts, personEncounterDetailsLinks.businessContexts) &&
        Objects.equals(this.contactMethods, personEncounterDetailsLinks.contactMethods) &&
        Objects.equals(this.documentImages, personEncounterDetailsLinks.documentImages) &&
        Objects.equals(this.documents, personEncounterDetailsLinks.documents) &&
        Objects.equals(this.facialImages, personEncounterDetailsLinks.facialImages) &&
        Objects.equals(this.self, personEncounterDetailsLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biographics, biometrics, businessContexts, contactMethods, documentImages, documents, facialImages, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonEncounterDetailsLinks {\n");
    
    sb.append("    biographics: ").append(toIndentedString(biographics)).append("\n");
    sb.append("    biometrics: ").append(toIndentedString(biometrics)).append("\n");
    sb.append("    businessContexts: ").append(toIndentedString(businessContexts)).append("\n");
    sb.append("    contactMethods: ").append(toIndentedString(contactMethods)).append("\n");
    sb.append("    documentImages: ").append(toIndentedString(documentImages)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    facialImages: ").append(toIndentedString(facialImages)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

