package com.identity.ims.api.utils.validation;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.identity.ims.api.enums.CodeTable;

import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ListValidator.class)
public @interface ListValidation {

    CodeTable codeTable(); 
    String message() default "This is not the valid item";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}