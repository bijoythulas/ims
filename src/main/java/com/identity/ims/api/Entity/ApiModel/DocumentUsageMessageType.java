package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.DocumentUsageMessageTypeMarriageCertificate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class DocumentUsageMessageType   {
  
  private  String additionalDocumentType;
  private  String cardColour;
  private  String individualReferenceNumber;
  private  DocumentUsageMessageTypeMarriageCertificate marriageCertificate;
  private  String nationalIdNumber;
  private  String nationalityOfTheBearer;
  private  String photographIncludedFlag;
  private  String previousFamilyName;
  private  String previousGivenName;
  private  String reasonforNameChange;
  private  String registrationDate;
  private  String registrationMethod;
  private  String scanReference;
  private  String source;
  private  String spouseFamilyName;
  private  String spouseGivenName;
  private  String thirdPartyReason;
  private  String translationFlag;
  private  String translationOrganisation;
  private  String translatorDetails;

  /**
   **/
  public DocumentUsageMessageType additionalDocumentType(String additionalDocumentType) {
    this.additionalDocumentType = additionalDocumentType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("additionalDocumentType")
  public String getAdditionalDocumentType() {
    return additionalDocumentType;
  }
  public void setAdditionalDocumentType(String additionalDocumentType) {
    this.additionalDocumentType = additionalDocumentType;
  }

  /**
   **/
  public DocumentUsageMessageType cardColour(String cardColour) {
    this.cardColour = cardColour;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cardColour")
  public String getCardColour() {
    return cardColour;
  }
  public void setCardColour(String cardColour) {
    this.cardColour = cardColour;
  }

  /**
   **/
  public DocumentUsageMessageType individualReferenceNumber(String individualReferenceNumber) {
    this.individualReferenceNumber = individualReferenceNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("individualReferenceNumber")
  public String getIndividualReferenceNumber() {
    return individualReferenceNumber;
  }
  public void setIndividualReferenceNumber(String individualReferenceNumber) {
    this.individualReferenceNumber = individualReferenceNumber;
  }

  /**
   **/
  public DocumentUsageMessageType marriageCertificate(DocumentUsageMessageTypeMarriageCertificate marriageCertificate) {
    this.marriageCertificate = marriageCertificate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("marriageCertificate")
  public DocumentUsageMessageTypeMarriageCertificate getMarriageCertificate() {
    return marriageCertificate;
  }
  public void setMarriageCertificate(DocumentUsageMessageTypeMarriageCertificate marriageCertificate) {
    this.marriageCertificate = marriageCertificate;
  }

  /**
   **/
  public DocumentUsageMessageType nationalIdNumber(String nationalIdNumber) {
    this.nationalIdNumber = nationalIdNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nationalIdNumber")
  public String getNationalIdNumber() {
    return nationalIdNumber;
  }
  public void setNationalIdNumber(String nationalIdNumber) {
    this.nationalIdNumber = nationalIdNumber;
  }

  /**
   **/
  public DocumentUsageMessageType nationalityOfTheBearer(String nationalityOfTheBearer) {
    this.nationalityOfTheBearer = nationalityOfTheBearer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nationalityOfTheBearer")
  public String getNationalityOfTheBearer() {
    return nationalityOfTheBearer;
  }
  public void setNationalityOfTheBearer(String nationalityOfTheBearer) {
    this.nationalityOfTheBearer = nationalityOfTheBearer;
  }

  /**
   **/
  public DocumentUsageMessageType photographIncludedFlag(String photographIncludedFlag) {
    this.photographIncludedFlag = photographIncludedFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("photographIncludedFlag")
  public String getPhotographIncludedFlag() {
    return photographIncludedFlag;
  }
  public void setPhotographIncludedFlag(String photographIncludedFlag) {
    this.photographIncludedFlag = photographIncludedFlag;
  }

  /**
   **/
  public DocumentUsageMessageType previousFamilyName(String previousFamilyName) {
    this.previousFamilyName = previousFamilyName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("previousFamilyName")
  public String getPreviousFamilyName() {
    return previousFamilyName;
  }
  public void setPreviousFamilyName(String previousFamilyName) {
    this.previousFamilyName = previousFamilyName;
  }

  /**
   **/
  public DocumentUsageMessageType previousGivenName(String previousGivenName) {
    this.previousGivenName = previousGivenName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("previousGivenName")
  public String getPreviousGivenName() {
    return previousGivenName;
  }
  public void setPreviousGivenName(String previousGivenName) {
    this.previousGivenName = previousGivenName;
  }

  /**
   **/
  public DocumentUsageMessageType reasonforNameChange(String reasonforNameChange) {
    this.reasonforNameChange = reasonforNameChange;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("reasonforNameChange")
  public String getReasonforNameChange() {
    return reasonforNameChange;
  }
  public void setReasonforNameChange(String reasonforNameChange) {
    this.reasonforNameChange = reasonforNameChange;
  }

  /**
   **/
  public DocumentUsageMessageType registrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("registrationDate")
  public String getRegistrationDate() {
    return registrationDate;
  }
  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }

  /**
   **/
  public DocumentUsageMessageType registrationMethod(String registrationMethod) {
    this.registrationMethod = registrationMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("registrationMethod")
  public String getRegistrationMethod() {
    return registrationMethod;
  }
  public void setRegistrationMethod(String registrationMethod) {
    this.registrationMethod = registrationMethod;
  }

  /**
   **/
  public DocumentUsageMessageType scanReference(String scanReference) {
    this.scanReference = scanReference;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scanReference")
  public String getScanReference() {
    return scanReference;
  }
  public void setScanReference(String scanReference) {
    this.scanReference = scanReference;
  }

  /**
   **/
  public DocumentUsageMessageType source(String source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   **/
  public DocumentUsageMessageType spouseFamilyName(String spouseFamilyName) {
    this.spouseFamilyName = spouseFamilyName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("spouseFamilyName")
  public String getSpouseFamilyName() {
    return spouseFamilyName;
  }
  public void setSpouseFamilyName(String spouseFamilyName) {
    this.spouseFamilyName = spouseFamilyName;
  }

  /**
   **/
  public DocumentUsageMessageType spouseGivenName(String spouseGivenName) {
    this.spouseGivenName = spouseGivenName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("spouseGivenName")
  public String getSpouseGivenName() {
    return spouseGivenName;
  }
  public void setSpouseGivenName(String spouseGivenName) {
    this.spouseGivenName = spouseGivenName;
  }

  /**
   **/
  public DocumentUsageMessageType thirdPartyReason(String thirdPartyReason) {
    this.thirdPartyReason = thirdPartyReason;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyReason")
  public String getThirdPartyReason() {
    return thirdPartyReason;
  }
  public void setThirdPartyReason(String thirdPartyReason) {
    this.thirdPartyReason = thirdPartyReason;
  }

  /**
   **/
  public DocumentUsageMessageType translationFlag(String translationFlag) {
    this.translationFlag = translationFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translationFlag")
  public String getTranslationFlag() {
    return translationFlag;
  }
  public void setTranslationFlag(String translationFlag) {
    this.translationFlag = translationFlag;
  }

  /**
   **/
  public DocumentUsageMessageType translationOrganisation(String translationOrganisation) {
    this.translationOrganisation = translationOrganisation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translationOrganisation")
  public String getTranslationOrganisation() {
    return translationOrganisation;
  }
  public void setTranslationOrganisation(String translationOrganisation) {
    this.translationOrganisation = translationOrganisation;
  }

  /**
   **/
  public DocumentUsageMessageType translatorDetails(String translatorDetails) {
    this.translatorDetails = translatorDetails;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translatorDetails")
  public String getTranslatorDetails() {
    return translatorDetails;
  }
  public void setTranslatorDetails(String translatorDetails) {
    this.translatorDetails = translatorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUsageMessageType documentUsageMessageType = (DocumentUsageMessageType) o;
    return Objects.equals(this.additionalDocumentType, documentUsageMessageType.additionalDocumentType) &&
        Objects.equals(this.cardColour, documentUsageMessageType.cardColour) &&
        Objects.equals(this.individualReferenceNumber, documentUsageMessageType.individualReferenceNumber) &&
        Objects.equals(this.marriageCertificate, documentUsageMessageType.marriageCertificate) &&
        Objects.equals(this.nationalIdNumber, documentUsageMessageType.nationalIdNumber) &&
        Objects.equals(this.nationalityOfTheBearer, documentUsageMessageType.nationalityOfTheBearer) &&
        Objects.equals(this.photographIncludedFlag, documentUsageMessageType.photographIncludedFlag) &&
        Objects.equals(this.previousFamilyName, documentUsageMessageType.previousFamilyName) &&
        Objects.equals(this.previousGivenName, documentUsageMessageType.previousGivenName) &&
        Objects.equals(this.reasonforNameChange, documentUsageMessageType.reasonforNameChange) &&
        Objects.equals(this.registrationDate, documentUsageMessageType.registrationDate) &&
        Objects.equals(this.registrationMethod, documentUsageMessageType.registrationMethod) &&
        Objects.equals(this.scanReference, documentUsageMessageType.scanReference) &&
        Objects.equals(this.source, documentUsageMessageType.source) &&
        Objects.equals(this.spouseFamilyName, documentUsageMessageType.spouseFamilyName) &&
        Objects.equals(this.spouseGivenName, documentUsageMessageType.spouseGivenName) &&
        Objects.equals(this.thirdPartyReason, documentUsageMessageType.thirdPartyReason) &&
        Objects.equals(this.translationFlag, documentUsageMessageType.translationFlag) &&
        Objects.equals(this.translationOrganisation, documentUsageMessageType.translationOrganisation) &&
        Objects.equals(this.translatorDetails, documentUsageMessageType.translatorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalDocumentType, cardColour, individualReferenceNumber, marriageCertificate, nationalIdNumber, nationalityOfTheBearer, photographIncludedFlag, previousFamilyName, previousGivenName, reasonforNameChange, registrationDate, registrationMethod, scanReference, source, spouseFamilyName, spouseGivenName, thirdPartyReason, translationFlag, translationOrganisation, translatorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUsageMessageType {\n");
    
    sb.append("    additionalDocumentType: ").append(toIndentedString(additionalDocumentType)).append("\n");
    sb.append("    cardColour: ").append(toIndentedString(cardColour)).append("\n");
    sb.append("    individualReferenceNumber: ").append(toIndentedString(individualReferenceNumber)).append("\n");
    sb.append("    marriageCertificate: ").append(toIndentedString(marriageCertificate)).append("\n");
    sb.append("    nationalIdNumber: ").append(toIndentedString(nationalIdNumber)).append("\n");
    sb.append("    nationalityOfTheBearer: ").append(toIndentedString(nationalityOfTheBearer)).append("\n");
    sb.append("    photographIncludedFlag: ").append(toIndentedString(photographIncludedFlag)).append("\n");
    sb.append("    previousFamilyName: ").append(toIndentedString(previousFamilyName)).append("\n");
    sb.append("    previousGivenName: ").append(toIndentedString(previousGivenName)).append("\n");
    sb.append("    reasonforNameChange: ").append(toIndentedString(reasonforNameChange)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    registrationMethod: ").append(toIndentedString(registrationMethod)).append("\n");
    sb.append("    scanReference: ").append(toIndentedString(scanReference)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    spouseFamilyName: ").append(toIndentedString(spouseFamilyName)).append("\n");
    sb.append("    spouseGivenName: ").append(toIndentedString(spouseGivenName)).append("\n");
    sb.append("    thirdPartyReason: ").append(toIndentedString(thirdPartyReason)).append("\n");
    sb.append("    translationFlag: ").append(toIndentedString(translationFlag)).append("\n");
    sb.append("    translationOrganisation: ").append(toIndentedString(translationOrganisation)).append("\n");
    sb.append("    translatorDetails: ").append(toIndentedString(translatorDetails)).append("\n");
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

