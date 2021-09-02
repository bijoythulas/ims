package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.Country;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class ResidenceCountry   {
  
  private  LocalDate cessationDate;
  private  LocalDate commencementDate;
  private  Country country;
  private  String residencyCurrencyCode;

  /**
   **/
  public ResidenceCountry cessationDate(LocalDate cessationDate) {
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
  public ResidenceCountry commencementDate(LocalDate commencementDate) {
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
  public ResidenceCountry country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  public ResidenceCountry residencyCurrencyCode(String residencyCurrencyCode) {
    this.residencyCurrencyCode = residencyCurrencyCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("residencyCurrencyCode")
  public String getResidencyCurrencyCode() {
    return residencyCurrencyCode;
  }
  public void setResidencyCurrencyCode(String residencyCurrencyCode) {
    this.residencyCurrencyCode = residencyCurrencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResidenceCountry residenceCountry = (ResidenceCountry) o;
    return Objects.equals(this.cessationDate, residenceCountry.cessationDate) &&
        Objects.equals(this.commencementDate, residenceCountry.commencementDate) &&
        Objects.equals(this.country, residenceCountry.country) &&
        Objects.equals(this.residencyCurrencyCode, residenceCountry.residencyCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cessationDate, commencementDate, country, residencyCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResidenceCountry {\n");
    
    sb.append("    cessationDate: ").append(toIndentedString(cessationDate)).append("\n");
    sb.append("    commencementDate: ").append(toIndentedString(commencementDate)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    residencyCurrencyCode: ").append(toIndentedString(residencyCurrencyCode)).append("\n");
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

