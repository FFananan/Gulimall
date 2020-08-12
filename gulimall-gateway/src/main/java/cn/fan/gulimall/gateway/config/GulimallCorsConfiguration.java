package cn.fan.gulimall.gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfigurationSource;

import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfiguration {
    public CorsWebFilter corsWebFilter() {
        new UrlBasedCorsConfigurationSource()
        CorsConfigurationSource configurationSource = new
        return new CorsWebFilter();
    }
}
