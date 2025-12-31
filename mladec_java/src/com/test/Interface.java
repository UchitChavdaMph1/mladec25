package com.test;

interface Inf1 {
	float pi = 3.14f;
	
	void cat();
}

abstract class Abs {
	public abstract void disp();
	
	public void show() {
		System.out.println("Implemented method from abs");
	}
}

class Impl1 extends Abs implements Inf1 {
	@Override
	public void disp() {
		System.out.println("Abs method overrided");
	}
	
	@Override
	public void cat() {
		System.out.println("Inf method overrided");
	}
	
	public void dog() {
		System.out.println("Concrete class method");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impl1 obj = new Impl1();
		
		obj.cat();
		obj.disp();
		obj.show();
		obj.dog();
	}

}
