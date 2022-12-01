package com.example.studentDemo.config;

import com.example.studentDemo.models.Clazz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class StudentConfig {
    @Bean
    @Primary
    public Clazz clazzConfig(){
        return new Clazz();
    }
}
