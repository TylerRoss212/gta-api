package com.gtaapi;

import com.gtaapi.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GtaApiApplication {

    @Autowired
    private AppConfig appConfig;

    public static void main(String[] args) {
        SpringApplication.run(GtaApiApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
            String[] urls = appConfig.getUrls().split(",");
            for (String url : urls) {
                registry.addMapping("/api/**").allowedOrigins(url);
            }
            }
        };
    }
}
