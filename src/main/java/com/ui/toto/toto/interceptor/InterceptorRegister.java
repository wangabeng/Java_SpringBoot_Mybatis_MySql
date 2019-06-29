package com.ui.toto.toto.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class InterceptorRegister extends WebMvcConfigurationSupport {
	@Bean
	public HandlerInterceptor getMyInterceptor() {
		return new DuckTestInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(getMyInterceptor()).addPathPatterns("/**");
	}

}