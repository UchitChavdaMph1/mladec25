package com.voter;
 
public class VoterData {
	public void checkAge(int age) // throws ValidAgeException
	{
		if(age>=18) {
			System.out.println("Valid Age");
		}else {
			ValidAgeException ve = new ValidAgeException("Invalid Age");
			throw(ve);
		}
	}
 
}