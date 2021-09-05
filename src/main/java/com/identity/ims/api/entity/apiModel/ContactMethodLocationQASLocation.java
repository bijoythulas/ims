package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class ContactMethodLocationQASLocation   {
  
  private  String aliasedLocality;
  private  String allotmentLot;
  private  String allotmentNumber;
  private  String buildingLevel;
  private  String buildingLevelNumber;
  private  String buildingLevelType;
  private  String buildingName1;
  private  String buildingName2;
  private  String buildingNumber;
  private  String country;
  private  String dPIDDID;
  private  String firstBuildingNumber;
  private  String flatUnit;
  private  String flatUnitNumber;
  private  String flatUnitType;
  private  String iSO3166Alpha2Code;
  private  String iSO3166Alpha3Code;
  private  String lastBuildingNumber;
  private  String locality;
  private  String postCode;
  private  String postalDelivery;
  private  String postalDeliveryNumber;
  private  String postalDeliveryType;
  private  String primaryPoint;
  private  String stateProvinceCode;
  private  String stateProvinceName;
  private  String street;
  private  String streetName;
  private  String streetType;
  private  String streetTypeSuffix;
  private  String subBuildingNumber;

  /**
   **/
  public ContactMethodLocationQASLocation aliasedLocality(String aliasedLocality) {
    this.aliasedLocality = aliasedLocality;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aliasedLocality")
  public String getAliasedLocality() {
    return aliasedLocality;
  }
  public void setAliasedLocality(String aliasedLocality) {
    this.aliasedLocality = aliasedLocality;
  }

  /**
   **/
  public ContactMethodLocationQASLocation allotmentLot(String allotmentLot) {
    this.allotmentLot = allotmentLot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allotmentLot")
  public String getAllotmentLot() {
    return allotmentLot;
  }
  public void setAllotmentLot(String allotmentLot) {
    this.allotmentLot = allotmentLot;
  }

  /**
   **/
  public ContactMethodLocationQASLocation allotmentNumber(String allotmentNumber) {
    this.allotmentNumber = allotmentNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allotmentNumber")
  public String getAllotmentNumber() {
    return allotmentNumber;
  }
  public void setAllotmentNumber(String allotmentNumber) {
    this.allotmentNumber = allotmentNumber;
  }

  /**
   **/
  public ContactMethodLocationQASLocation buildingLevel(String buildingLevel) {
    this.buildingLevel = buildingLevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buildingLevel")
  public String getBuildingLevel() {
    return buildingLevel;
  }
  public void setBuildingLevel(String buildingLevel) {
    this.buildingLevel = buildingLevel;
  }

  /**
   **/
  public ContactMethodLocationQASLocation buildingLevelNumber(String buildingLevelNumber) {
    this.buildingLevelNumber = buildingLevelNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buildingLevelNumber")
  public String getBuildingLevelNumber() {
    return buildingLevelNumber;
  }
  public void setBuildingLevelNumber(String buildingLevelNumber) {
    this.buildingLevelNumber = buildingLevelNumber;
  }

  /**
   **/
  public ContactMethodLocationQASLocation buildingLevelType(String buildingLevelType) {
    this.buildingLevelType = buildingLevelType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buildingLevelType")
  public String getBuildingLevelType() {
    return buildingLevelType;
  }
  public void setBuildingLevelType(String buildingLevelType) {
    this.buildingLevelType = buildingLevelType;
  }

  /**
   **/
  public ContactMethodLocationQASLocation buildingName1(String buildingName1) {
    this.buildingName1 = buildingName1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buildingName1")
  public String getBuildingName1() {
    return buildingName1;
  }
  public void setBuildingName1(String buildingName1) {
    this.buildingName1 = buildingName1;
  }

  /**
   **/
  public ContactMethodLocationQASLocation buildingName2(String buildingName2) {
    this.buildingName2 = buildingName2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buildingName2")
  public String getBuildingName2() {
    return buildingName2;
  }
  public void setBuildingName2(String buildingName2) {
    this.buildingName2 = buildingName2;
  }

  /**
   **/
  public ContactMethodLocationQASLocation buildingNumber(String buildingNumber) {
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
  public ContactMethodLocationQASLocation country(String country) {
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
  public ContactMethodLocationQASLocation dPIDDID(String dPIDDID) {
    this.dPIDDID = dPIDDID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dPIDDID")
  public String getdPIDDID() {
    return dPIDDID;
  }
  public void setdPIDDID(String dPIDDID) {
    this.dPIDDID = dPIDDID;
  }

  /**
   **/
  public ContactMethodLocationQASLocation firstBuildingNumber(String firstBuildingNumber) {
    this.firstBuildingNumber = firstBuildingNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("firstBuildingNumber")
  public String getFirstBuildingNumber() {
    return firstBuildingNumber;
  }
  public void setFirstBuildingNumber(String firstBuildingNumber) {
    this.firstBuildingNumber = firstBuildingNumber;
  }

  /**
   **/
  public ContactMethodLocationQASLocation flatUnit(String flatUnit) {
    this.flatUnit = flatUnit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("flatUnit")
  public String getFlatUnit() {
    return flatUnit;
  }
  public void setFlatUnit(String flatUnit) {
    this.flatUnit = flatUnit;
  }

  /**
   **/
  public ContactMethodLocationQASLocation flatUnitNumber(String flatUnitNumber) {
    this.flatUnitNumber = flatUnitNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("flatUnitNumber")
  public String getFlatUnitNumber() {
    return flatUnitNumber;
  }
  public void setFlatUnitNumber(String flatUnitNumber) {
    this.flatUnitNumber = flatUnitNumber;
  }

  /**
   **/
  public ContactMethodLocationQASLocation flatUnitType(String flatUnitType) {
    this.flatUnitType = flatUnitType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("flatUnitType")
  public String getFlatUnitType() {
    return flatUnitType;
  }
  public void setFlatUnitType(String flatUnitType) {
    this.flatUnitType = flatUnitType;
  }

  /**
   **/
  public ContactMethodLocationQASLocation iSO3166Alpha2Code(String iSO3166Alpha2Code) {
    this.iSO3166Alpha2Code = iSO3166Alpha2Code;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("iSO3166Alpha2Code")
  public String getiSO3166Alpha2Code() {
    return iSO3166Alpha2Code;
  }
  public void setiSO3166Alpha2Code(String iSO3166Alpha2Code) {
    this.iSO3166Alpha2Code = iSO3166Alpha2Code;
  }

  /**
   **/
  public ContactMethodLocationQASLocation iSO3166Alpha3Code(String iSO3166Alpha3Code) {
    this.iSO3166Alpha3Code = iSO3166Alpha3Code;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("iSO3166Alpha3Code")
  public String getiSO3166Alpha3Code() {
    return iSO3166Alpha3Code;
  }
  public void setiSO3166Alpha3Code(String iSO3166Alpha3Code) {
    this.iSO3166Alpha3Code = iSO3166Alpha3Code;
  }

  /**
   **/
  public ContactMethodLocationQASLocation lastBuildingNumber(String lastBuildingNumber) {
    this.lastBuildingNumber = lastBuildingNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastBuildingNumber")
  public String getLastBuildingNumber() {
    return lastBuildingNumber;
  }
  public void setLastBuildingNumber(String lastBuildingNumber) {
    this.lastBuildingNumber = lastBuildingNumber;
  }

  /**
   **/
  public ContactMethodLocationQASLocation locality(String locality) {
    this.locality = locality;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("locality")
  public String getLocality() {
    return locality;
  }
  public void setLocality(String locality) {
    this.locality = locality;
  }

  /**
   **/
  public ContactMethodLocationQASLocation postCode(String postCode) {
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
  public ContactMethodLocationQASLocation postalDelivery(String postalDelivery) {
    this.postalDelivery = postalDelivery;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postalDelivery")
  public String getPostalDelivery() {
    return postalDelivery;
  }
  public void setPostalDelivery(String postalDelivery) {
    this.postalDelivery = postalDelivery;
  }

  /**
   **/
  public ContactMethodLocationQASLocation postalDeliveryNumber(String postalDeliveryNumber) {
    this.postalDeliveryNumber = postalDeliveryNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postalDeliveryNumber")
  public String getPostalDeliveryNumber() {
    return postalDeliveryNumber;
  }
  public void setPostalDeliveryNumber(String postalDeliveryNumber) {
    this.postalDeliveryNumber = postalDeliveryNumber;
  }

  /**
   **/
  public ContactMethodLocationQASLocation postalDeliveryType(String postalDeliveryType) {
    this.postalDeliveryType = postalDeliveryType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postalDeliveryType")
  public String getPostalDeliveryType() {
    return postalDeliveryType;
  }
  public void setPostalDeliveryType(String postalDeliveryType) {
    this.postalDeliveryType = postalDeliveryType;
  }

  /**
   **/
  public ContactMethodLocationQASLocation primaryPoint(String primaryPoint) {
    this.primaryPoint = primaryPoint;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("primaryPoint")
  public String getPrimaryPoint() {
    return primaryPoint;
  }
  public void setPrimaryPoint(String primaryPoint) {
    this.primaryPoint = primaryPoint;
  }

  /**
   **/
  public ContactMethodLocationQASLocation stateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stateProvinceCode")
  public String getStateProvinceCode() {
    return stateProvinceCode;
  }
  public void setStateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
  }

  /**
   **/
  public ContactMethodLocationQASLocation stateProvinceName(String stateProvinceName) {
    this.stateProvinceName = stateProvinceName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stateProvinceName")
  public String getStateProvinceName() {
    return stateProvinceName;
  }
  public void setStateProvinceName(String stateProvinceName) {
    this.stateProvinceName = stateProvinceName;
  }

  /**
   **/
  public ContactMethodLocationQASLocation street(String street) {
    this.street = street;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   **/
  public ContactMethodLocationQASLocation streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("streetName")
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  /**
   **/
  public ContactMethodLocationQASLocation streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("streetType")
  public String getStreetType() {
    return streetType;
  }
  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  /**
   **/
  public ContactMethodLocationQASLocation streetTypeSuffix(String streetTypeSuffix) {
    this.streetTypeSuffix = streetTypeSuffix;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("streetTypeSuffix")
  public String getStreetTypeSuffix() {
    return streetTypeSuffix;
  }
  public void setStreetTypeSuffix(String streetTypeSuffix) {
    this.streetTypeSuffix = streetTypeSuffix;
  }

  /**
   **/
  public ContactMethodLocationQASLocation subBuildingNumber(String subBuildingNumber) {
    this.subBuildingNumber = subBuildingNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("subBuildingNumber")
  public String getSubBuildingNumber() {
    return subBuildingNumber;
  }
  public void setSubBuildingNumber(String subBuildingNumber) {
    this.subBuildingNumber = subBuildingNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactMethodLocationQASLocation contactMethodLocationQASLocation = (ContactMethodLocationQASLocation) o;
    return Objects.equals(this.aliasedLocality, contactMethodLocationQASLocation.aliasedLocality) &&
        Objects.equals(this.allotmentLot, contactMethodLocationQASLocation.allotmentLot) &&
        Objects.equals(this.allotmentNumber, contactMethodLocationQASLocation.allotmentNumber) &&
        Objects.equals(this.buildingLevel, contactMethodLocationQASLocation.buildingLevel) &&
        Objects.equals(this.buildingLevelNumber, contactMethodLocationQASLocation.buildingLevelNumber) &&
        Objects.equals(this.buildingLevelType, contactMethodLocationQASLocation.buildingLevelType) &&
        Objects.equals(this.buildingName1, contactMethodLocationQASLocation.buildingName1) &&
        Objects.equals(this.buildingName2, contactMethodLocationQASLocation.buildingName2) &&
        Objects.equals(this.buildingNumber, contactMethodLocationQASLocation.buildingNumber) &&
        Objects.equals(this.country, contactMethodLocationQASLocation.country) &&
        Objects.equals(this.dPIDDID, contactMethodLocationQASLocation.dPIDDID) &&
        Objects.equals(this.firstBuildingNumber, contactMethodLocationQASLocation.firstBuildingNumber) &&
        Objects.equals(this.flatUnit, contactMethodLocationQASLocation.flatUnit) &&
        Objects.equals(this.flatUnitNumber, contactMethodLocationQASLocation.flatUnitNumber) &&
        Objects.equals(this.flatUnitType, contactMethodLocationQASLocation.flatUnitType) &&
        Objects.equals(this.iSO3166Alpha2Code, contactMethodLocationQASLocation.iSO3166Alpha2Code) &&
        Objects.equals(this.iSO3166Alpha3Code, contactMethodLocationQASLocation.iSO3166Alpha3Code) &&
        Objects.equals(this.lastBuildingNumber, contactMethodLocationQASLocation.lastBuildingNumber) &&
        Objects.equals(this.locality, contactMethodLocationQASLocation.locality) &&
        Objects.equals(this.postCode, contactMethodLocationQASLocation.postCode) &&
        Objects.equals(this.postalDelivery, contactMethodLocationQASLocation.postalDelivery) &&
        Objects.equals(this.postalDeliveryNumber, contactMethodLocationQASLocation.postalDeliveryNumber) &&
        Objects.equals(this.postalDeliveryType, contactMethodLocationQASLocation.postalDeliveryType) &&
        Objects.equals(this.primaryPoint, contactMethodLocationQASLocation.primaryPoint) &&
        Objects.equals(this.stateProvinceCode, contactMethodLocationQASLocation.stateProvinceCode) &&
        Objects.equals(this.stateProvinceName, contactMethodLocationQASLocation.stateProvinceName) &&
        Objects.equals(this.street, contactMethodLocationQASLocation.street) &&
        Objects.equals(this.streetName, contactMethodLocationQASLocation.streetName) &&
        Objects.equals(this.streetType, contactMethodLocationQASLocation.streetType) &&
        Objects.equals(this.streetTypeSuffix, contactMethodLocationQASLocation.streetTypeSuffix) &&
        Objects.equals(this.subBuildingNumber, contactMethodLocationQASLocation.subBuildingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasedLocality, allotmentLot, allotmentNumber, buildingLevel, buildingLevelNumber, buildingLevelType, buildingName1, buildingName2, buildingNumber, country, dPIDDID, firstBuildingNumber, flatUnit, flatUnitNumber, flatUnitType, iSO3166Alpha2Code, iSO3166Alpha3Code, lastBuildingNumber, locality, postCode, postalDelivery, postalDeliveryNumber, postalDeliveryType, primaryPoint, stateProvinceCode, stateProvinceName, street, streetName, streetType, streetTypeSuffix, subBuildingNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactMethodLocationQASLocation {\n");
    
    sb.append("    aliasedLocality: ").append(toIndentedString(aliasedLocality)).append("\n");
    sb.append("    allotmentLot: ").append(toIndentedString(allotmentLot)).append("\n");
    sb.append("    allotmentNumber: ").append(toIndentedString(allotmentNumber)).append("\n");
    sb.append("    buildingLevel: ").append(toIndentedString(buildingLevel)).append("\n");
    sb.append("    buildingLevelNumber: ").append(toIndentedString(buildingLevelNumber)).append("\n");
    sb.append("    buildingLevelType: ").append(toIndentedString(buildingLevelType)).append("\n");
    sb.append("    buildingName1: ").append(toIndentedString(buildingName1)).append("\n");
    sb.append("    buildingName2: ").append(toIndentedString(buildingName2)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dPIDDID: ").append(toIndentedString(dPIDDID)).append("\n");
    sb.append("    firstBuildingNumber: ").append(toIndentedString(firstBuildingNumber)).append("\n");
    sb.append("    flatUnit: ").append(toIndentedString(flatUnit)).append("\n");
    sb.append("    flatUnitNumber: ").append(toIndentedString(flatUnitNumber)).append("\n");
    sb.append("    flatUnitType: ").append(toIndentedString(flatUnitType)).append("\n");
    sb.append("    iSO3166Alpha2Code: ").append(toIndentedString(iSO3166Alpha2Code)).append("\n");
    sb.append("    iSO3166Alpha3Code: ").append(toIndentedString(iSO3166Alpha3Code)).append("\n");
    sb.append("    lastBuildingNumber: ").append(toIndentedString(lastBuildingNumber)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postalDelivery: ").append(toIndentedString(postalDelivery)).append("\n");
    sb.append("    postalDeliveryNumber: ").append(toIndentedString(postalDeliveryNumber)).append("\n");
    sb.append("    postalDeliveryType: ").append(toIndentedString(postalDeliveryType)).append("\n");
    sb.append("    primaryPoint: ").append(toIndentedString(primaryPoint)).append("\n");
    sb.append("    stateProvinceCode: ").append(toIndentedString(stateProvinceCode)).append("\n");
    sb.append("    stateProvinceName: ").append(toIndentedString(stateProvinceName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    streetTypeSuffix: ").append(toIndentedString(streetTypeSuffix)).append("\n");
    sb.append("    subBuildingNumber: ").append(toIndentedString(subBuildingNumber)).append("\n");
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

