package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.identity.ims.api.entity.apiModel.ContactMethodLocation;



public class ContactMethod   {
  
  private  Boolean authorisedContactFlag;
  private  LocalDate cessationDate;
  private  LocalDate commencementDate;
  private  String email;
  private  String fax;
  private  String internet;
  private  ContactMethodLocation location;
  private  String mobile;
  private  Boolean preferredContactFlag;
  private  String sourceCode;
  private  String telephone;
  private  String telex;
  private  String usageCode;
  private  Boolean verifiedFlag;

  /**
   **/
  public ContactMethod authorisedContactFlag(Boolean authorisedContactFlag) {
    this.authorisedContactFlag = authorisedContactFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authorisedContactFlag")
  public Boolean getAuthorisedContactFlag() {
    return authorisedContactFlag;
  }
  public void setAuthorisedContactFlag(Boolean authorisedContactFlag) {
    this.authorisedContactFlag = authorisedContactFlag;
  }

  /**
   **/
  public ContactMethod cessationDate(LocalDate cessationDate) {
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
  public ContactMethod commencementDate(LocalDate commencementDate) {
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
  public ContactMethod email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public ContactMethod fax(String fax) {
    this.fax = fax;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  /**
   **/
  public ContactMethod internet(String internet) {
    this.internet = internet;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("internet")
  public String getInternet() {
    return internet;
  }
  public void setInternet(String internet) {
    this.internet = internet;
  }

  /**
   **/
  public ContactMethod location(ContactMethodLocation location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("location")
  public ContactMethodLocation getLocation() {
    return location;
  }
  public void setLocation(ContactMethodLocation location) {
    this.location = location;
  }

  /**
   **/
  public ContactMethod mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mobile")
  public String getMobile() {
    return mobile;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   **/
  public ContactMethod preferredContactFlag(Boolean preferredContactFlag) {
    this.preferredContactFlag = preferredContactFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredContactFlag")
  public Boolean getPreferredContactFlag() {
    return preferredContactFlag;
  }
  public void setPreferredContactFlag(Boolean preferredContactFlag) {
    this.preferredContactFlag = preferredContactFlag;
  }

  /**
   **/
  public ContactMethod sourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sourceCode")
  public String getSourceCode() {
    return sourceCode;
  }
  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }

  /**
   **/
  public ContactMethod telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("telephone")
  public String getTelephone() {
    return telephone;
  }
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  /**
   **/
  public ContactMethod telex(String telex) {
    this.telex = telex;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("telex")
  public String getTelex() {
    return telex;
  }
  public void setTelex(String telex) {
    this.telex = telex;
  }

  /**
   **/
  public ContactMethod usageCode(String usageCode) {
    this.usageCode = usageCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usageCode")
  public String getUsageCode() {
    return usageCode;
  }
  public void setUsageCode(String usageCode) {
    this.usageCode = usageCode;
  }

  /**
   **/
  public ContactMethod verifiedFlag(Boolean verifiedFlag) {
    this.verifiedFlag = verifiedFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("verifiedFlag")
  public Boolean getVerifiedFlag() {
    return verifiedFlag;
  }
  public void setVerifiedFlag(Boolean verifiedFlag) {
    this.verifiedFlag = verifiedFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactMethod contactMethod = (ContactMethod) o;
    return Objects.equals(this.authorisedContactFlag, contactMethod.authorisedContactFlag) &&
        Objects.equals(this.cessationDate, contactMethod.cessationDate) &&
        Objects.equals(this.commencementDate, contactMethod.commencementDate) &&
        Objects.equals(this.email, contactMethod.email) &&
        Objects.equals(this.fax, contactMethod.fax) &&
        Objects.equals(this.internet, contactMethod.internet) &&
        Objects.equals(this.location, contactMethod.location) &&
        Objects.equals(this.mobile, contactMethod.mobile) &&
        Objects.equals(this.preferredContactFlag, contactMethod.preferredContactFlag) &&
        Objects.equals(this.sourceCode, contactMethod.sourceCode) &&
        Objects.equals(this.telephone, contactMethod.telephone) &&
        Objects.equals(this.telex, contactMethod.telex) &&
        Objects.equals(this.usageCode, contactMethod.usageCode) &&
        Objects.equals(this.verifiedFlag, contactMethod.verifiedFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisedContactFlag, cessationDate, commencementDate, email, fax, internet, location, mobile, preferredContactFlag, sourceCode, telephone, telex, usageCode, verifiedFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactMethod {\n");
    
    sb.append("    authorisedContactFlag: ").append(toIndentedString(authorisedContactFlag)).append("\n");
    sb.append("    cessationDate: ").append(toIndentedString(cessationDate)).append("\n");
    sb.append("    commencementDate: ").append(toIndentedString(commencementDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    internet: ").append(toIndentedString(internet)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    preferredContactFlag: ").append(toIndentedString(preferredContactFlag)).append("\n");
    sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    telex: ").append(toIndentedString(telex)).append("\n");
    sb.append("    usageCode: ").append(toIndentedString(usageCode)).append("\n");
    sb.append("    verifiedFlag: ").append(toIndentedString(verifiedFlag)).append("\n");
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

