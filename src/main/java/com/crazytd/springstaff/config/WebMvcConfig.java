package com.crazytd.springstaff.config;

import com.crazytd.springstaff.interceptor.SpringSecurityInterceptor;
import com.heweather.sdk.api.HeConfig;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private SpringSecurityInterceptor springSecurityInterceptor;

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addViewController("/login").setViewName("login");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(springSecurityInterceptor);
	}
}
