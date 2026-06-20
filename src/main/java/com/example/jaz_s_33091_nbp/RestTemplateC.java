package com.example.jaz_s_33091_nbp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateC {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}