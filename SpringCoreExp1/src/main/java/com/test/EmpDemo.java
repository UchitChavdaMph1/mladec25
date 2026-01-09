package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {
	
	public static void main(String[] args) {
		
		BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		
//		Employee obj = bf.getBean("emp", Employee.class);
		Employee obj1 = (Employee)bf.getBean("emp1");
		Employee obj2 = (Employee)bf.getBean("emp2");
		Employee obj3 = (Employee)bf.getBean("emp3");
		
		List<Employee> list = Arrays.asList(obj1,obj2,obj3);
		
		System.out.println(list);
		
		System.out.println("Constructor Data : ");
		
		Employee obj4 = bf.getBean("emp4", Employee.class);
		
		System.out.println(obj4);
		
	}

}
