package com.dsgn;

class SingletonTest {
	public static SingletonTest obj; 
	
	private SingletonTest() {
		
	}
	
	public static SingletonTest getInstance() {
		if (obj == null) {
			obj = new SingletonTest();
		}
		return obj;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonTest obj1 = SingletonTest.getInstance();
		SingletonTest obj2 = SingletonTest.getInstance();
		
		System.out.println(obj1.hashCode()+ " "+obj2.hashCode());

	}

}
