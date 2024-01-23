package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("questionconfig.xml");
        Question question=(Question) context.getBean("question");
        System.out.println(question);
	}

}
