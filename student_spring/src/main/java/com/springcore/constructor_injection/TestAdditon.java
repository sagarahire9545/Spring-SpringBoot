package com.springcore.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdditon {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor_injection/constr_inje_config.xml");
        Addition addition=(Addition) context.getBean("add");
        System.out.println(addition);
	}

}
