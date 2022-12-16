package com.ifms.softmed.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.ifms.softmed.security.JWTUtil;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
 
     @Autowired
     private JWTUtil jwtUtil;

     @Override
     protected void configure(HttpSecurity http) throws Exception{

     }

     @Override
     public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/v2/api-docs",
          "/configuration/ui",
          "swagger-resources/**",
          "/configuration/security",
          "/swagger-ui.html",
          "/webjars/**");
     }

     // @Bean
     // CustomAuthenticationHandler authenticationEntryPoint(){
    // return new CustomAuthenticationHandler();
    // }
}
