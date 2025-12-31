package com.strs;

public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		String b = "Hello";
		String e = "Java";
		
		String c = new String("Hello");
		String d = new String("Hello");
		
		System.out.println(a == b);
		System.out.println(a == e);
		System.out.println(a == c);
		System.out.println(b == d);
		System.out.println(c == d);
		
		System.out.println(b.equals(d));
		
		
	}

}
