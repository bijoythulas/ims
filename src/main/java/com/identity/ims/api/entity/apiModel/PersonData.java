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
import com.identity.ims.api.entity.apiModel.Association;
import com.identity.ims.api.entity.apiModel.BiometricDetail;
import com.identity.ims.api.entity.apiModel.BusinessContext;
import com.identity.ims.api.entity.apiModel.ContactMethod;
import com.identity.ims.api.entity.apiModel.ContextContainer;
import com.identity.ims.api.entity.apiModel.DeclaredCitizenship;
import com.identity.ims.api.entity.apiModel.DocumentDetail;
import com.identity.ims.api.entity.apiModel.EncounterDetails;
import com.identity.ims.api.entity.apiModel.Ethnicity;
import com.identity.ims.api.entity.apiModel.Identifier;
import com.identity.ims.api.entity.apiModel.Language;
import com.identity.ims.api.entity.apiModel.PersonBiographic;
import com.identity.ims.api.entity.apiModel.RelationshipStatus;
import com.identity.ims.api.entity.apiModel.Religion;
import com.identity.ims.api.entity.apiModel.ResidenceCountry;


/**
 * Almost all of an encounter&#39;s details, excluding facial-images and document-images which must be requested separately
 **/
@ApiModel(description = "Almost all of an encounter's details, excluding facial-images and document-images which must be requested separately")
public class PersonData   {
  
  private  List<Association> associations = new ArrayList<>();
  private  List<PersonBiographic> biographics = new ArrayList<>();
  private  List<BiometricDetail> biometrics = new ArrayList<>();
  private  List<BusinessContext> businessContexts = new ArrayList<>();
  private  List<ContactMethod> contactMethods = new ArrayList<>();
  private  List<ContextContainer> contextContainers = new ArrayList<>();
  private  List<DeclaredCitizenship> declaredCitizenships = new ArrayList<>();
  private  List<DocumentDetail> documents = new ArrayList<>();
  private  List<EncounterDetails> encounterDetails = new ArrayList<>();
  private  List<Ethnicity> ethnicities = new ArrayList<>();
  private  List<Identifier> identifiers = new ArrayList<>();
  private  List<Language> languages = new ArrayList<>();
  private  List<RelationshipStatus> relationshipStatuses = new ArrayList<>();
  private  List<Religion> religions = new ArrayList<>();
  private  List<ResidenceCountry> residenceCountries = new ArrayList<>();

  /**
   * Person associations details
   **/
  public PersonData associations(List<Association> associations) {
    this.associations = associations;
    return this;
  }

  
  @ApiModelProperty(value = "Person associations details")
  @JsonProperty("associations")
  public List<Association> getAssociations() {
    return associations;
  }
  public void setAssociations(List<Association> associations) {
    this.associations = associations;
  }

  /**
   * Encounter biographics details
   **/
  public PersonData biographics(List<PersonBiographic> biographics) {
    this.biographics = biographics;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter biographics details")
  @JsonProperty("biographics")
  public List<PersonBiographic> getBiographics() {
    return biographics;
  }
  public void setBiographics(List<PersonBiographic> biographics) {
    this.biographics = biographics;
  }

  /**
   * Encounter biometrics details about facial-images or fingerprint-images
   **/
  public PersonData biometrics(List<BiometricDetail> biometrics) {
    this.biometrics = biometrics;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter biometrics details about facial-images or fingerprint-images")
  @JsonProperty("biometrics")
  public List<BiometricDetail> getBiometrics() {
    return biometrics;
  }
  public void setBiometrics(List<BiometricDetail> biometrics) {
    this.biometrics = biometrics;
  }

  /**
   * Encounter business-contexts details
   **/
  public PersonData businessContexts(List<BusinessContext> businessContexts) {
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
  public PersonData contactMethods(List<ContactMethod> contactMethods) {
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
  public PersonData contextContainers(List<ContextContainer> contextContainers) {
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
  public PersonData declaredCitizenships(List<DeclaredCitizenship> declaredCitizenships) {
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
   * Encounter documents details
   **/
  public PersonData documents(List<DocumentDetail> documents) {
    this.documents = documents;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter documents details")
  @JsonProperty("documents")
  public List<DocumentDetail> getDocuments() {
    return documents;
  }
  public void setDocuments(List<DocumentDetail> documents) {
    this.documents = documents;
  }

  /**
   * Encounter core details
   **/
  public PersonData encounterDetails(List<EncounterDetails> encounterDetails) {
    this.encounterDetails = encounterDetails;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter core details")
  @JsonProperty("encounterDetails")
  public List<EncounterDetails> getEncounterDetails() {
    return encounterDetails;
  }
  public void setEncounterDetails(List<EncounterDetails> encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

  /**
   * Encounter ethnicities details
   **/
  public PersonData ethnicities(List<Ethnicity> ethnicities) {
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
   * Identifiers recorded with an encounter
   **/
  public PersonData identifiers(List<Identifier> identifiers) {
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
   * Encounter languages details
   **/
  public PersonData languages(List<Language> languages) {
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
  public PersonData relationshipStatuses(List<RelationshipStatus> relationshipStatuses) {
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
  public PersonData religions(List<Religion> religions) {
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
   * Encounter residence countries details
   **/
  public PersonData residenceCountries(List<ResidenceCountry> residenceCountries) {
    this.residenceCountries = residenceCountries;
    return this;
  }

  
  @ApiModelProperty(value = "Encounter residence countries details")
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
    PersonData personData = (PersonData) o;
    return Objects.equals(this.associations, personData.associations) &&
        Objects.equals(this.biographics, personData.biographics) &&
        Objects.equals(this.biometrics, personData.biometrics) &&
        Objects.equals(this.businessContexts, personData.businessContexts) &&
        Objects.equals(this.contactMethods, personData.contactMethods) &&
        Objects.equals(this.contextContainers, personData.contextContainers) &&
        Objects.equals(this.declaredCitizenships, personData.declaredCitizenships) &&
        Objects.equals(this.documents, personData.documents) &&
        Objects.equals(this.encounterDetails, personData.encounterDetails) &&
        Objects.equals(this.ethnicities, personData.ethnicities) &&
        Objects.equals(this.identifiers, personData.identifiers) &&
        Objects.equals(this.languages, personData.languages) &&
        Objects.equals(this.relationshipStatuses, personData.relationshipStatuses) &&
        Objects.equals(this.religions, personData.religions) &&
        Objects.equals(this.residenceCountries, personData.residenceCountries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associations, biographics, biometrics, businessContexts, contactMethods, contextContainers, declaredCitizenships, documents, encounterDetails, ethnicities, identifiers, languages, relationshipStatuses, religions, residenceCountries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonData {\n");
    
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    biographics: ").append(toIndentedString(biographics)).append("\n");
    sb.append("    biometrics: ").append(toIndentedString(biometrics)).append("\n");
    sb.append("    businessContexts: ").append(toIndentedString(businessContexts)).append("\n");
    sb.append("    contactMethods: ").append(toIndentedString(contactMethods)).append("\n");
    sb.append("    contextContainers: ").append(toIndentedString(contextContainers)).append("\n");
    sb.append("    declaredCitizenships: ").append(toIndentedString(declaredCitizenships)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
    sb.append("    ethnicities: ").append(toIndentedString(ethnicities)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
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

