package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDAO empdao = ctx.getBean("edao", EmployeeDAO.class);
		Employee emp = new Employee();
		
//		emp.setE_name("Kohli");
//		emp.setE_cmp("BCCI");
//		emp.setE_city("Mumbai");
		
//		emp.setE_name("Kohli");
//		emp.setE_cmp("BCCI");
//		emp.setE_city("Mumbai");
//		emp.setId(2);
		
//		emp.setId(1);
		
//		empdao.createEmployee(emp);
//		empdao.updateEmployee(emp);
//		empdao.deleteEmployee(emp);
		
		emp.setE_name("Sky");
		emp.setE_cmp("IPL");
		emp.setE_city("UP");
		
		empdao.insertEmployee(emp);
		
		System.out.println("Employee Data Updated");
		
	}

}
