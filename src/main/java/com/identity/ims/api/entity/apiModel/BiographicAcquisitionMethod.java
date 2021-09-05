package com.identity.ims.api.entity.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class BiographicAcquisitionMethod   {
  

public enum MethodEnum {

    NON_ELECTRONICALLY_SUPPLIED(String.valueOf("NON_ELECTRONICALLY_SUPPLIED")), ELECTRONICALLY_SUPPLIED(String.valueOf("ELECTRONICALLY_SUPPLIED")), CHIP(String.valueOf("CHIP")), IMAGE(String.valueOf("IMAGE")), LIVE(String.valueOf("LIVE")), BIOGRAPHIC_PAGE(String.valueOf("BIOGRAPHIC_PAGE")), OCR(String.valueOf("OCR")), MRZ(String.valueOf("MRZ")), KEYED(String.valueOf("KEYED")), INTERVIEW(String.valueOf("INTERVIEW")), OTHER_DEPARTMENT_SYSTEM(String.valueOf("OTHER_DEPARTMENT_SYSTEM")), CHIP_OR_MRZ(String.valueOf("CHIP_OR_MRZ")), OTHER(String.valueOf("OTHER"));


    private String value;

    MethodEnum (String v) {
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
    public static MethodEnum fromValue(String value) {
        for (MethodEnum b : MethodEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private  MethodEnum method;

  /**
   **/
  public BiographicAcquisitionMethod method(MethodEnum method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }
  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiographicAcquisitionMethod biographicAcquisitionMethod = (BiographicAcquisitionMethod) o;
    return Objects.equals(this.method, biographicAcquisitionMethod.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiographicAcquisitionMethod {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

