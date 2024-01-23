package com.spring.RevisionSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/RevisionSpring/student.config.xml");
	    Student s = (Student) context.getBean("stud");
	    System.out.println(s);
	}
}
