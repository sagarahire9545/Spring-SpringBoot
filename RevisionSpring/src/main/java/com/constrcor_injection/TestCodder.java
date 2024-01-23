package com.constrcor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCodder {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/constrcor_injection/codder.xml");
		Codder cd = (Codder) context.getBean("codd");
		System.out.println(cd);
	}

}
