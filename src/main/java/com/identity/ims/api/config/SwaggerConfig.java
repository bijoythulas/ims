package com.identity.ims.api.config;

/*
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
*/
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2


public class SwaggerConfig {
    //@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.identity.ims.api"))
                .paths(PathSelectors.any())
                .build()
                //.apiInfo(metaData())
                ;
    }
/*
    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("Tech Interface - Spring Boot Swagger Configuration")
                .description("\"Swagger configuration for application \"")
                .version("1.1.0")
                .license("Apache 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
                .contact(new Contact("Tech Interface", "www.google.com", "test@test.com"))
                .build();
    }
    */
    //for Swagger api doc generation
    //http://localhost:8083/v2/api-docs
}
