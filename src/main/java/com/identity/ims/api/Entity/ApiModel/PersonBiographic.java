package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.Biographic;
import com.identity.ims.api.Entity.ApiModel.BiographicAcquisitionMethod;
import com.identity.ims.api.Entity.ApiModel.NameChangeReason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A person&#39;s biographics details
 **/
@ApiModel(description = "A person's biographics details")
public class PersonBiographic   {
  
  private  Biographic biographic;
  private  BiographicAcquisitionMethod biographicAcquisitionMethod;
  private  String birthPlace;
  private  String birthStateOrProvince;
  private  LocalDate cessationDate;
  private  LocalDate commencementDate;
  private  NameChangeReason nameChange;
  private  String nameUsageType;

  /**
   **/
  public PersonBiographic biographic(Biographic biographic) {
    this.biographic = biographic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("biographic")
  public Biographic getBiographic() {
    return biographic;
  }
  public void setBiographic(Biographic biographic) {
    this.biographic = biographic;
  }

  /**
   **/
  public PersonBiographic biographicAcquisitionMethod(BiographicAcquisitionMethod biographicAcquisitionMethod) {
    this.biographicAcquisitionMethod = biographicAcquisitionMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("biographicAcquisitionMethod")
  public BiographicAcquisitionMethod getBiographicAcquisitionMethod() {
    return biographicAcquisitionMethod;
  }
  public void setBiographicAcquisitionMethod(BiographicAcquisitionMethod biographicAcquisitionMethod) {
    this.biographicAcquisitionMethod = biographicAcquisitionMethod;
  }

  /**
   **/
  public PersonBiographic birthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("birthPlace")
  public String getBirthPlace() {
    return birthPlace;
  }
  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  /**
   **/
  public PersonBiographic birthStateOrProvince(String birthStateOrProvince) {
    this.birthStateOrProvince = birthStateOrProvince;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("birthStateOrProvince")
  public String getBirthStateOrProvince() {
    return birthStateOrProvince;
  }
  public void setBirthStateOrProvince(String birthStateOrProvince) {
    this.birthStateOrProvince = birthStateOrProvince;
  }

  /**
   **/
  public PersonBiographic cessationDate(LocalDate cessationDate) {
    this.cessationDate = cessationDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cessationDate")
  public LocalDate getCessationDate() {
    return cessationDate;
  }
  public void setCessationDate(LocalDate cessationDate) {
    this.cessationDate = cessationDate;
  }

  /**
   **/
  public PersonBiographic commencementDate(LocalDate commencementDate) {
    this.commencementDate = commencementDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("commencementDate")
  public LocalDate getCommencementDate() {
    return commencementDate;
  }
  public void setCommencementDate(LocalDate commencementDate) {
    this.commencementDate = commencementDate;
  }

  /**
   **/
  public PersonBiographic nameChange(NameChangeReason nameChange) {
    this.nameChange = nameChange;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nameChange")
  public NameChangeReason getNameChange() {
    return nameChange;
  }
  public void setNameChange(NameChangeReason nameChange) {
    this.nameChange = nameChange;
  }

  /**
   **/
  public PersonBiographic nameUsageType(String nameUsageType) {
    this.nameUsageType = nameUsageType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nameUsageType")
  public String getNameUsageType() {
    return nameUsageType;
  }
  public void setNameUsageType(String nameUsageType) {
    this.nameUsageType = nameUsageType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonBiographic personBiographic = (PersonBiographic) o;
    return Objects.equals(this.biographic, personBiographic.biographic) &&
        Objects.equals(this.biographicAcquisitionMethod, personBiographic.biographicAcquisitionMethod) &&
        Objects.equals(this.birthPlace, personBiographic.birthPlace) &&
        Objects.equals(this.birthStateOrProvince, personBiographic.birthStateOrProvince) &&
        Objects.equals(this.cessationDate, personBiographic.cessationDate) &&
        Objects.equals(this.commencementDate, personBiographic.commencementDate) &&
        Objects.equals(this.nameChange, personBiographic.nameChange) &&
        Objects.equals(this.nameUsageType, personBiographic.nameUsageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biographic, biographicAcquisitionMethod, birthPlace, birthStateOrProvince, cessationDate, commencementDate, nameChange, nameUsageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonBiographic {\n");
    
    sb.append("    biographic: ").append(toIndentedString(biographic)).append("\n");
    sb.append("    biographicAcquisitionMethod: ").append(toIndentedString(biographicAcquisitionMethod)).append("\n");
    sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
    sb.append("    birthStateOrProvince: ").append(toIndentedString(birthStateOrProvince)).append("\n");
    sb.append("    cessationDate: ").append(toIndentedString(cessationDate)).append("\n");
    sb.append("    commencementDate: ").append(toIndentedString(commencementDate)).append("\n");
    sb.append("    nameChange: ").append(toIndentedString(nameChange)).append("\n");
    sb.append("    nameUsageType: ").append(toIndentedString(nameUsageType)).append("\n");
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

