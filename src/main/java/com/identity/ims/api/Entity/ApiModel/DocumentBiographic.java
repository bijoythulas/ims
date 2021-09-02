package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.Biographic;
import com.identity.ims.api.Entity.ApiModel.GenderSexType;
import com.identity.ims.api.Entity.ApiModel.NameChangeReason;
import com.identity.ims.api.Entity.ApiModel.RelationshipStatusCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class DocumentBiographic   {
  
  private  String biographicUsageType;
  private  Biographic biographic;
  private  String birthPlace;
  private  String birthStateOrProvince;
  private  LocalDate cessationDate;
  private  LocalDate commencementDate;
  private  GenderSexType gender;
  private  NameChangeReason nameChange;
  private  String nameUsageType;
  private  String nationalIdentityNumber;
  private  String nationality;
  private  RelationshipStatusCode relationshipStatus;

  /**
   **/
  public DocumentBiographic biographicUsageType(String biographicUsageType) {
    this.biographicUsageType = biographicUsageType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("biographicUsageType")
  public String getBiographicUsageType() {
    return biographicUsageType;
  }
  public void setBiographicUsageType(String biographicUsageType) {
    this.biographicUsageType = biographicUsageType;
  }

  /**
   **/
  public DocumentBiographic biographic(Biographic biographic) {
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
  public DocumentBiographic birthPlace(String birthPlace) {
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
  public DocumentBiographic birthStateOrProvince(String birthStateOrProvince) {
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
  public DocumentBiographic cessationDate(LocalDate cessationDate) {
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
  public DocumentBiographic commencementDate(LocalDate commencementDate) {
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
  public DocumentBiographic gender(GenderSexType gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender")
  public GenderSexType getGender() {
    return gender;
  }
  public void setGender(GenderSexType gender) {
    this.gender = gender;
  }

  /**
   **/
  public DocumentBiographic nameChange(NameChangeReason nameChange) {
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
  public DocumentBiographic nameUsageType(String nameUsageType) {
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

  /**
   **/
  public DocumentBiographic nationalIdentityNumber(String nationalIdentityNumber) {
    this.nationalIdentityNumber = nationalIdentityNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nationalIdentityNumber")
  public String getNationalIdentityNumber() {
    return nationalIdentityNumber;
  }
  public void setNationalIdentityNumber(String nationalIdentityNumber) {
    this.nationalIdentityNumber = nationalIdentityNumber;
  }

  /**
   **/
  public DocumentBiographic nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nationality")
  public String getNationality() {
    return nationality;
  }
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   **/
  public DocumentBiographic relationshipStatus(RelationshipStatusCode relationshipStatus) {
    this.relationshipStatus = relationshipStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("relationshipStatus")
  public RelationshipStatusCode getRelationshipStatus() {
    return relationshipStatus;
  }
  public void setRelationshipStatus(RelationshipStatusCode relationshipStatus) {
    this.relationshipStatus = relationshipStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBiographic documentBiographic = (DocumentBiographic) o;
    return Objects.equals(this.biographicUsageType, documentBiographic.biographicUsageType) &&
        Objects.equals(this.biographic, documentBiographic.biographic) &&
        Objects.equals(this.birthPlace, documentBiographic.birthPlace) &&
        Objects.equals(this.birthStateOrProvince, documentBiographic.birthStateOrProvince) &&
        Objects.equals(this.cessationDate, documentBiographic.cessationDate) &&
        Objects.equals(this.commencementDate, documentBiographic.commencementDate) &&
        Objects.equals(this.gender, documentBiographic.gender) &&
        Objects.equals(this.nameChange, documentBiographic.nameChange) &&
        Objects.equals(this.nameUsageType, documentBiographic.nameUsageType) &&
        Objects.equals(this.nationalIdentityNumber, documentBiographic.nationalIdentityNumber) &&
        Objects.equals(this.nationality, documentBiographic.nationality) &&
        Objects.equals(this.relationshipStatus, documentBiographic.relationshipStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biographicUsageType, biographic, birthPlace, birthStateOrProvince, cessationDate, commencementDate, gender, nameChange, nameUsageType, nationalIdentityNumber, nationality, relationshipStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBiographic {\n");
    
    sb.append("    biographicUsageType: ").append(toIndentedString(biographicUsageType)).append("\n");
    sb.append("    biographic: ").append(toIndentedString(biographic)).append("\n");
    sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
    sb.append("    birthStateOrProvince: ").append(toIndentedString(birthStateOrProvince)).append("\n");
    sb.append("    cessationDate: ").append(toIndentedString(cessationDate)).append("\n");
    sb.append("    commencementDate: ").append(toIndentedString(commencementDate)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    nameChange: ").append(toIndentedString(nameChange)).append("\n");
    sb.append("    nameUsageType: ").append(toIndentedString(nameUsageType)).append("\n");
    sb.append("    nationalIdentityNumber: ").append(toIndentedString(nationalIdentityNumber)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    relationshipStatus: ").append(toIndentedString(relationshipStatus)).append("\n");
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

