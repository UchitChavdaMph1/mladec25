package com.test.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.spring.service.EmployeeService;

public class SpringMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		String name = employeeService.getEmployee().getName();
		
		Thread.sleep(3000);
		
		System.out.println("AOP FROM MAIN CLASS : " + name);
		
		Thread.sleep(3000);
		
		employeeService.getEmployee().setName("MLA - Hero");
		
		Thread.sleep(3000);
		
		employeeService.getEmployee().throwException();
	}
}
