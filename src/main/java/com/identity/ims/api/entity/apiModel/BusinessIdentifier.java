package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Business identifier is a transaction level identifier e.g. application, declaration, reference number, case, job, permission request, etc.
 **/
@ApiModel(description = "Business identifier is a transaction level identifier e.g. application, declaration, reference number, case, job, permission request, etc.")
public class BusinessIdentifier   {
  
  private  String businessId;
  private  String businessIdType;

  /**
   **/
  public BusinessIdentifier businessId(String businessId) {
    this.businessId = businessId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("businessId")
  public String getBusinessId() {
    return businessId;
  }
  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }

  /**
   **/
  public BusinessIdentifier businessIdType(String businessIdType) {
    this.businessIdType = businessIdType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("businessIdType")
  public String getBusinessIdType() {
    return businessIdType;
  }
  public void setBusinessIdType(String businessIdType) {
    this.businessIdType = businessIdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessIdentifier businessIdentifier = (BusinessIdentifier) o;
    return Objects.equals(this.businessId, businessIdentifier.businessId) &&
        Objects.equals(this.businessIdType, businessIdentifier.businessIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, businessIdType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessIdentifier {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    businessIdType: ").append(toIndentedString(businessIdType)).append("\n");
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

