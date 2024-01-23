package com.without_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.without_xml")
public class ActorConfig {
	
	@Bean
	public Actor getActor() {
		Actor ac=new Actor();
		ac.setaId(111);
		ac.setName("xyz");
		System.out.println("Here actor details is here.");
		return ac;
	}

}
