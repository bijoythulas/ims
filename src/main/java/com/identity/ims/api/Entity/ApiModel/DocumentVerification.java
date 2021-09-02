package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.DocumentVerificationVerificationActivities;
import com.identity.ims.api.Entity.ApiModel.Identifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class DocumentVerification   {
  
  private  String referralStatus;
  private  String verficationActivityType;
  private  Identifier verficationIdentifier;
  private  List<DocumentVerificationVerificationActivities> verificationActivities = new ArrayList<>();

  /**
   **/
  public DocumentVerification referralStatus(String referralStatus) {
    this.referralStatus = referralStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("referralStatus")
  public String getReferralStatus() {
    return referralStatus;
  }
  public void setReferralStatus(String referralStatus) {
    this.referralStatus = referralStatus;
  }

  /**
   **/
  public DocumentVerification verficationActivityType(String verficationActivityType) {
    this.verficationActivityType = verficationActivityType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("verficationActivityType")
  public String getVerficationActivityType() {
    return verficationActivityType;
  }
  public void setVerficationActivityType(String verficationActivityType) {
    this.verficationActivityType = verficationActivityType;
  }

  /**
   **/
  public DocumentVerification verficationIdentifier(Identifier verficationIdentifier) {
    this.verficationIdentifier = verficationIdentifier;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("verficationIdentifier")
  public Identifier getVerficationIdentifier() {
    return verficationIdentifier;
  }
  public void setVerficationIdentifier(Identifier verficationIdentifier) {
    this.verficationIdentifier = verficationIdentifier;
  }

  /**
   **/
  public DocumentVerification verificationActivities(List<DocumentVerificationVerificationActivities> verificationActivities) {
    this.verificationActivities = verificationActivities;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("verificationActivities")
  public List<DocumentVerificationVerificationActivities> getVerificationActivities() {
    return verificationActivities;
  }
  public void setVerificationActivities(List<DocumentVerificationVerificationActivities> verificationActivities) {
    this.verificationActivities = verificationActivities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentVerification documentVerification = (DocumentVerification) o;
    return Objects.equals(this.referralStatus, documentVerification.referralStatus) &&
        Objects.equals(this.verficationActivityType, documentVerification.verficationActivityType) &&
        Objects.equals(this.verficationIdentifier, documentVerification.verficationIdentifier) &&
        Objects.equals(this.verificationActivities, documentVerification.verificationActivities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referralStatus, verficationActivityType, verficationIdentifier, verificationActivities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentVerification {\n");
    
    sb.append("    referralStatus: ").append(toIndentedString(referralStatus)).append("\n");
    sb.append("    verficationActivityType: ").append(toIndentedString(verficationActivityType)).append("\n");
    sb.append("    verficationIdentifier: ").append(toIndentedString(verficationIdentifier)).append("\n");
    sb.append("    verificationActivities: ").append(toIndentedString(verificationActivities)).append("\n");
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

