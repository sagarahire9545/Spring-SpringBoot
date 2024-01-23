package com.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Actor a=context.getBean(Actor.class);
	    a.setName("Nani");
	    
	    Movie m= context.getBean(Movie.class);
	    m.setmName("ShyamSing Roy");
	    
	    System.out.println(a.getName());
	    System.out.println(a.getMovie());
	    
	   
	}

}
