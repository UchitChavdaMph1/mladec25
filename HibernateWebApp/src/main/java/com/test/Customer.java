package com.test;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer1")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String location;
	
	
	public Customer() {
		
	}
	
	public Customer(int id) {
		this.id = id;
	}
	public static Customer fetchCustomerById(int id) {
		Customer ct = CustomerDAO.getCustomerById(id);
		return ct;
	}
	public static List<Customer> viewAllCustomers() {
		List<Customer> vct = CustomerDAO.ViewCustomer();
		System.out.println("Customer.java scene: ");
		System.out.println("Customers count: " + vct.size());
		for (Customer c : vct) {
		    System.out.println(c.getFirstName());
		}
		return vct;
	}
	public static int deleteCustomerById(int id) {
		int ci = CustomerDAO.deleteCustomer(id);
		return ci;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
 
 