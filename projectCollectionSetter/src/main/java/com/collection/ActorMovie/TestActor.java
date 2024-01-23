package com.collection.ActorMovie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestActor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("actormovie.xml");
		Actor actor=(Actor) context.getBean("act");
		actor.display();

	}

}
