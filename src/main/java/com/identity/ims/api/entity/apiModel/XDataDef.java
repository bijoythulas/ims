package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class XDataDef   {
  
  private  String stateFrom;
  private  String stateTo;
  private  String transitionTrigger;

  /**
   **/
  public XDataDef stateFrom(String stateFrom) {
    this.stateFrom = stateFrom;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("state_from")
  public String getStateFrom() {
    return stateFrom;
  }
  public void setStateFrom(String stateFrom) {
    this.stateFrom = stateFrom;
  }

  /**
   **/
  public XDataDef stateTo(String stateTo) {
    this.stateTo = stateTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("state_to")
  public String getStateTo() {
    return stateTo;
  }
  public void setStateTo(String stateTo) {
    this.stateTo = stateTo;
  }

  /**
   **/
  public XDataDef transitionTrigger(String transitionTrigger) {
    this.transitionTrigger = transitionTrigger;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transition_trigger")
  public String getTransitionTrigger() {
    return transitionTrigger;
  }
  public void setTransitionTrigger(String transitionTrigger) {
    this.transitionTrigger = transitionTrigger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XDataDef xDataDef = (XDataDef) o;
    return Objects.equals(this.stateFrom, xDataDef.stateFrom) &&
        Objects.equals(this.stateTo, xDataDef.stateTo) &&
        Objects.equals(this.transitionTrigger, xDataDef.transitionTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateFrom, stateTo, transitionTrigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XDataDef {\n");
    
    sb.append("    stateFrom: ").append(toIndentedString(stateFrom)).append("\n");
    sb.append("    stateTo: ").append(toIndentedString(stateTo)).append("\n");
    sb.append("    transitionTrigger: ").append(toIndentedString(transitionTrigger)).append("\n");
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

