package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           ApplicationContext context=new ClassPathXmlApplicationContext("scope.xml");
           
           User user=(User) context.getBean("u");
           System.out.println("User Name:"+user.getName());
           
           
           user.setName("Vijay");
           System.out.println("User Name:"+user.getName());

           //creating another obj
           User user1=(User) context.getBean("u");
           System.out.println("User Name:"+user1.getName());

           System.out.println(user);
           System.out.println(user1);
	}

}
