package com.example.react2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/frontend1/{spring:\\w+}")
                .setViewName("forward:/frontend1");
        registry.addViewController("/frontend1/**/{spring:\\w+}")
                .setViewName("forward:/frontend1");
        registry.addViewController("/frontend1/{spring:\\w+}/**{spring:?!(\\.js|\\.css|\\.json)$}")
                .setViewName("forward:/frontend1");
        registry.addViewController("/frontend2/{spring:\\w+}")
                .setViewName("forward:/frontend2");
        registry.addViewController("/frontend2/**/{spring:\\w+}")
                .setViewName("forward:/frontend2");
        registry.addViewController("/frontend2/{spring:\\w+}/**{spring:?!(\\.js|\\.css|\\.json)$}")
                .setViewName("forward:/frontend2");
    }
}
