package com.coda.api.cors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			
			@SuppressWarnings("unused")
			public void addCorsMapping(CorsRegistration corsRegistration) {
				corsRegistration.allowedHeaders("*").allowedMethods("GET", "POST", "PUT", "DELETE")
				.allowedOrigins("http://localhost:4200");
			};
		};
	}
}
