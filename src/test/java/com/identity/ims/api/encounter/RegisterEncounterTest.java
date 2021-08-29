package com.identity.ims.api.encounter;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.identity.ims.api.Entity.Encounter;

import com.identity.ims.api.repository.EncounterRepository;
import com.identity.ims.api.repository.SolrEncounterRepository;

import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

/*
 use @BeforeAll and @AfterAll instead.
 @BeforeEach and @AfterEach instead
 @ExtendWith
 Annotations reside in the org.junit.jupiter.api package.
 Assertions reside in org.junit.jupiter.api.Assertions
*/

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc

public class RegisterEncounterTest {

 

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  
  @Autowired 
  ObjectMapper objectMapper; 
  
  @Autowired 
  EncounterRepository encounterRepository; 

 @MockBean
 SolrEncounterRepository solrEncounterRepository;

  private static MediaType CONTENT_TYPE = new MediaType(
    MediaType.APPLICATION_JSON.getType(),
    MediaType.APPLICATION_JSON.getSubtype()
  );

  //@SuppressWarnings("unchecked")
    protected String json(Object o) throws IOException {
        return objectMapper.writeValueAsString(o);
    }
  @BeforeEach
  public void init() {
    mockMvc = webAppContextSetup(webApplicationContext).build();
    encounterRepository.deleteAll();

  }

  @Test
  @DisplayName("Register a simple encounter successfully")
  public void RegisterEncounter() throws Exception {

    Encounter encounter = new Encounter();
   
    /*
    Encounter encounter = new Encounter(
      "Joe Bloggs2",
      12,
      "aa@dd.com",
      "AUS",
      BiometricCaptureType.CHIP
    );

    */
    


   
    //Mockito.when(encounterRepository.save(encounter)).thenReturn(encounter);

    mockMvc
      .perform(
        post("/registerEncounter")
          .contentType(CONTENT_TYPE)
          .content(json(encounter))
      )
      .andExpect(status().isOk());
  }

  
}
