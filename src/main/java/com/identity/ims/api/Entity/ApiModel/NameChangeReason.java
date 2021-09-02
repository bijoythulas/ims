package com.identity.ims.api.Entity.ApiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class NameChangeReason   {
  

public enum ReasonCodeEnum {

    ADOPTION(String.valueOf("ADOPTION")), ALTERNATIVE_SPELLING(String.valueOf("ALTERNATIVE_SPELLING")), ANGLICISATION_OF_NAME(String.valueOf("ANGLICISATION_OF_NAME")), BIRTH(String.valueOf("BIRTH")), CULTURAL_ORIGINS(String.valueOf("CULTURAL_ORIGINS")), DEED_POLL(String.valueOf("DEED_POLL")), DEPARTMENTAL_ERROR(String.valueOf("DEPARTMENTAL_ERROR")), DIVORCE(String.valueOf("DIVORCE")), GENDER_CHANGE(String.valueOf("GENDER_CHANGE")), MAIDEN_NAME(String.valueOf("MAIDEN_NAME")), MARRIAGE(String.valueOf("MARRIAGE")), NAME_IN_FULL(String.valueOf("NAME_IN_FULL")), NICKNAME(String.valueOf("NICKNAME")), OTHER(String.valueOf("OTHER")), PREFERRED_NAME(String.valueOf("PREFERRED_NAME")), PREFIX_AND_OR_SUFFIX(String.valueOf("PREFIX_AND/OR_SUFFIX")), RELIGIOUS_NAME(String.valueOf("RELIGIOUS_NAME")), REORDERING_OF_NAME(String.valueOf("REORDERING_OF_NAME")), SPLIT_OR_JOINING_NAME(String.valueOf("SPLIT_OR_JOINING_NAME")), TRANSLITERATION(String.valueOf("TRANSLITERATION")), TRUNCATION(String.valueOf("TRUNCATION"));


    private String value;

    ReasonCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ReasonCodeEnum fromValue(String value) {
        for (ReasonCodeEnum b : ReasonCodeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private  ReasonCodeEnum reasonCode;

  /**
   **/
  public NameChangeReason reasonCode(ReasonCodeEnum reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("reasonCode")
  public ReasonCodeEnum getReasonCode() {
    return reasonCode;
  }
  public void setReasonCode(ReasonCodeEnum reasonCode) {
    this.reasonCode = reasonCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameChangeReason nameChangeReason = (NameChangeReason) o;
    return Objects.equals(this.reasonCode, nameChangeReason.reasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameChangeReason {\n");
    
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
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

