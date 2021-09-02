package com.identity.ims.api.Entity.ApiModel;

import com.identity.ims.api.Entity.ApiModel.RelationshipStatusCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class RelationshipStatus   {
  
  private  LocalDate cessationDate;
  private  LocalDate commencementDate;
  private  RelationshipStatusCode relationshipStatusCode;

  /**
   **/
  public RelationshipStatus cessationDate(LocalDate cessationDate) {
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
  public RelationshipStatus commencementDate(LocalDate commencementDate) {
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
  public RelationshipStatus relationshipStatusCode(RelationshipStatusCode relationshipStatusCode) {
    this.relationshipStatusCode = relationshipStatusCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("relationshipStatusCode")
  public RelationshipStatusCode getRelationshipStatusCode() {
    return relationshipStatusCode;
  }
  public void setRelationshipStatusCode(RelationshipStatusCode relationshipStatusCode) {
    this.relationshipStatusCode = relationshipStatusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipStatus relationshipStatus = (RelationshipStatus) o;
    return Objects.equals(this.cessationDate, relationshipStatus.cessationDate) &&
        Objects.equals(this.commencementDate, relationshipStatus.commencementDate) &&
        Objects.equals(this.relationshipStatusCode, relationshipStatus.relationshipStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cessationDate, commencementDate, relationshipStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipStatus {\n");
    
    sb.append("    cessationDate: ").append(toIndentedString(cessationDate)).append("\n");
    sb.append("    commencementDate: ").append(toIndentedString(commencementDate)).append("\n");
    sb.append("    relationshipStatusCode: ").append(toIndentedString(relationshipStatusCode)).append("\n");
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

