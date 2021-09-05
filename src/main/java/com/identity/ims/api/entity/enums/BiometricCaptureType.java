package com.identity.ims.api.entity.enums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "BiometricCaptureType description")
public enum BiometricCaptureType{
    @ApiModelProperty(notes="biometrics captured from CHIP")
    CHIP,
    @ApiModelProperty(notes="biometrics captured live during encounter")
    LIVE
  }