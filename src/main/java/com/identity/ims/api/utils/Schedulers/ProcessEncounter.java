package com.identity.ims.api.utils.Schedulers;
import java.util.Date;

import com.identity.ims.api.config.ImsConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@ConditionalOnProperty(name="com.identity.ims.api.scheduling",matchIfMissing = true)
class ProcessEncounter
{
     @Autowired
     private ImsConfig imsConfig;
     
     @Scheduled(fixedDelayString =  "${com.identity.ims.api.processEncountersJobdelay}")
          void ProcessEncounters()throws InterruptedException{
               System.out.println(imsConfig.getProcessEncountersJobdelay());
             System.out.println("Now is " + new Date());
     }

}
