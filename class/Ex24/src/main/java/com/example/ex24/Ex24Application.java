package com.example.ex24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Ex24Application {
    public static void main(String[] args) {
        SpringApplication.run(Ex24Application.class, args);
    }

//    @Bean
//    public WebMvcConfigurer coreConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry reg) {
//                reg.addMapping("/**").allowedOrigins("http://localhost:3000");
//            }
//        };
//    }
}