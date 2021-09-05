package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class DocumentCertificate   {
  
  private  String certificateNumber;
  private  LocalDate certificatePrintedDate;

  /**
   **/
  public DocumentCertificate certificateNumber(String certificateNumber) {
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
  public DocumentCertificate certificatePrintedDate(LocalDate certificatePrintedDate) {
    this.certificatePrintedDate = certificatePrintedDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("certificatePrintedDate")
  public LocalDate getCertificatePrintedDate() {
    return certificatePrintedDate;
  }
  public void setCertificatePrintedDate(LocalDate certificatePrintedDate) {
    this.certificatePrintedDate = certificatePrintedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCertificate documentCertificate = (DocumentCertificate) o;
    return Objects.equals(this.certificateNumber, documentCertificate.certificateNumber) &&
        Objects.equals(this.certificatePrintedDate, documentCertificate.certificatePrintedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateNumber, certificatePrintedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCertificate {\n");
    
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    certificatePrintedDate: ").append(toIndentedString(certificatePrintedDate)).append("\n");
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

