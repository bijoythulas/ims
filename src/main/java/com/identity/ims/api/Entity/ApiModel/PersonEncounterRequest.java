package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.BusinessContext;
import com.identity.ims.api.Entity.ApiModel.ContactMethod;
import com.identity.ims.api.Entity.ApiModel.ContextContainer;
import com.identity.ims.api.Entity.ApiModel.DeclaredCitizenship;
import com.identity.ims.api.Entity.ApiModel.Ethnicity;
import com.identity.ims.api.Entity.ApiModel.Language;
import com.identity.ims.api.Entity.ApiModel.PersonBiographic;
import com.identity.ims.api.Entity.ApiModel.PersonBiometric;
import com.identity.ims.api.Entity.ApiModel.RegisterDocument;
import com.identity.ims.api.Entity.ApiModel.RelationshipStatus;
import com.identity.ims.api.Entity.ApiModel.Religion;
import com.identity.ims.api.Entity.ApiModel.ResidenceCountry;
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
 * These are the encounter details (including images) that can be posted with an encounter
 **/
@ApiModel(description = "These are the encounter details (including images) that can be posted with an encounter")
public class PersonEncounterRequest   {
  
  private  List<PersonBiographic> biographics = new ArrayList<>();
  private  List<PersonBiometric> biometrics = new ArrayList<>();
  private  List<BusinessContext> businessContexts = new ArrayList<>();
  private  List<ContactMethod> contactMethods = new ArrayList<>();
  private  List<ContextContainer> contextContainers = new ArrayList<>();
  private  List<DeclaredCitizenship> declaredCitizenships = new ArrayList<>();
  private  List<RegisterDocument> documents = new ArrayList<>();
  private  List<Ethnicity> ethnicities = new ArrayList<>();
  private  List<Language> languages = new ArrayList<>();
  private  List<RelationshipStatus> relationshipStatuses = new ArrayList<>();
  private  List<Religion> religions = new ArrayList<>();
  private  List<ResidenceCountry> residenceCountries = new ArrayList<>();

  /**
   * Encounter biographics details
   **/
  public PersonEncounterRequest biographics(List<PersonBiographic> biographics) {
    this.biographics = biographics;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Encounter biographics details")
  @JsonProperty("biographics")
  public List<PersonBiographic> getBiographics() {
    return biographics;
  }
  public void setBiographics(List<PersonBiographic> biographics) {
    this.biographics = biographics;
  }

  /**
   * Encounter biometrics, can be facial-images and or fingerprint-images
   **/
  public PersonEncounterRequest biometrics(List<PersonBiometric> biometrics) {
    this.biometrics = biometrics;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter biometrics, can be facial-images and or fingerprint-images")
  @JsonProperty("biometrics")
  public List<PersonBiometric> getBiometrics() {
    return biometrics;
  }
  public void setBiometrics(List<PersonBiometric> biometrics) {
    this.biometrics = biometrics;
  }

  /**
   * Encounter business-contexts details
   **/
  public PersonEncounterRequest businessContexts(List<BusinessContext> businessContexts) {
    this.businessContexts = businessContexts;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter business-contexts details")
  @JsonProperty("businessContexts")
  public List<BusinessContext> getBusinessContexts() {
    return businessContexts;
  }
  public void setBusinessContexts(List<BusinessContext> businessContexts) {
    this.businessContexts = businessContexts;
  }

  /**
   * Encounter contact-methods details
   **/
  public PersonEncounterRequest contactMethods(List<ContactMethod> contactMethods) {
    this.contactMethods = contactMethods;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter contact-methods details")
  @JsonProperty("contactMethods")
  public List<ContactMethod> getContactMethods() {
    return contactMethods;
  }
  public void setContactMethods(List<ContactMethod> contactMethods) {
    this.contactMethods = contactMethods;
  }

  /**
   * Encounter context-containers details
   **/
  public PersonEncounterRequest contextContainers(List<ContextContainer> contextContainers) {
    this.contextContainers = contextContainers;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter context-containers details")
  @JsonProperty("contextContainers")
  public List<ContextContainer> getContextContainers() {
    return contextContainers;
  }
  public void setContextContainers(List<ContextContainer> contextContainers) {
    this.contextContainers = contextContainers;
  }

  /**
   * Encounter declared-citizenships details
   **/
  public PersonEncounterRequest declaredCitizenships(List<DeclaredCitizenship> declaredCitizenships) {
    this.declaredCitizenships = declaredCitizenships;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter declared-citizenships details")
  @JsonProperty("declaredCitizenships")
  public List<DeclaredCitizenship> getDeclaredCitizenships() {
    return declaredCitizenships;
  }
  public void setDeclaredCitizenships(List<DeclaredCitizenship> declaredCitizenships) {
    this.declaredCitizenships = declaredCitizenships;
  }

  /**
   * Encounter documents details and images
   **/
  public PersonEncounterRequest documents(List<RegisterDocument> documents) {
    this.documents = documents;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter documents details and images")
  @JsonProperty("documents")
  public List<RegisterDocument> getDocuments() {
    return documents;
  }
  public void setDocuments(List<RegisterDocument> documents) {
    this.documents = documents;
  }

  /**
   * Encounter ethnicities details
   **/
  public PersonEncounterRequest ethnicities(List<Ethnicity> ethnicities) {
    this.ethnicities = ethnicities;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter ethnicities details")
  @JsonProperty("ethnicities")
  public List<Ethnicity> getEthnicities() {
    return ethnicities;
  }
  public void setEthnicities(List<Ethnicity> ethnicities) {
    this.ethnicities = ethnicities;
  }

  /**
   * Encounter languages details
   **/
  public PersonEncounterRequest languages(List<Language> languages) {
    this.languages = languages;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter languages details")
  @JsonProperty("languages")
  public List<Language> getLanguages() {
    return languages;
  }
  public void setLanguages(List<Language> languages) {
    this.languages = languages;
  }

  /**
   * Encounter relationship-statuses details
   **/
  public PersonEncounterRequest relationshipStatuses(List<RelationshipStatus> relationshipStatuses) {
    this.relationshipStatuses = relationshipStatuses;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter relationship-statuses details")
  @JsonProperty("relationshipStatuses")
  public List<RelationshipStatus> getRelationshipStatuses() {
    return relationshipStatuses;
  }
  public void setRelationshipStatuses(List<RelationshipStatus> relationshipStatuses) {
    this.relationshipStatuses = relationshipStatuses;
  }

  /**
   * Encounter religions details
   **/
  public PersonEncounterRequest religions(List<Religion> religions) {
    this.religions = religions;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter religions details")
  @JsonProperty("religions")
  public List<Religion> getReligions() {
    return religions;
  }
  public void setReligions(List<Religion> religions) {
    this.religions = religions;
  }

  /**
   * Encounter residence-countries details
   **/
  public PersonEncounterRequest residenceCountries(List<ResidenceCountry> residenceCountries) {
    this.residenceCountries = residenceCountries;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter residence-countries details")
  @JsonProperty("residenceCountries")
  public List<ResidenceCountry> getResidenceCountries() {
    return residenceCountries;
  }
  public void setResidenceCountries(List<ResidenceCountry> residenceCountries) {
    this.residenceCountries = residenceCountries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonEncounterRequest personEncounterRequest = (PersonEncounterRequest) o;
    return Objects.equals(this.biographics, personEncounterRequest.biographics) &&
        Objects.equals(this.biometrics, personEncounterRequest.biometrics) &&
        Objects.equals(this.businessContexts, personEncounterRequest.businessContexts) &&
        Objects.equals(this.contactMethods, personEncounterRequest.contactMethods) &&
        Objects.equals(this.contextContainers, personEncounterRequest.contextContainers) &&
        Objects.equals(this.declaredCitizenships, personEncounterRequest.declaredCitizenships) &&
        Objects.equals(this.documents, personEncounterRequest.documents) &&
        Objects.equals(this.ethnicities, personEncounterRequest.ethnicities) &&
        Objects.equals(this.languages, personEncounterRequest.languages) &&
        Objects.equals(this.relationshipStatuses, personEncounterRequest.relationshipStatuses) &&
        Objects.equals(this.religions, personEncounterRequest.religions) &&
        Objects.equals(this.residenceCountries, personEncounterRequest.residenceCountries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biographics, biometrics, businessContexts, contactMethods, contextContainers, declaredCitizenships, documents, ethnicities, languages, relationshipStatuses, religions, residenceCountries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonEncounterRequest {\n");
    
    sb.append("    biographics: ").append(toIndentedString(biographics)).append("\n");
    sb.append("    biometrics: ").append(toIndentedString(biometrics)).append("\n");
    sb.append("    businessContexts: ").append(toIndentedString(businessContexts)).append("\n");
    sb.append("    contactMethods: ").append(toIndentedString(contactMethods)).append("\n");
    sb.append("    contextContainers: ").append(toIndentedString(contextContainers)).append("\n");
    sb.append("    declaredCitizenships: ").append(toIndentedString(declaredCitizenships)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    ethnicities: ").append(toIndentedString(ethnicities)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    relationshipStatuses: ").append(toIndentedString(relationshipStatuses)).append("\n");
    sb.append("    religions: ").append(toIndentedString(religions)).append("\n");
    sb.append("    residenceCountries: ").append(toIndentedString(residenceCountries)).append("\n");
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

