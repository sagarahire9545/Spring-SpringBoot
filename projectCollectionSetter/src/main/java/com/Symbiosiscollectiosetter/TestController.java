package com.Symbiosiscollectiosetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ApplicationContext context=new ClassPathXmlApplicationContext("collect.xml");
		Question que=(Question) context.getBean("q");
		que.display();
	}

}
