package com.passionhunt.ai.swaggerexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by i316579 on 31/07/18.
 */

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
     public Docket productApi(){
         return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.passionhunt.ai.swaggerexample")).paths(
                 PathSelectors.regex("/rest.*")).build();
     }
}
