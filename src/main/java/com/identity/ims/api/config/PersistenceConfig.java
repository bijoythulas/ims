package com.identity.ims.api.config;

import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaAuditing
public class PersistenceConfig implements AuditorAware<String> {

    public Optional<String> getCurrentAuditor() {

        /*
          if you are using spring security, you can get the currently logged username with following code segment.
          SecurityContextHolder.getContext().getAuthentication().getName()
         */
        return Optional.ofNullable("ims_sys_user");
        
    }
}