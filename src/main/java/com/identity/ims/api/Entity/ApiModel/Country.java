package com.identity.ims.api.Entity.ApiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class Country   {
  
  private  String countryCode;
  private  String countryType;

  /**
   **/
  public Country countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * Country code type
   **/
  public Country countryType(String countryType) {
    this.countryType = countryType;
    return this;
  }

  
  @ApiModelProperty(value = "Country code type")
  @JsonProperty("countryType")
  public String getCountryType() {
    return countryType;
  }
  public void setCountryType(String countryType) {
    this.countryType = countryType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.countryCode, country.countryCode) &&
        Objects.equals(this.countryType, country.countryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryType: ").append(toIndentedString(countryType)).append("\n");
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

