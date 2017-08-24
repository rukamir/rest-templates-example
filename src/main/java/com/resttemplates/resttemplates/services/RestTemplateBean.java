package com.resttemplates.resttemplates.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateBean {

    @Bean
    public static RestTemplate restTemplate() {
        return new RestTemplate();
    }
}