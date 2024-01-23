package com.autowirin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiring.xml");
		Laptop laptop=(Laptop) context.getBean("lap");
		System.out.println(laptop);

	}
}
