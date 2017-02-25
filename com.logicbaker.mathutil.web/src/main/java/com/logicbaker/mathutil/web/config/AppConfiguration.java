package com.logicbaker.mathutil.web.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.logicbaker.mathutil.web.controller")
public class AppConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/views/**").addResourceLocations("/views/")
				.setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS).cachePublic());
		registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
	}

}
