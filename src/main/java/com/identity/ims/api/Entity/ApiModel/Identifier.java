package com.identity.ims.api.Entity.ApiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class Identifier   {
  
  private  LocalDate cessationDate;
  private  LocalDate commencementDate;
  private  String id;
  private  String idType;

  /**
   **/
  public Identifier cessationDate(LocalDate cessationDate) {
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
  public Identifier commencementDate(LocalDate commencementDate) {
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
  public Identifier id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public Identifier idType(String idType) {
    this.idType = idType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("idType")
  public String getIdType() {
    return idType;
  }
  public void setIdType(String idType) {
    this.idType = idType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identifier identifier = (Identifier) o;
    return Objects.equals(this.cessationDate, identifier.cessationDate) &&
        Objects.equals(this.commencementDate, identifier.commencementDate) &&
        Objects.equals(this.id, identifier.id) &&
        Objects.equals(this.idType, identifier.idType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cessationDate, commencementDate, id, idType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identifier {\n");
    
    sb.append("    cessationDate: ").append(toIndentedString(cessationDate)).append("\n");
    sb.append("    commencementDate: ").append(toIndentedString(commencementDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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

