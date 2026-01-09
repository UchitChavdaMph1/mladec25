package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer c1 = ctx.getBean("cust1", Customer.class);
		Customer c2 = ctx.getBean("cust2", Customer.class);
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
