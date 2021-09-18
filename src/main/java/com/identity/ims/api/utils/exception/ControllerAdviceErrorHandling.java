package com.identity.ims.api.utils.exception;

import java.util.Objects;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
class ControllerAdviceErrorHandling {

  public static final String TRACE = "trace";

  @Value("${com.identity.ims.api.trace:false}")
  private boolean printStackTrace;

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
  public ResponseEntity<ErrorResponse> handleMethodArgumentNotValid(
    MethodArgumentNotValidException ex,
    WebRequest request
  ) {
    ErrorResponse errorResponse = new ErrorResponse(
      HttpStatus.UNPROCESSABLE_ENTITY.value(),
      "Validation error. Check 'errors' field for details."
    );

    for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
      errorResponse.addValidationError(
        fieldError.getField(),
        fieldError.getDefaultMessage()
      );
    }
    return ResponseEntity.unprocessableEntity().body(errorResponse);
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public ResponseEntity<ErrorResponse> handleAllUncaughtException(
    Exception exception,
    WebRequest request
  ) {
    return buildErrorResponse(
      exception,
      "Unknown error occurred",
      HttpStatus.INTERNAL_SERVER_ERROR,
      request
    );
  }

  @ExceptionHandler(ConstraintViolationException.class)
  @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
  public ResponseEntity<ErrorResponse> onConstraintValidationException(
    ConstraintViolationException e
  ) {
    ErrorResponse errorResponse = new ErrorResponse(
      HttpStatus.UNPROCESSABLE_ENTITY.value(),
      "Constraint violation. Check 'errors' field for details."
    );
    errorResponse.addValidationError(e.getConstraintName(), e.getMessage());

    return ResponseEntity.unprocessableEntity().body(errorResponse);
  }

  private ResponseEntity<ErrorResponse> buildErrorResponse(
    Exception exception,
    String message,
    HttpStatus httpStatus,
    WebRequest request
  ) {
    ErrorResponse errorResponse = new ErrorResponse(
      httpStatus.value(),
      exception.getMessage()
    );

    if (printStackTrace && isTraceOn(request)) {
      errorResponse.setStackTrace(ExceptionUtils.getStackTrace(exception));
    }
    
    return ResponseEntity.status(httpStatus).body(errorResponse);
  }

  private boolean isTraceOn(WebRequest request) {
    String[] value = request.getParameterValues(TRACE);
    return (
      Objects.nonNull(value) &&
      value.length > 0 &&
      value[0].contentEquals("true")
    );
  }
}
