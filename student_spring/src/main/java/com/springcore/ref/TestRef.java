package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
 
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("refconfig.xml");
		A oa=(A) context.getBean("aref");
		System.out.println(oa.getX());
		System.out.println(oa.getOb().getY());
		System.out.println(oa);
	}
	
	
}
