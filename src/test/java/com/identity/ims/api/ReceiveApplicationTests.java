package com.identity.ims.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.identity.ims.api.Entity.Encounter;
import com.identity.ims.api.Entity.Match;

import com.identity.ims.api.services.MatchService;
import java.util.ArrayList;
import java.util.List;


import javax.validation.Valid;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ReceiveApplicationTests {

	private MatchService matchService;


		
	@BeforeEach
	void setUpservice() 
	{
		matchService = mock(MatchService.class);


	}
	@Test
	void RegisterEncounter() {
		
		List<Match> matches = new ArrayList<Match>();
  
  		  matches.add(new Match("joe bloggs", "p001"));

		when(matchService.GetPartyMatches()).thenReturn(matches);


	}
	
	@Test
	void RegisterEncounter2() 
	{

	

	} 

	void insertEncounters (@Valid Encounter encounter)
	{
	
	}

}
