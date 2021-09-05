package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class Language   {
  
  private  LocalDate cessationDate;
  private  LocalDate commencementDate;
  private  String languageCode;
  private  Boolean preferredLanguageFlag;

  /**
   **/
  public Language cessationDate(LocalDate cessationDate) {
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
  public Language commencementDate(LocalDate commencementDate) {
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
  public Language languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  /**
   **/
  public Language preferredLanguageFlag(Boolean preferredLanguageFlag) {
    this.preferredLanguageFlag = preferredLanguageFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredLanguageFlag")
  public Boolean getPreferredLanguageFlag() {
    return preferredLanguageFlag;
  }
  public void setPreferredLanguageFlag(Boolean preferredLanguageFlag) {
    this.preferredLanguageFlag = preferredLanguageFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Language language = (Language) o;
    return Objects.equals(this.cessationDate, language.cessationDate) &&
        Objects.equals(this.commencementDate, language.commencementDate) &&
        Objects.equals(this.languageCode, language.languageCode) &&
        Objects.equals(this.preferredLanguageFlag, language.preferredLanguageFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cessationDate, commencementDate, languageCode, preferredLanguageFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Language {\n");
    
    sb.append("    cessationDate: ").append(toIndentedString(cessationDate)).append("\n");
    sb.append("    commencementDate: ").append(toIndentedString(commencementDate)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    preferredLanguageFlag: ").append(toIndentedString(preferredLanguageFlag)).append("\n");
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

