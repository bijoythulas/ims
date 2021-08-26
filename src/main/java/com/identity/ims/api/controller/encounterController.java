package com.identity.ims.api.controller;

import com.identity.ims.api.Entity.Encounter;
import com.identity.ims.api.dto.ShortsDto;
import com.identity.ims.api.services.EncounterService;
import com.identity.ims.api.services.SolrService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
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
  private  EncounterService service;

  

  @PostMapping("/registerEncounter")
  @ApiOperation(value = "Call this to register encounter", httpMethod = "POST")
  public Encounter registerEncounter(@Valid @RequestBody Encounter encounter) {
    
    return service.registerEncounter(encounter);
  }


  @RequestMapping("/GetEncounterById/{id}")
  @ApiOperation(value = "fetch encounter by id", httpMethod = "GET")
  public Encounter GetEncounterById(@PathVariable int id) {
    return service.getEncounterById(id);
  }
  
  private final SolrService solrService;

  

  @RequestMapping("/ClearSolr")
  @ApiOperation(value = "clear solr data", httpMethod = "GET")
  public Boolean ClearSolr() {
     return solrService.deleteAll();
  }



 
  /*
  public User getUserById(@PathVariable (value = "id") long userId) {
		return this.userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + userId));
	}
*/


  @RequestMapping("/GetEncounterMatches/{id}")
  @ApiOperation(value = "get encounter matches by id", httpMethod = "GET")
  public List<ShortsDto> GetEncounterMatches(@PathVariable int id) {
    return service.GetMatchesById(id);
  }
}
