package com.test;

@FunctionalInterface
interface FunInf1 {
	void userData();
}

public class Exp14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BEFORE JDK 8 IMPLEMENTATION
		
		FunInf1 obj = new FunInf1() {
			@Override
			public void userData() {
				System.out.println("Overrided");
			}
		};
		obj.userData();
		
		new FunInf1() {
			public void userData() {
				System.out.println("Nameless Object");
			}
		}.userData();
	}

}
