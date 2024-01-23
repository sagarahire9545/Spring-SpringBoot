package com.cnamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cnamespace.Coder;

public class TestCoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     ApplicationContext context= new ClassPathXmlApplicationContext("coder.xml");
	     Coder coder=(Coder)context.getBean("abc");
	     
	     System.out.println(coder);
	}

}
