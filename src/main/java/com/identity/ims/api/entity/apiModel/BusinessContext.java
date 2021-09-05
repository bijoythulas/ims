package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.BusinessIdentifier;
import com.identity.ims.api.entity.apiModel.BusinessRole;



public class BusinessContext   {
  
  private  String businessCategory;
  private  String businessContextType;
  private  BusinessIdentifier businessIdentifier;
  private  List<BusinessRole> businessRoles = new ArrayList<>();
  private  String businessStatusCode;
  private  OffsetDateTime businessStatusTimeStamp;
  private  String officerFamilyName;
  private  String officerGivenName;
  private  String officerUserId;

  /**
   **/
  public BusinessContext businessCategory(String businessCategory) {
    this.businessCategory = businessCategory;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("businessCategory")
  public String getBusinessCategory() {
    return businessCategory;
  }
  public void setBusinessCategory(String businessCategory) {
    this.businessCategory = businessCategory;
  }

  /**
   **/
  public BusinessContext businessContextType(String businessContextType) {
    this.businessContextType = businessContextType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("businessContextType")
  public String getBusinessContextType() {
    return businessContextType;
  }
  public void setBusinessContextType(String businessContextType) {
    this.businessContextType = businessContextType;
  }

  /**
   **/
  public BusinessContext businessIdentifier(BusinessIdentifier businessIdentifier) {
    this.businessIdentifier = businessIdentifier;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("businessIdentifier")
  public BusinessIdentifier getBusinessIdentifier() {
    return businessIdentifier;
  }
  public void setBusinessIdentifier(BusinessIdentifier businessIdentifier) {
    this.businessIdentifier = businessIdentifier;
  }

  /**
   **/
  public BusinessContext businessRoles(List<BusinessRole> businessRoles) {
    this.businessRoles = businessRoles;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("businessRoles")
  public List<BusinessRole> getBusinessRoles() {
    return businessRoles;
  }
  public void setBusinessRoles(List<BusinessRole> businessRoles) {
    this.businessRoles = businessRoles;
  }

  /**
   **/
  public BusinessContext businessStatusCode(String businessStatusCode) {
    this.businessStatusCode = businessStatusCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("businessStatusCode")
  public String getBusinessStatusCode() {
    return businessStatusCode;
  }
  public void setBusinessStatusCode(String businessStatusCode) {
    this.businessStatusCode = businessStatusCode;
  }

  /**
   **/
  public BusinessContext businessStatusTimeStamp(OffsetDateTime businessStatusTimeStamp) {
    this.businessStatusTimeStamp = businessStatusTimeStamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("businessStatusTimeStamp")
  public OffsetDateTime getBusinessStatusTimeStamp() {
    return businessStatusTimeStamp;
  }
  public void setBusinessStatusTimeStamp(OffsetDateTime businessStatusTimeStamp) {
    this.businessStatusTimeStamp = businessStatusTimeStamp;
  }

  /**
   **/
  public BusinessContext officerFamilyName(String officerFamilyName) {
    this.officerFamilyName = officerFamilyName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("officerFamilyName")
  public String getOfficerFamilyName() {
    return officerFamilyName;
  }
  public void setOfficerFamilyName(String officerFamilyName) {
    this.officerFamilyName = officerFamilyName;
  }

  /**
   **/
  public BusinessContext officerGivenName(String officerGivenName) {
    this.officerGivenName = officerGivenName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("officerGivenName")
  public String getOfficerGivenName() {
    return officerGivenName;
  }
  public void setOfficerGivenName(String officerGivenName) {
    this.officerGivenName = officerGivenName;
  }

  /**
   **/
  public BusinessContext officerUserId(String officerUserId) {
    this.officerUserId = officerUserId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("officerUserId")
  public String getOfficerUserId() {
    return officerUserId;
  }
  public void setOfficerUserId(String officerUserId) {
    this.officerUserId = officerUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessContext businessContext = (BusinessContext) o;
    return Objects.equals(this.businessCategory, businessContext.businessCategory) &&
        Objects.equals(this.businessContextType, businessContext.businessContextType) &&
        Objects.equals(this.businessIdentifier, businessContext.businessIdentifier) &&
        Objects.equals(this.businessRoles, businessContext.businessRoles) &&
        Objects.equals(this.businessStatusCode, businessContext.businessStatusCode) &&
        Objects.equals(this.businessStatusTimeStamp, businessContext.businessStatusTimeStamp) &&
        Objects.equals(this.officerFamilyName, businessContext.officerFamilyName) &&
        Objects.equals(this.officerGivenName, businessContext.officerGivenName) &&
        Objects.equals(this.officerUserId, businessContext.officerUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessCategory, businessContextType, businessIdentifier, businessRoles, businessStatusCode, businessStatusTimeStamp, officerFamilyName, officerGivenName, officerUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessContext {\n");
    
    sb.append("    businessCategory: ").append(toIndentedString(businessCategory)).append("\n");
    sb.append("    businessContextType: ").append(toIndentedString(businessContextType)).append("\n");
    sb.append("    businessIdentifier: ").append(toIndentedString(businessIdentifier)).append("\n");
    sb.append("    businessRoles: ").append(toIndentedString(businessRoles)).append("\n");
    sb.append("    businessStatusCode: ").append(toIndentedString(businessStatusCode)).append("\n");
    sb.append("    businessStatusTimeStamp: ").append(toIndentedString(businessStatusTimeStamp)).append("\n");
    sb.append("    officerFamilyName: ").append(toIndentedString(officerFamilyName)).append("\n");
    sb.append("    officerGivenName: ").append(toIndentedString(officerGivenName)).append("\n");
    sb.append("    officerUserId: ").append(toIndentedString(officerUserId)).append("\n");
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

