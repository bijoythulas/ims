package com.identity.ims.api.utils.validation;

import com.identity.ims.api.repository.Code.CountryRepository;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Convert;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class ListValidator
  implements ConstraintValidator<ListValidation, String> {

  List<String> validCountries = Arrays.asList("Australia", "Singapore");
  private String codeTable;

  public void initialize(ListValidation constraint) {
    this.codeTable = constraint.codeTable();
  }

  @Autowired
  private EntityManager entityManager;

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {

    return CheckValidCode(codeTable, value);
    
  }

  boolean CheckValidCode(String table, String code) {
    Query q = entityManager.createNativeQuery(
      "select 1 from code." + table + " where code = :code"
    );

    q.setParameter("code", code);

    //throws exception if nothing is returned
    return !q.getResultList().isEmpty();

    
  }
}
