package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/empoyee.config.xml");
    	Employee employee= (Employee) context.getBean("emp");
    	System.out.println(employee);
    	
    }
}
