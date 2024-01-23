package com.autowire.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/anno/annoconfig.xml");
		Student st = context.getBean("student", Student.class);
		System.out.println(st);
	}

}
