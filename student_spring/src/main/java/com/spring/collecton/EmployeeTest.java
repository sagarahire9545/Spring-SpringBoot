package com.spring.collecton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  ApplicationContext context=new ClassPathXmlApplicationContext("employeeconfig.xml");
	  Employee employee=(Employee) context.getBean("employee");
	  System.out.println(employee);
	}

}
