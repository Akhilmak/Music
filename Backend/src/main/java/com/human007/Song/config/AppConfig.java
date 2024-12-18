package com.human007.Song.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Override
    public  void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173/","https://human-music.vercel.app/","http://localhost:3000/")
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true);
    }

}
