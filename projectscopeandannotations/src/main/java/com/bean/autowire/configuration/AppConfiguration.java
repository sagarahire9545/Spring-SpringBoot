package com.bean.autowire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Bean  //it returns the bean to managed by the spring context
	 Employee getEmployee() {
		 return new Employee();
	 }
	
	@Bean
	Address getAddress() {
		return new Address();
	}

}
