package com.identity.ims.api.controller;

import com.identity.ims.api.entity.apiModel.BiometricDetail;
import com.identity.ims.api.entity.apiModel.EncounterRequest;
import com.identity.ims.api.entity.dto.ShortsDto;
import com.identity.ims.api.entity.idh.Encounter;

import com.identity.ims.api.services.EncounterService;
import com.identity.ims.api.services.PayloadService;
import com.identity.ims.api.services.SolrService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.persistence.EntityManager;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

@Api(tags = "Encounters")
@RestController
@RequiredArgsConstructor
public class encounterController {

  @Autowired
  private EncounterService encounterService;

  @Autowired
  EntityManager entityManager;

  @Autowired
  PayloadService payloadService; 
  
 

  private final SolrService solrService;

  @PostMapping("/registerEncounter")
  @ApiOperation(value = "Call this to register encounter", httpMethod = "POST")
  public Encounter registerEncounter(@Valid @RequestBody Encounter encounter) {
    return encounterService.registerEncounter(encounter);
    
  }

  @RequestMapping("/GetEncounterById/{id}")
  @ApiOperation(value = "fetch encounter by id", httpMethod = "GET")
  public Encounter GetEncounterById(@PathVariable int id) {
    return encounterService.getEncounterById(id);
  }

  @RequestMapping("/GetEncounterMatchCountById/{id}")
  public String GetEncounterMatchCountById(@PathVariable Integer id) {
    //Encounter encounter =encounterRepository.getById(id);

    
    Encounter encounter = entityManager.find(Encounter.class, id);

    String ss = encounter.getContactEmail();

    return ss;
  }

  @RequestMapping("/ClearSolr")
  @ApiOperation(value = "clear solr data", httpMethod = "GET")
  public Boolean ClearSolr() {
    return solrService.deleteAll();
  }

 


  @RequestMapping("/GetEncounterAgency/{id}")
  @ApiOperation(value = "demostration to retrieve json request object that came from clients and return a attribute value", httpMethod = "GET")
  public String GetEncounterMatches(@PathVariable Integer id) {
     return payloadService.RetrievePayLoadById(id, EncounterRequest.class).getEncounterRegisterDetails().getAgencyName();
  }

  @PostMapping("/ID01")
  public Integer ID01(@Valid @RequestBody EncounterRequest encounterRequest) throws Exception {
    return encounterService.ID01(encounterRequest);
  }


}
