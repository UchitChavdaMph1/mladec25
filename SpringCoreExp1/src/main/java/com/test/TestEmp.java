package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmp {
	
	public static void main(String[] args) {
		
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigEmployee.class);
		 
		 Employee emp1 = ctx.getBean("getSetterObj", Employee.class);
		 emp1.setId(101);
		 emp1.setName("Rohit");
		 emp1.setCmp("BCCI");
		 emp1.setSalary(10045);
		 System.out.println(emp1);
		 
		 Employee emp2 = ctx.getBean("getConstObj", Employee.class);
		 System.out.println(emp2);
		
	}

}
