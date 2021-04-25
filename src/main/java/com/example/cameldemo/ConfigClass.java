package com.example.cameldemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean(name = "bar1")
    public Bar xyz(){
        return new Bar();
    }

}
