package com.inhs;

class C {
	public void show() {
		System.out.println("Top Most Parent");
	}
}

class D extends C{
	public void cat() {
		System.out.println("Intermediate Parent - 1");
	}
}

class E extends D {
	public void fox() {
		System.out.println("Intermediate Parent - 2");
	}
}

class F extends E {
	public void dog() {
		System.out.println("Bottom Most Class");
	}
}

public class Exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F obj = new F();
		
		obj.dog();
		obj.fox();
		obj.cat();
		obj.show();

	}

}
