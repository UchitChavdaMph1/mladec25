package com.strs;

public class Exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "hello";
		System.out.println(str1);
		
		str1.concat(" Hii...Bye..");
		System.out.println(str1);
		
		String str2 = str1.concat(" Hii...Bye..");
		System.out.println(str2);
		
		
		
		// reversing a string without using inbuilt methods
		for (int i = str1.length()-1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
		}
		
	}

}
