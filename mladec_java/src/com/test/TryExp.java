package com.test;

@FunctionalInterface
interface intf {
	String greet(String msg);
}

public class TryExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intf obj = (String msg) -> {
			return msg;
		};
		
		System.out.println(obj.greet("Hello User"));

	}

}
