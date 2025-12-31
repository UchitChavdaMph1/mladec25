package com.cls;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int salary;
	
	public Employee (int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return 7;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.id = o.id;
	}
}

class NameSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class Exp7 {

	public static void main(String[] args) {
		
//		HashSet<Employee> data = new HashSet<>();
		TreeSet<Employee> data = new TreeSet<>(new NameSorting());
		
		data.add(new Employee(201, "dravid", 323));
		data.add(new Employee(501, "rohit", 345));
		data.add(new Employee(501, "rohit", 345));
		data.add(new Employee(301, "kohli", 222));
		data.add(new Employee(201, "dhoni", 392));
		data.add(new Employee(401, "sky", 893));
		data.add(new Employee(201, "dravid", 323));
		
		data.forEach(System.out::println);
		System.out.println(data.size());
		
		System.out.println(data.stream().filter(x -> x.getSalary() > 300).toList());
		
		Predicate<Employee> prdt = x -> x.getSalary() < 300;
		System.out.println(data.stream().filter(prdt).toList());
		
	}

}









































