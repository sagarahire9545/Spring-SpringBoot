package com.ref.inject;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefObj {

	public static void main(String[] args) {

		ApplicationContext context =new ClassPathXmlApplicationContext("com/ref/inject/ref.xml");
		Patient p = (Patient) context.getBean("pat");
		System.out.println(p.getReport());
	}

}
