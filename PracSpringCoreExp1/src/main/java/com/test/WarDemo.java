package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WarDemo {
	
	public static void main(String[] args) {
		
		BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		
		Warrior obj1 = (Warrior)bf.getBean("war1");
		Warrior obj2 = (Warrior)bf.getBean("war2");
		
		System.out.println("Xml Data : ");
		System.out.println(obj1);
		System.out.print("Constructor Data : ");
		System.out.println(obj2);
		
	}

}
