package com.test;

interface Inf3 {
	void add();
	interface Inf4 { //nested interface
		void sub();
	}
}

class Impl4 implements Inf3, Inf3.Inf4 {
	@Override
	public void add() {
		System.out.println("Add() method");
	}
	
	@Override
	public void sub() {
		System.out.println("Sub() method");
	}
}

public class Exp12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impl4 obj = new Impl4();
		
		obj.add();
		obj.sub();
	}

}
