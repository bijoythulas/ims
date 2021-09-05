package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class DocumentUsageMessageTypeMarriageCertificate   {
  
  private  String certificateNumber;
  private  LocalDate certificatePrintedDate;
  private  String documentCertificationType;
  private  LocalDate marriageDate;
  private  String marriagePlace;

  /**
   **/
  public DocumentUsageMessageTypeMarriageCertificate certificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("certificateNumber")
  public String getCertificateNumber() {
    return certificateNumber;
  }
  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  /**
   **/
  public DocumentUsageMessageTypeMarriageCertificate certificatePrintedDate(LocalDate certificatePrintedDate) {
    this.certificatePrintedDate = certificatePrintedDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("certificatePrintedDate")
  public LocalDate getCertificatePrintedDate() {
    return certificatePrintedDate;
  }
  public void setCertificatePrintedDate(LocalDate certificatePrintedDate) {
    this.certificatePrintedDate = certificatePrintedDate;
  }

  /**
   **/
  public DocumentUsageMessageTypeMarriageCertificate documentCertificationType(String documentCertificationType) {
    this.documentCertificationType = documentCertificationType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("documentCertificationType")
  public String getDocumentCertificationType() {
    return documentCertificationType;
  }
  public void setDocumentCertificationType(String documentCertificationType) {
    this.documentCertificationType = documentCertificationType;
  }

  /**
   **/
  public DocumentUsageMessageTypeMarriageCertificate marriageDate(LocalDate marriageDate) {
    this.marriageDate = marriageDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("marriageDate")
  public LocalDate getMarriageDate() {
    return marriageDate;
  }
  public void setMarriageDate(LocalDate marriageDate) {
    this.marriageDate = marriageDate;
  }

  /**
   **/
  public DocumentUsageMessageTypeMarriageCertificate marriagePlace(String marriagePlace) {
    this.marriagePlace = marriagePlace;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("marriagePlace")
  public String getMarriagePlace() {
    return marriagePlace;
  }
  public void setMarriagePlace(String marriagePlace) {
    this.marriagePlace = marriagePlace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUsageMessageTypeMarriageCertificate documentUsageMessageTypeMarriageCertificate = (DocumentUsageMessageTypeMarriageCertificate) o;
    return Objects.equals(this.certificateNumber, documentUsageMessageTypeMarriageCertificate.certificateNumber) &&
        Objects.equals(this.certificatePrintedDate, documentUsageMessageTypeMarriageCertificate.certificatePrintedDate) &&
        Objects.equals(this.documentCertificationType, documentUsageMessageTypeMarriageCertificate.documentCertificationType) &&
        Objects.equals(this.marriageDate, documentUsageMessageTypeMarriageCertificate.marriageDate) &&
        Objects.equals(this.marriagePlace, documentUsageMessageTypeMarriageCertificate.marriagePlace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateNumber, certificatePrintedDate, documentCertificationType, marriageDate, marriagePlace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUsageMessageTypeMarriageCertificate {\n");
    
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    certificatePrintedDate: ").append(toIndentedString(certificatePrintedDate)).append("\n");
    sb.append("    documentCertificationType: ").append(toIndentedString(documentCertificationType)).append("\n");
    sb.append("    marriageDate: ").append(toIndentedString(marriageDate)).append("\n");
    sb.append("    marriagePlace: ").append(toIndentedString(marriagePlace)).append("\n");
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

