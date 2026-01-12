package com.test.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.DBConfig;
import com.test.dao.CustomerDAO;
import com.test.model.Customer;

public class CustomerDemo {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
		
		CustomerDAO cdao = ctx.getBean(CustomerDAO.class);
		
		Customer c1 = new Customer();
		
		c1.setId(5);
		c1.setFirstName("Rohit");
		c1.setLastName("Sharma");
		c1.setLocation("BOMBAY");
//		cdao.createCustomer(c1);
		
//		Customer c2 = new Customer(5,"Virat", "Kohli", "Bangalore");
//		cdao.createCustomer(c2);
		
//		cdao.updateCustomer(c1);
		cdao.deleteCustomer(c1);
		
		List<Customer> customerList = cdao.getAllCustomers();
		customerList.forEach(System.out::println);
		
		
		
		
		System.out.println("Customer Data Updated");
		
		
	}

}
