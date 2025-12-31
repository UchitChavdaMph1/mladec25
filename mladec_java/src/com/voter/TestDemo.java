package com.voter;
 
import java.util.Scanner;
 
public class TestDemo {
 
	public static void main(String[] args) throws ValidAgeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age: ");
		int age = sc.nextInt();
		VoterData obj = new VoterData();
		try {
			obj.checkAge(age);
		}catch(ValidAgeException e) {
			System.out.println("Invalid age");
		}
		sc.close();
 
	}
 
}