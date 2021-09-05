package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.BiographicAcquisitionMethod;
import com.identity.ims.api.entity.apiModel.Country;
import com.identity.ims.api.entity.apiModel.DocumentBiographic;
import com.identity.ims.api.entity.apiModel.DocumentCertificate;
import com.identity.ims.api.entity.apiModel.DocumentEvent;
import com.identity.ims.api.entity.apiModel.DocumentUsageMessageType;
import com.identity.ims.api.entity.apiModel.DocumentVerification;



public class DocumentDetail   {
  
  private  String additionalDocumentType;
  private  BiographicAcquisitionMethod biographicAcquisitionMethod;
  private  List<DocumentBiographic> documentBiographics = new ArrayList<>();
  private  List<DocumentCertificate> documentCertificates = new ArrayList<>();

public enum DocumentCertificationTypeEnum {

    CERTIFIED_COPY(String.valueOf("CERTIFIED_COPY")), COPY(String.valueOf("COPY")), ORIGINAL(String.valueOf("ORIGINAL")), OTHER(String.valueOf("OTHER"));


    private String value;

    DocumentCertificationTypeEnum (String v) {
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
    public static DocumentCertificationTypeEnum fromValue(String value) {
        for (DocumentCertificationTypeEnum b : DocumentCertificationTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private  DocumentCertificationTypeEnum documentCertificationType;
  private  List<DocumentEvent> documentEvents = new ArrayList<>();
  private  String documentNumber;
  private  String documentStatusCode;
  private  String documentType;
  private  String documentUsageType;
  private  DocumentUsageMessageType documentUsageMessageType;
  private  List<DocumentVerification> documentVerifications = new ArrayList<>();
  private  String documentVersion;
  private  LocalDate expiryDate;
  private  LocalDate issueDate;
  private  String issuerName;
  private  Country issuingCountry;
  private  String issuingStateProvince;
  private  Boolean photoIncludedFlag;
  private  String scanReference;
  private  Boolean translationFlag;
  private  String translationOrganisationCode;

  /**
   **/
  public DocumentDetail additionalDocumentType(String additionalDocumentType) {
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
  public DocumentDetail biographicAcquisitionMethod(BiographicAcquisitionMethod biographicAcquisitionMethod) {
    this.biographicAcquisitionMethod = biographicAcquisitionMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("biographicAcquisitionMethod")
  public BiographicAcquisitionMethod getBiographicAcquisitionMethod() {
    return biographicAcquisitionMethod;
  }
  public void setBiographicAcquisitionMethod(BiographicAcquisitionMethod biographicAcquisitionMethod) {
    this.biographicAcquisitionMethod = biographicAcquisitionMethod;
  }

  /**
   **/
  public DocumentDetail documentBiographics(List<DocumentBiographic> documentBiographics) {
    this.documentBiographics = documentBiographics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documentBiographics")
  public List<DocumentBiographic> getDocumentBiographics() {
    return documentBiographics;
  }
  public void setDocumentBiographics(List<DocumentBiographic> documentBiographics) {
    this.documentBiographics = documentBiographics;
  }

  /**
   **/
  public DocumentDetail documentCertificates(List<DocumentCertificate> documentCertificates) {
    this.documentCertificates = documentCertificates;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documentCertificates")
  public List<DocumentCertificate> getDocumentCertificates() {
    return documentCertificates;
  }
  public void setDocumentCertificates(List<DocumentCertificate> documentCertificates) {
    this.documentCertificates = documentCertificates;
  }

  /**
   **/
  public DocumentDetail documentCertificationType(DocumentCertificationTypeEnum documentCertificationType) {
    this.documentCertificationType = documentCertificationType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documentCertificationType")
  public DocumentCertificationTypeEnum getDocumentCertificationType() {
    return documentCertificationType;
  }
  public void setDocumentCertificationType(DocumentCertificationTypeEnum documentCertificationType) {
    this.documentCertificationType = documentCertificationType;
  }

  /**
   **/
  public DocumentDetail documentEvents(List<DocumentEvent> documentEvents) {
    this.documentEvents = documentEvents;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documentEvents")
  public List<DocumentEvent> getDocumentEvents() {
    return documentEvents;
  }
  public void setDocumentEvents(List<DocumentEvent> documentEvents) {
    this.documentEvents = documentEvents;
  }

  /**
   **/
  public DocumentDetail documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("documentNumber")
  public String getDocumentNumber() {
    return documentNumber;
  }
  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  /**
   **/
  public DocumentDetail documentStatusCode(String documentStatusCode) {
    this.documentStatusCode = documentStatusCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("documentStatusCode")
  public String getDocumentStatusCode() {
    return documentStatusCode;
  }
  public void setDocumentStatusCode(String documentStatusCode) {
    this.documentStatusCode = documentStatusCode;
  }

  /**
   **/
  public DocumentDetail documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("documentType")
  public String getDocumentType() {
    return documentType;
  }
  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  /**
   **/
  public DocumentDetail documentUsageType(String documentUsageType) {
    this.documentUsageType = documentUsageType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documentUsageType")
  public String getDocumentUsageType() {
    return documentUsageType;
  }
  public void setDocumentUsageType(String documentUsageType) {
    this.documentUsageType = documentUsageType;
  }

  /**
   **/
  public DocumentDetail documentUsageMessageType(DocumentUsageMessageType documentUsageMessageType) {
    this.documentUsageMessageType = documentUsageMessageType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documentUsageMessageType")
  public DocumentUsageMessageType getDocumentUsageMessageType() {
    return documentUsageMessageType;
  }
  public void setDocumentUsageMessageType(DocumentUsageMessageType documentUsageMessageType) {
    this.documentUsageMessageType = documentUsageMessageType;
  }

  /**
   **/
  public DocumentDetail documentVerifications(List<DocumentVerification> documentVerifications) {
    this.documentVerifications = documentVerifications;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documentVerifications")
  public List<DocumentVerification> getDocumentVerifications() {
    return documentVerifications;
  }
  public void setDocumentVerifications(List<DocumentVerification> documentVerifications) {
    this.documentVerifications = documentVerifications;
  }

  /**
   **/
  public DocumentDetail documentVersion(String documentVersion) {
    this.documentVersion = documentVersion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documentVersion")
  public String getDocumentVersion() {
    return documentVersion;
  }
  public void setDocumentVersion(String documentVersion) {
    this.documentVersion = documentVersion;
  }

  /**
   **/
  public DocumentDetail expiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("expiryDate")
  public LocalDate getExpiryDate() {
    return expiryDate;
  }
  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  /**
   **/
  public DocumentDetail issueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("issueDate")
  public LocalDate getIssueDate() {
    return issueDate;
  }
  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  /**
   **/
  public DocumentDetail issuerName(String issuerName) {
    this.issuerName = issuerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("issuerName")
  public String getIssuerName() {
    return issuerName;
  }
  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }

  /**
   **/
  public DocumentDetail issuingCountry(Country issuingCountry) {
    this.issuingCountry = issuingCountry;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("issuingCountry")
  public Country getIssuingCountry() {
    return issuingCountry;
  }
  public void setIssuingCountry(Country issuingCountry) {
    this.issuingCountry = issuingCountry;
  }

  /**
   **/
  public DocumentDetail issuingStateProvince(String issuingStateProvince) {
    this.issuingStateProvince = issuingStateProvince;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("issuingStateProvince")
  public String getIssuingStateProvince() {
    return issuingStateProvince;
  }
  public void setIssuingStateProvince(String issuingStateProvince) {
    this.issuingStateProvince = issuingStateProvince;
  }

  /**
   **/
  public DocumentDetail photoIncludedFlag(Boolean photoIncludedFlag) {
    this.photoIncludedFlag = photoIncludedFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("photoIncludedFlag")
  public Boolean getPhotoIncludedFlag() {
    return photoIncludedFlag;
  }
  public void setPhotoIncludedFlag(Boolean photoIncludedFlag) {
    this.photoIncludedFlag = photoIncludedFlag;
  }

  /**
   **/
  public DocumentDetail scanReference(String scanReference) {
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
  public DocumentDetail translationFlag(Boolean translationFlag) {
    this.translationFlag = translationFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translationFlag")
  public Boolean getTranslationFlag() {
    return translationFlag;
  }
  public void setTranslationFlag(Boolean translationFlag) {
    this.translationFlag = translationFlag;
  }

  /**
   **/
  public DocumentDetail translationOrganisationCode(String translationOrganisationCode) {
    this.translationOrganisationCode = translationOrganisationCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("translationOrganisationCode")
  public String getTranslationOrganisationCode() {
    return translationOrganisationCode;
  }
  public void setTranslationOrganisationCode(String translationOrganisationCode) {
    this.translationOrganisationCode = translationOrganisationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentDetail documentDetail = (DocumentDetail) o;
    return Objects.equals(this.additionalDocumentType, documentDetail.additionalDocumentType) &&
        Objects.equals(this.biographicAcquisitionMethod, documentDetail.biographicAcquisitionMethod) &&
        Objects.equals(this.documentBiographics, documentDetail.documentBiographics) &&
        Objects.equals(this.documentCertificates, documentDetail.documentCertificates) &&
        Objects.equals(this.documentCertificationType, documentDetail.documentCertificationType) &&
        Objects.equals(this.documentEvents, documentDetail.documentEvents) &&
        Objects.equals(this.documentNumber, documentDetail.documentNumber) &&
        Objects.equals(this.documentStatusCode, documentDetail.documentStatusCode) &&
        Objects.equals(this.documentType, documentDetail.documentType) &&
        Objects.equals(this.documentUsageType, documentDetail.documentUsageType) &&
        Objects.equals(this.documentUsageMessageType, documentDetail.documentUsageMessageType) &&
        Objects.equals(this.documentVerifications, documentDetail.documentVerifications) &&
        Objects.equals(this.documentVersion, documentDetail.documentVersion) &&
        Objects.equals(this.expiryDate, documentDetail.expiryDate) &&
        Objects.equals(this.issueDate, documentDetail.issueDate) &&
        Objects.equals(this.issuerName, documentDetail.issuerName) &&
        Objects.equals(this.issuingCountry, documentDetail.issuingCountry) &&
        Objects.equals(this.issuingStateProvince, documentDetail.issuingStateProvince) &&
        Objects.equals(this.photoIncludedFlag, documentDetail.photoIncludedFlag) &&
        Objects.equals(this.scanReference, documentDetail.scanReference) &&
        Objects.equals(this.translationFlag, documentDetail.translationFlag) &&
        Objects.equals(this.translationOrganisationCode, documentDetail.translationOrganisationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalDocumentType, biographicAcquisitionMethod, documentBiographics, documentCertificates, documentCertificationType, documentEvents, documentNumber, documentStatusCode, documentType, documentUsageType, documentUsageMessageType, documentVerifications, documentVersion, expiryDate, issueDate, issuerName, issuingCountry, issuingStateProvince, photoIncludedFlag, scanReference, translationFlag, translationOrganisationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentDetail {\n");
    
    sb.append("    additionalDocumentType: ").append(toIndentedString(additionalDocumentType)).append("\n");
    sb.append("    biographicAcquisitionMethod: ").append(toIndentedString(biographicAcquisitionMethod)).append("\n");
    sb.append("    documentBiographics: ").append(toIndentedString(documentBiographics)).append("\n");
    sb.append("    documentCertificates: ").append(toIndentedString(documentCertificates)).append("\n");
    sb.append("    documentCertificationType: ").append(toIndentedString(documentCertificationType)).append("\n");
    sb.append("    documentEvents: ").append(toIndentedString(documentEvents)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    documentStatusCode: ").append(toIndentedString(documentStatusCode)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentUsageType: ").append(toIndentedString(documentUsageType)).append("\n");
    sb.append("    documentUsageMessageType: ").append(toIndentedString(documentUsageMessageType)).append("\n");
    sb.append("    documentVerifications: ").append(toIndentedString(documentVerifications)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
    sb.append("    issuingStateProvince: ").append(toIndentedString(issuingStateProvince)).append("\n");
    sb.append("    photoIncludedFlag: ").append(toIndentedString(photoIncludedFlag)).append("\n");
    sb.append("    scanReference: ").append(toIndentedString(scanReference)).append("\n");
    sb.append("    translationFlag: ").append(toIndentedString(translationFlag)).append("\n");
    sb.append("    translationOrganisationCode: ").append(toIndentedString(translationOrganisationCode)).append("\n");
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

