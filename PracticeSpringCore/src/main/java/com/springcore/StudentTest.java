package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {

	 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/student.xml");
	 Student  student= (Student) context.getBean("student");
	 System.out.println(student);
	}

}
