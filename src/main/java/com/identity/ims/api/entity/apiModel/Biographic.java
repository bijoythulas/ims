package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.Country;
import com.identity.ims.api.entity.apiModel.GenderSexType;



public class Biographic   {
  
  private  Country birthCountry;
  private  LocalDate birthDate;
  private  String familyName;
  private  String givenName;
  private  String nameSuffix;
  private  String nameTitle;
  private  GenderSexType sexCode;

  /**
   **/
  public Biographic birthCountry(Country birthCountry) {
    this.birthCountry = birthCountry;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("birthCountry")
  public Country getBirthCountry() {
    return birthCountry;
  }
  public void setBirthCountry(Country birthCountry) {
    this.birthCountry = birthCountry;
  }

  /**
   **/
  public Biographic birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("birthDate")
  public LocalDate getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  /**
   **/
  public Biographic familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  /**
   **/
  public Biographic givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("givenName")
  public String getGivenName() {
    return givenName;
  }
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  /**
   **/
  public Biographic nameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nameSuffix")
  public String getNameSuffix() {
    return nameSuffix;
  }
  public void setNameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
  }

  /**
   **/
  public Biographic nameTitle(String nameTitle) {
    this.nameTitle = nameTitle;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nameTitle")
  public String getNameTitle() {
    return nameTitle;
  }
  public void setNameTitle(String nameTitle) {
    this.nameTitle = nameTitle;
  }

  /**
   **/
  public Biographic sexCode(GenderSexType sexCode) {
    this.sexCode = sexCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sexCode")
  public GenderSexType getSexCode() {
    return sexCode;
  }
  public void setSexCode(GenderSexType sexCode) {
    this.sexCode = sexCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Biographic biographic = (Biographic) o;
    return Objects.equals(this.birthCountry, biographic.birthCountry) &&
        Objects.equals(this.birthDate, biographic.birthDate) &&
        Objects.equals(this.familyName, biographic.familyName) &&
        Objects.equals(this.givenName, biographic.givenName) &&
        Objects.equals(this.nameSuffix, biographic.nameSuffix) &&
        Objects.equals(this.nameTitle, biographic.nameTitle) &&
        Objects.equals(this.sexCode, biographic.sexCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthCountry, birthDate, familyName, givenName, nameSuffix, nameTitle, sexCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Biographic {\n");
    
    sb.append("    birthCountry: ").append(toIndentedString(birthCountry)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    nameSuffix: ").append(toIndentedString(nameSuffix)).append("\n");
    sb.append("    nameTitle: ").append(toIndentedString(nameTitle)).append("\n");
    sb.append("    sexCode: ").append(toIndentedString(sexCode)).append("\n");
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

