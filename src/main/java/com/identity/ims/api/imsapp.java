package com.identity.ims.api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication
@EnableSolrRepositories
public class imsapp {
/*
	@Configuration
	@ComponentScan(basePackageClasses = {EncounterEncounterSolrMapper.class})
	public static class ReceiveApplicationConfig { }
  */ 
	public static void main(String[] args) {
	 

        SpringApplication.run(imsapp.class, args);
      

	}

	void thingsTodo()
	{
		//TODO build table validation
		//TODO gotchas page 
		
	}

        

}

