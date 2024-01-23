package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//registering shutdown-hook calling 
		context.registerShutdownHook();
//		
//		Samosa samosa=(Samosa) context.getBean("sam");
//		System.out.println(samosa);
//		
//		System.out.println("************************************************");
//		
//		Pepsi pepsi=(Pepsi) context.getBean("psi");
//		System.out.println(pepsi);
//		
//		System.out.println("************************************************");
		Example example=(Example)context.getBean("ex");
		System.out.println(example);
		
	}

}
