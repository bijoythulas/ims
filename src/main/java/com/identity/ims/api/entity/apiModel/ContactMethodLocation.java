package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.ContactMethodLocationPAFLocation;
import com.identity.ims.api.entity.apiModel.ContactMethodLocationQASLocation;
import com.identity.ims.api.entity.apiModel.Country;



public class ContactMethodLocation   {
  
  private  String addressLine1;
  private  String addressLine2;
  private  String addressLine3;
  private  String addressLine4;
  private  String locality;
  private  String stateOrTerritory;
  private  String postCode;
  private  Country addressCountry;
  private  ContactMethodLocationPAFLocation pAFLocation;
  private  ContactMethodLocationQASLocation qASLocation;

  /**
   **/
  public ContactMethodLocation addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("addressLine1")
  public String getAddressLine1() {
    return addressLine1;
  }
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  /**
   **/
  public ContactMethodLocation addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addressLine2")
  public String getAddressLine2() {
    return addressLine2;
  }
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  /**
   **/
  public ContactMethodLocation addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addressLine3")
  public String getAddressLine3() {
    return addressLine3;
  }
  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  /**
   **/
  public ContactMethodLocation addressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addressLine4")
  public String getAddressLine4() {
    return addressLine4;
  }
  public void setAddressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
  }

  /**
   **/
  public ContactMethodLocation locality(String locality) {
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
  public ContactMethodLocation stateOrTerritory(String stateOrTerritory) {
    this.stateOrTerritory = stateOrTerritory;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stateOrTerritory")
  public String getStateOrTerritory() {
    return stateOrTerritory;
  }
  public void setStateOrTerritory(String stateOrTerritory) {
    this.stateOrTerritory = stateOrTerritory;
  }

  /**
   **/
  public ContactMethodLocation postCode(String postCode) {
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
  public ContactMethodLocation addressCountry(Country addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("addressCountry")
  public Country getAddressCountry() {
    return addressCountry;
  }
  public void setAddressCountry(Country addressCountry) {
    this.addressCountry = addressCountry;
  }

  /**
   **/
  public ContactMethodLocation pAFLocation(ContactMethodLocationPAFLocation pAFLocation) {
    this.pAFLocation = pAFLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pAFLocation")
  public ContactMethodLocationPAFLocation getpAFLocation() {
    return pAFLocation;
  }
  public void setpAFLocation(ContactMethodLocationPAFLocation pAFLocation) {
    this.pAFLocation = pAFLocation;
  }

  /**
   **/
  public ContactMethodLocation qASLocation(ContactMethodLocationQASLocation qASLocation) {
    this.qASLocation = qASLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("qASLocation")
  public ContactMethodLocationQASLocation getqASLocation() {
    return qASLocation;
  }
  public void setqASLocation(ContactMethodLocationQASLocation qASLocation) {
    this.qASLocation = qASLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactMethodLocation contactMethodLocation = (ContactMethodLocation) o;
    return Objects.equals(this.addressLine1, contactMethodLocation.addressLine1) &&
        Objects.equals(this.addressLine2, contactMethodLocation.addressLine2) &&
        Objects.equals(this.addressLine3, contactMethodLocation.addressLine3) &&
        Objects.equals(this.addressLine4, contactMethodLocation.addressLine4) &&
        Objects.equals(this.locality, contactMethodLocation.locality) &&
        Objects.equals(this.stateOrTerritory, contactMethodLocation.stateOrTerritory) &&
        Objects.equals(this.postCode, contactMethodLocation.postCode) &&
        Objects.equals(this.addressCountry, contactMethodLocation.addressCountry) &&
        Objects.equals(this.pAFLocation, contactMethodLocation.pAFLocation) &&
        Objects.equals(this.qASLocation, contactMethodLocation.qASLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, addressLine3, addressLine4, locality, stateOrTerritory, postCode, addressCountry, pAFLocation, qASLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactMethodLocation {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    addressLine4: ").append(toIndentedString(addressLine4)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    stateOrTerritory: ").append(toIndentedString(stateOrTerritory)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    pAFLocation: ").append(toIndentedString(pAFLocation)).append("\n");
    sb.append("    qASLocation: ").append(toIndentedString(qASLocation)).append("\n");
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

