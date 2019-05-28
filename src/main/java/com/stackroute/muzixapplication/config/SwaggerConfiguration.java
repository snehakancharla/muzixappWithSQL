package com.stackroute.muzixapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.stackroute")).paths(regex("/api/v2/.*")).build().apiInfo(appInfo());
    }

    private ApiInfo appInfo(){
        ApiInfo apiInfo = new ApiInfo("Muzix API(playmusic)","Spring boot Application for sound tracks","1.0","Terms Of Service",new Contact("Sneha","http://yahoo.com","lakshmisneha.516@gmail.com"),"Apache License Version 2.0","https://www.apache.org/license.html");
        return apiInfo;
    }
}
