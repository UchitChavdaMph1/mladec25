package com.test;

public class accessSpecifier {
	 //global variables : have default values
	
	double c;
	long d;
	char e;
	boolean f;
	
	
	public void disp() {
		
		// local variables : does not have default values
		int a = 1;
		float b = 1.2f;
		
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessSpecifier obj = new accessSpecifier();
		obj.disp();
	}

}
