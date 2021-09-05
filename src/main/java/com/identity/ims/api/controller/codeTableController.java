package com.identity.ims.api.controller;

import com.identity.ims.api.entity.dto.CodeTableRowDto;
import com.identity.ims.api.entity.enums.CodeTable;
import com.identity.ims.api.services.CodeTableService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "CodeTable")
@RestController
public class codeTableController {

  @Autowired
  private CodeTableService codeTableService;

  @GetMapping("/GetCodeTableRow/{table}/{code}")
  public CodeTableRowDto GetCodeTableRow(
    @PathVariable("table") CodeTable table,
    @PathVariable("code") String code
  ) {
    return codeTableService.GetCodeTableRow(table, code);
  }
}
