package com.identity.ims.api.controller;

import com.identity.ims.api.entity.dto.CodeTableRowDto;
import com.identity.ims.api.entity.enums.CodeTable;
import com.identity.ims.api.services.CodeTableService;
import io.swagger.annotations.Api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Api(tags = "CodeTable")
@RestController
public class codeTableController {

  @Autowired
  private CodeTableService codeTableService;

  Logger logger = LoggerFactory.getLogger(codeTableController.class);

  
  @GetMapping("/GetCodeTableRow/{table}/{code}")
  public CodeTableRowDto GetCodeTableRow(
    @PathVariable("table") CodeTable table,
    @PathVariable("code") String code
  ) {
    logger.info("enter");
    return codeTableService.GetCodeTableRow(table, code);
  }
}
