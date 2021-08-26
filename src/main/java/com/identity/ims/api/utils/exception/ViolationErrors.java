package com.identity.ims.api.utils.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ViolationErrors {
    private final String fieldName;
    private final String message;
}
