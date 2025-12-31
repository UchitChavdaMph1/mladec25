package com.test;

class Book {
	static int pincode = 123456;
	int atmpin = 7890;
	
	//Constructor
	public Book() {
		System.out.println("Constructor");
	}
	
	//factory method return statement is same as class name
	public static Book getObj() {
		System.out.println();
		System.out.println("Factory Method");
		
		return new Book();
	}
	
	public int add() {
		return 6;
	}
	
	//Static Block
	static {
		System.out.println("Static Block "+pincode);
	}
	
	//Instance Block
	{
		System.out.println("Instance Block "+atmpin);
	}
}

public class Exp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		
		Book obj1 = new Book();
		
		Book obj2 = Book.getObj();
		
		Book obj3 = obj1;
		
		//Class.forName("Book");
	}

}
