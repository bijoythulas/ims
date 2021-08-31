package com.identity.ims.api.services;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.identity.ims.api.Entity.Encounter;
import com.identity.ims.api.dto.ShortsDto;

import com.identity.ims.api.repository.EncounterRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncounterService {

  @Autowired
  private EncounterRepository encounterRepository;

 

  @PersistenceContext
  @Autowired
  private EntityManager em;

  @Autowired
  private SolrService solrService; 

  @Autowired
  ObjectMapper objectMapper;

  @Transactional
  public Encounter registerEncounter(Encounter encounter) {
    //updateCountry();

    solrService.Save(encounter);
    
    encounterRepository.save(encounter);

    return encounter;
  }



  public Encounter getEncounterById(Integer id) {
    return encounterRepository.findById(id).get();
  }

  /**
   * example of a  a non entity aware dto object being returned to caller
   * @param id
   * @return
   */
  public List<ShortsDto> GetMatchesById(Integer id) {
    return encounterRepository.findMatches(id);
  }

  
  /**
   * this method uses entty manger to fetch 3 levels in one query avoid n+1 query.
   * @param id
   * @return
   */
  public Encounter fetchUsingEM(Integer id) {
    EntityGraph<Encounter> entityGraph = em.createEntityGraph(Encounter.class);
    // entityGraph.addAttributeNodes("matches");
    entityGraph.addSubgraph("matches").addAttributeNodes("encounterTypes");
    return em.find(Encounter.class, id, emProps(entityGraph));
  }

  Map<String, Object> emProps(Object entityGraph) {
    Map<String, Object> properties = new HashMap<>();
    properties.put("javax.persistence.fetchgraph", entityGraph);

    return properties;
  }
}
