package com.test;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigStudent.class);
		
		Student s1 = ctx.getBean("getSetterObj", Student.class);
		s1.setId(1);
		s1.setName("Arjun");
		s1.setSkills(Arrays.asList("Intelligent", "Great Warrior", "Skilled Archer", "Dancer"));
		s1.setCollege("Dronacharya Gurukul");
		System.out.println(s1);
		
		Student s2 = ctx.getBean("getConstObj", Student.class);
		System.out.println(s2);
		
		BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		Student s3 = (Student)bf.getBean("std");
		System.out.println(s3);
		
	}

	
	

}
