package com.example.ex24.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry reg) {
        reg.addViewController("{spring:\\w+}").setViewName("forward:/");
        reg.addViewController("/**/{spring}:\\w+").setViewName("forward:/");
        reg.addViewController("/{spring:\\w+}/**{spring:?!(\\.js|\\.css|\\.json)$}").setViewName("forward:/");
    }
}
