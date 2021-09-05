package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class ContactMethodLocationPAFLocation   {
  
  private  String buildingName;
  private  String buildingNumber;
  private  String country;
  private  String departmentName;
  private  String dependentLocalityName;
  private  String dependentThoroughfareDescriptor;
  private  String dependentThoroughfareName;
  private  String doubleDependentLocalityName;
  private  String organisationName;
  private  String postBox;
  private  String postCode;
  private  String postCodeType;
  private  String postTownName;
  private  String subBuildingName;
  private  String thoroughfareDescriptor;
  private  String thoroughfareName;

  /**
   **/
  public ContactMethodLocationPAFLocation buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buildingName")
  public String getBuildingName() {
    return buildingName;
  }
  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buildingNumber")
  public String getBuildingNumber() {
    return buildingNumber;
  }
  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("departmentName")
  public String getDepartmentName() {
    return departmentName;
  }
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation dependentLocalityName(String dependentLocalityName) {
    this.dependentLocalityName = dependentLocalityName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dependentLocalityName")
  public String getDependentLocalityName() {
    return dependentLocalityName;
  }
  public void setDependentLocalityName(String dependentLocalityName) {
    this.dependentLocalityName = dependentLocalityName;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation dependentThoroughfareDescriptor(String dependentThoroughfareDescriptor) {
    this.dependentThoroughfareDescriptor = dependentThoroughfareDescriptor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dependentThoroughfareDescriptor")
  public String getDependentThoroughfareDescriptor() {
    return dependentThoroughfareDescriptor;
  }
  public void setDependentThoroughfareDescriptor(String dependentThoroughfareDescriptor) {
    this.dependentThoroughfareDescriptor = dependentThoroughfareDescriptor;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation dependentThoroughfareName(String dependentThoroughfareName) {
    this.dependentThoroughfareName = dependentThoroughfareName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dependentThoroughfareName")
  public String getDependentThoroughfareName() {
    return dependentThoroughfareName;
  }
  public void setDependentThoroughfareName(String dependentThoroughfareName) {
    this.dependentThoroughfareName = dependentThoroughfareName;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation doubleDependentLocalityName(String doubleDependentLocalityName) {
    this.doubleDependentLocalityName = doubleDependentLocalityName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("doubleDependentLocalityName")
  public String getDoubleDependentLocalityName() {
    return doubleDependentLocalityName;
  }
  public void setDoubleDependentLocalityName(String doubleDependentLocalityName) {
    this.doubleDependentLocalityName = doubleDependentLocalityName;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation organisationName(String organisationName) {
    this.organisationName = organisationName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("organisationName")
  public String getOrganisationName() {
    return organisationName;
  }
  public void setOrganisationName(String organisationName) {
    this.organisationName = organisationName;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation postBox(String postBox) {
    this.postBox = postBox;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postBox")
  public String getPostBox() {
    return postBox;
  }
  public void setPostBox(String postBox) {
    this.postBox = postBox;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postCode")
  public String getPostCode() {
    return postCode;
  }
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation postCodeType(String postCodeType) {
    this.postCodeType = postCodeType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postCodeType")
  public String getPostCodeType() {
    return postCodeType;
  }
  public void setPostCodeType(String postCodeType) {
    this.postCodeType = postCodeType;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation postTownName(String postTownName) {
    this.postTownName = postTownName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postTownName")
  public String getPostTownName() {
    return postTownName;
  }
  public void setPostTownName(String postTownName) {
    this.postTownName = postTownName;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation subBuildingName(String subBuildingName) {
    this.subBuildingName = subBuildingName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("subBuildingName")
  public String getSubBuildingName() {
    return subBuildingName;
  }
  public void setSubBuildingName(String subBuildingName) {
    this.subBuildingName = subBuildingName;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation thoroughfareDescriptor(String thoroughfareDescriptor) {
    this.thoroughfareDescriptor = thoroughfareDescriptor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("thoroughfareDescriptor")
  public String getThoroughfareDescriptor() {
    return thoroughfareDescriptor;
  }
  public void setThoroughfareDescriptor(String thoroughfareDescriptor) {
    this.thoroughfareDescriptor = thoroughfareDescriptor;
  }

  /**
   **/
  public ContactMethodLocationPAFLocation thoroughfareName(String thoroughfareName) {
    this.thoroughfareName = thoroughfareName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("thoroughfareName")
  public String getThoroughfareName() {
    return thoroughfareName;
  }
  public void setThoroughfareName(String thoroughfareName) {
    this.thoroughfareName = thoroughfareName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactMethodLocationPAFLocation contactMethodLocationPAFLocation = (ContactMethodLocationPAFLocation) o;
    return Objects.equals(this.buildingName, contactMethodLocationPAFLocation.buildingName) &&
        Objects.equals(this.buildingNumber, contactMethodLocationPAFLocation.buildingNumber) &&
        Objects.equals(this.country, contactMethodLocationPAFLocation.country) &&
        Objects.equals(this.departmentName, contactMethodLocationPAFLocation.departmentName) &&
        Objects.equals(this.dependentLocalityName, contactMethodLocationPAFLocation.dependentLocalityName) &&
        Objects.equals(this.dependentThoroughfareDescriptor, contactMethodLocationPAFLocation.dependentThoroughfareDescriptor) &&
        Objects.equals(this.dependentThoroughfareName, contactMethodLocationPAFLocation.dependentThoroughfareName) &&
        Objects.equals(this.doubleDependentLocalityName, contactMethodLocationPAFLocation.doubleDependentLocalityName) &&
        Objects.equals(this.organisationName, contactMethodLocationPAFLocation.organisationName) &&
        Objects.equals(this.postBox, contactMethodLocationPAFLocation.postBox) &&
        Objects.equals(this.postCode, contactMethodLocationPAFLocation.postCode) &&
        Objects.equals(this.postCodeType, contactMethodLocationPAFLocation.postCodeType) &&
        Objects.equals(this.postTownName, contactMethodLocationPAFLocation.postTownName) &&
        Objects.equals(this.subBuildingName, contactMethodLocationPAFLocation.subBuildingName) &&
        Objects.equals(this.thoroughfareDescriptor, contactMethodLocationPAFLocation.thoroughfareDescriptor) &&
        Objects.equals(this.thoroughfareName, contactMethodLocationPAFLocation.thoroughfareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildingName, buildingNumber, country, departmentName, dependentLocalityName, dependentThoroughfareDescriptor, dependentThoroughfareName, doubleDependentLocalityName, organisationName, postBox, postCode, postCodeType, postTownName, subBuildingName, thoroughfareDescriptor, thoroughfareName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactMethodLocationPAFLocation {\n");
    
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    dependentLocalityName: ").append(toIndentedString(dependentLocalityName)).append("\n");
    sb.append("    dependentThoroughfareDescriptor: ").append(toIndentedString(dependentThoroughfareDescriptor)).append("\n");
    sb.append("    dependentThoroughfareName: ").append(toIndentedString(dependentThoroughfareName)).append("\n");
    sb.append("    doubleDependentLocalityName: ").append(toIndentedString(doubleDependentLocalityName)).append("\n");
    sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
    sb.append("    postBox: ").append(toIndentedString(postBox)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postCodeType: ").append(toIndentedString(postCodeType)).append("\n");
    sb.append("    postTownName: ").append(toIndentedString(postTownName)).append("\n");
    sb.append("    subBuildingName: ").append(toIndentedString(subBuildingName)).append("\n");
    sb.append("    thoroughfareDescriptor: ").append(toIndentedString(thoroughfareDescriptor)).append("\n");
    sb.append("    thoroughfareName: ").append(toIndentedString(thoroughfareName)).append("\n");
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

