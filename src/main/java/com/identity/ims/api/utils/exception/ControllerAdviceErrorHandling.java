package com.identity.ims.api.utils.exception;
/*
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
class ControllerAdviceErrorHandling {

  @ExceptionHandler(ResourceNotFoundException.class)
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  public String resourceNotFoundHandling(
    ResourceNotFoundException exception,
    WebRequest request
  ) {
    Logger logger = LoggerFactory.getLogger(ControllerAdviceErrorHandling.class);
    logger.info("enter resourceNotFoundHandling");

    return exception.getMessage();
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  public String globalExceptionHandling(
    Exception exception,
    WebRequest request
  ) {
    Logger logger = LoggerFactory.getLogger(ControllerAdviceErrorHandling.class);
    logger.info("enter globalExceptionHandling");
    return exception.getMessage();
  }


  @ExceptionHandler(ConversionFailedException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String handleConflict(RuntimeException ex) {
      return "Conversion failed:" + ex.getMessage();

  }


  @ExceptionHandler(ConstraintViolationException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  ValidationFailedResponse onConstraintValidationException(
    ConstraintViolationException e
  ) {
    Logger logger = LoggerFactory.getLogger(ControllerAdviceErrorHandling.class);
    logger.info("enter onConstraintValidationException");

    ValidationFailedResponse error = new ValidationFailedResponse();
    for (ConstraintViolation violation : e.getConstraintViolations()) {
      error
        .getViolations()
        .add(
          new ViolationErrors(
            violation.getPropertyPath().toString(),
            violation.getMessage()
          )
        );
    }
    return error;
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  ValidationFailedResponse onMethodArgumentNotValidException(
    MethodArgumentNotValidException e
  ) {
        Logger logger = LoggerFactory.getLogger(ControllerAdviceErrorHandling.class);
    logger.info("enter onMethodArgumentNotValidException");
    ValidationFailedResponse error = new ValidationFailedResponse();
    for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
      error
        .getViolations()
        .add(
          new ViolationErrors(
            fieldError.getField(),
            fieldError.getDefaultMessage()
          )
        );
    }
    return error;
  }
}
*/