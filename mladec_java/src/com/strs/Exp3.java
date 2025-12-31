package com.strs;

public class Exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Java";
		
		StringBuffer sb = new StringBuffer(str1);
		
		str1.concat(" 25 V");
		System.out.println(str1);
		
		sb.append(" 25 V");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		sb.repeat(" Developer", 3);
		System.out.println(sb);
		
		System.out.println(new String("Test Java"));
		
		System.out.println(str1.repeat(3));

	}

}
