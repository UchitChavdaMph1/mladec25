package com.test;

import java.util.Scanner;

public class Exp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int x = sc.nextInt();
		
		if ( x%2 == 0) {
			System.out.println("The given number(" + x + ") is a EVEN number.");
		} else {
			System.out.println("The given number(" + x + ") is a ODD number.");
		}
	}

}
