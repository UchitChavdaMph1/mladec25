package com.test;

@FunctionalInterface
interface FunInf {
	String greetUser(String msg);
	
	static void cat() {
		System.out.println("funinf cat() method");
	}
	
	default void dog() {
		System.out.println("funinf dog() method");
		fox();
	}
	
	private void fox() {
		System.out.println("funinf fox() method");
	}
	
}

public class Exp13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AFTER JDK 8 IMPLEMENTATION
		
		FunInf  obj = (String msg) -> {
			System.out.println("funinf overrided");
			return msg;
		};
		
		System.out.println(obj.greetUser("Hello User"));
		
		obj.dog();
		FunInf.cat();
		
	}

}
