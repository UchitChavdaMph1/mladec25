package com.test;

import java.util.Arrays;
import java.util.List;

public class Exp15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Ram", "Krishna", "Arjun", "Abhimanyu", "Satyaki"};
		
		Arrays.sort(names);
		
//		System.out.println(names);
		
//		for (String dt : names) {
//			System.out.println(dt);
//		}
		
		List<String> list = Arrays.asList(names);
		
		System.out.println(list);
		
//		for (String dt : list) {
//			System.out.println(dt);
//		}
		
//		list.forEach(x -> System.out.println(x));
		
		list.forEach(System.out::println);
	}

}
