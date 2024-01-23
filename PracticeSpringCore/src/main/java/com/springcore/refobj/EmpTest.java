package com.springcore.refobj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/refobj/config.xml");
		Employee employee= (Employee) context.getBean("emp");
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getPo().getP_name());
		System.out.println("---------------");
		System.out.println(employee);
		
	}

}
