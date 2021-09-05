package com.identity.ims.api.services;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.identity.ims.api.entity.apiModel.Country;
import com.identity.ims.api.entity.dto.CodeTableRowDto;
import com.identity.ims.api.entity.enums.CodeTable;

import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeTableService {

  @Autowired
  private EntityManager em;

  public boolean CheckValidCode(CodeTable codeTable, String code) {
    Query q = em.createNativeQuery(
      String.format(
        "select 1 from code.%s where code = :code",
        codeTable.name()
      )
    );
    q.setParameter("code", code);
    return !q.getResultList().isEmpty();
  }

  /*
  private int id;

  private String code;

  private String shortDescription;

  private String longDescription;

  private boolean isActive;
  */
  public CodeTableRowDto GetCodeTableRow(
    CodeTable codeTable,
    String code
  ) {
    return(CodeTableRowDto) em
    .createNativeQuery(
      String.format(
        "select ID , CODE,SHORT_DESCRIPTION ,LONG_DESCRIPTION  from code.%s where code = :code",
        codeTable.name()
      )
    )
    .setParameter("code", code)
    .unwrap( org.hibernate.query.NativeQuery.class)
    .setResultTransformer( Transformers.aliasToBean( CodeTableRowDto.class ) )
    .getSingleResult();

      
  } 

 

}
