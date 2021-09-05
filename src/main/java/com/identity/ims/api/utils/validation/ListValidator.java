package com.identity.ims.api.utils.validation;

import com.identity.ims.api.entity.enums.CodeTable;
import com.identity.ims.api.services.CodeTableService;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ListValidator
  implements ConstraintValidator<ListValidation, String> {

  @Autowired
  private CodeTableService codeTableService;

  private CodeTable codeTable;

  public void initialize(ListValidation constraint) {
    this.codeTable = constraint.codeTable();
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return codeTableService.CheckValidCode(codeTable, value);
  }
}
