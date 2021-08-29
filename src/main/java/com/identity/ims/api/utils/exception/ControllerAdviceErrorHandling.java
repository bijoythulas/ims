package com.identity.ims.api.utils.exception;




import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class ControllerAdviceErrorHandling {

  


  @ExceptionHandler(Exception.class)
public ResponseEntity<Map<String, String>> handleException(
        Exception e) throws IOException {
    Map<String, String> errorResponse = new HashMap<>();
    errorResponse.put("message", e.getLocalizedMessage());
    errorResponse.put("status", HttpStatus.INTERNAL_SERVER_ERROR.toString());

    System.out.println("globalExceptionHandling");
    return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
}

@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
public ResponseEntity<Map<String, String>> handleException(
        HttpRequestMethodNotSupportedException e) throws IOException {
    Map<String, String> errorResponse = new HashMap<>();
    String provided = e.getMethod();
    List<String> supported = Arrays.asList(e.getSupportedMethods());

    String error = provided + " is not one of the supported Http Methods (" +
            String.join(", ", supported) + ")";
    errorResponse.put("error", error);
    errorResponse.put("message", e.getLocalizedMessage());
    errorResponse.put("status", HttpStatus.METHOD_NOT_ALLOWED.toString());

    return new ResponseEntity<>(errorResponse, HttpStatus.METHOD_NOT_ALLOWED);
}


/**
 * called when exception raised when request does not contain nonnull json elements
 */
 @ExceptionHandler(HttpMessageNotReadableException.class)
public ResponseEntity<Map<String, String>> handleException(
        HttpMessageNotReadableException e) throws IOException {

    Map<String, String> errorResponse = new HashMap<>();
    errorResponse.put("message", e.getLocalizedMessage());
    errorResponse.put("status", HttpStatus.BAD_REQUEST.toString());

    return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
}

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  ValidationFailedResponse onMethodArgumentNotValidException(
    MethodArgumentNotValidException e
  ) {
    System.out.println("onMethodArgumentNotValidException");
      
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

  
@ExceptionHandler(ConstraintViolationException.class)
@ResponseStatus(HttpStatus.BAD_REQUEST)
@ResponseBody
ValidationFailedResponse onConstraintValidationException(
  ConstraintViolationException e
) {
  System.out.println("onConstraintValidationException");

  
  ValidationFailedResponse error = new ValidationFailedResponse();
  
  error.getViolations().add(
  new ViolationErrors(
          e.getConstraintName(),
          e.getMessage()
        ));

  return error;
}

  
/*

@ExceptionHandler(ConversionFailedException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String handleConflict(RuntimeException ex) {
    System.out.println("ConversionFailedException");
      return "Conversion failed:" + ex.getMessage();

  }

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

 


  

  */
}
