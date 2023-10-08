package com.ifms.softmed.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/* 
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
   @Bean
   public Docket docket() {
          
      return new Docket(DocumentationType.SWAGGER_2)
      .useDefaultResponseMessages(false)
      .select()
      .apis(RequestHandlerSelectors.basePackage("com.ifms.softmed.controllers"))
      .paths(PathSelectors.any())
      .build()
      .apiInfo(apiInfo());
   }


   private ApiInfo apiInfo(){
      return new ApiInfoBuilder()
      .title("SOFTMED")
      .description("Api do Projeto SoftMed")
      .version("1.0")
      .contact(contact())
      .build();

   }


   private Contact contact(){
      return new Contact("Deivison Nogueira",
       "https://github.com/Deivisonnogueira01",
        "deivison.123nogueira@gmail.com");
   }
    
}
*/