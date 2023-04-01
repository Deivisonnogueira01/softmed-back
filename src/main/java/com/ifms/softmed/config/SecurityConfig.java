package com.ifms.softmed.config;

import java.util.Arrays;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


  private static final String[] PUBLIC_MATCHERS = {"/h2-console/**"};

  @Autowired
  private Environment env;

  @Override
  protected void configure(HttpSecurity http) throws Exception {

    if(Arrays.asList(env.getActiveProfiles()).contains("test")){
      http.headers().frameOptions().disable();
    }

    http.cors().and().csrf().disable();
    

    http.authorizeHttpRequests().antMatchers(PUBLIC_MATCHERS).permitAll()
    .anyRequest().authenticated();

    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
  }

  @Bean
  CorsConfigurationSource configurationSource() {
    CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
    configuration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS"));
    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return source;

  }

}
