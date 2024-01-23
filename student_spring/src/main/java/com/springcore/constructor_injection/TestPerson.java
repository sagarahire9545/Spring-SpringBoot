package com.springcore.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor_injection/constr_inje_config.xml");
        Person person=(Person)context.getBean("person");
        System.out.println(person);
		
	}

}
