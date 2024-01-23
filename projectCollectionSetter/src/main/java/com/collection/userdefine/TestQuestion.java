package com.collection.userdefine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("collect1.xml");
		
		Question que=(Question) context.getBean("q");
		que.display();

	}

}
