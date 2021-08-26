package com.identity.ims.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties (prefix = "com.identity.ims.api")
@Data
public class ImsConfig {
    
    private String scheduling;
    private String processEncountersJobdelay;
}
