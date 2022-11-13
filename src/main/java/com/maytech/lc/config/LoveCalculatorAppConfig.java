package com.maytech.lc.config;

import javax.validation.Validator;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.maytech.lc.formator.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.maytech.lc.controllers")
public class LoveCalculatorAppConfig implements WebMvcConfigurer {

	// setup my view resolver

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	public MessageSource messageSource() {

		ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
		resourceBundleMessageSource.setBasename("messages");

		return resourceBundleMessageSource;
	}

	
	  @Bean(name="validator") public LocalValidatorFactoryBean validator() {
	  LocalValidatorFactoryBean localValidatorFactoryBean = new
	  LocalValidatorFactoryBean();
	  
	  localValidatorFactoryBean.setValidationMessageSource(messageSource());
	  
	  return localValidatorFactoryBean; }
	 

	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("inside addFormator method");
		registry.addFormatter(new PhoneNumberFormatter());
	}

	
	  @Override public org.springframework.validation.Validator getValidator() {
	  
	  return validator(); }
	 
}
