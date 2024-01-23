package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/autowire/autowire.config.xml");
		Employee employee = context.getBean("emp",Employee.class);
		System.out.println(employee);
	}

}
