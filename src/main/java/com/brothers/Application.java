package com.brothers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public LocalValidatorFactoryBean validator(MessageSource message){
//		LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
//		validatorFactoryBean.setValidationMessageSource(message);
//		return validatorFactoryBean;
//	}
}