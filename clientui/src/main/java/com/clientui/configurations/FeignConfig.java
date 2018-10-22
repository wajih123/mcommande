package com.clientui.configurations;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public BasicAuthRequestInterceptor mBasicAuthInterceptor(){
        return new BasicAuthRequestInterceptor("utilisateur","mdp");
    }
}
