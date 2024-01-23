package com.without_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(ActorConfig.class);
		Actor ac = context.getBean(Actor.class);
//		ac.setaId(121);
//		ac.setName("Nani");
		//System.out.println(ac);
		
		
	}

}
