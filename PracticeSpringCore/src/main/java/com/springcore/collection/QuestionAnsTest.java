package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionAnsTest {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collection/config.xml");
		QuetsionAns ans= (QuetsionAns) context.getBean("qns");
		System.out.println(ans);
	}

}
