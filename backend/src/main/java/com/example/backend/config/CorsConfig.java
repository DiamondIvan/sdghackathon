package com.example.backend.config; // ⚠️ MAKE SURE THIS MATCHES YOUR PACKAGE

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Apply to all endpoints
                        .allowedOrigins(
                                "https://localhost:5173", // Local React (Vite)
                                "https://localhost:3000", // Local React (Create React App)
                                "https://sdghackathon-frontend.vercel.app/" // ⚠️ REPLACE THIS LATER WITH YOUR VERCEL
                                                                            // URL
                )
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}