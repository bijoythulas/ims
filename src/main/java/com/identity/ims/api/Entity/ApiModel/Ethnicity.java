package com.identity.ims.api.Entity.ApiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class Ethnicity   {
  
  private  LocalDate cessationDate;
  private  LocalDate commencementDate;
  private  String ethnicityType;

  /**
   **/
  public Ethnicity cessationDate(LocalDate cessationDate) {
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
  public Ethnicity commencementDate(LocalDate commencementDate) {
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
  public Ethnicity ethnicityType(String ethnicityType) {
    this.ethnicityType = ethnicityType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ethnicityType")
  public String getEthnicityType() {
    return ethnicityType;
  }
  public void setEthnicityType(String ethnicityType) {
    this.ethnicityType = ethnicityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ethnicity ethnicity = (Ethnicity) o;
    return Objects.equals(this.cessationDate, ethnicity.cessationDate) &&
        Objects.equals(this.commencementDate, ethnicity.commencementDate) &&
        Objects.equals(this.ethnicityType, ethnicity.ethnicityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cessationDate, commencementDate, ethnicityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ethnicity {\n");
    
    sb.append("    cessationDate: ").append(toIndentedString(cessationDate)).append("\n");
    sb.append("    commencementDate: ").append(toIndentedString(commencementDate)).append("\n");
    sb.append("    ethnicityType: ").append(toIndentedString(ethnicityType)).append("\n");
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

