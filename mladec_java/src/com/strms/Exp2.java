package com.strms;

import java.util.Arrays;
import java.util.List;

public class Exp2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("sky", "kohli", "dravid", "rohit", "dhoni");
		
		System.out.println(names);
		System.out.println();
		
		names.stream()
		.map(String :: toUpperCase)
		.sorted()
		.filter(x -> x.charAt(1)=='O')
		.forEach(System.out::println);
		System.out.println();
		
		List<Integer> nums = Arrays.asList(2, 3, 4, 6, 8);
		
		nums.stream()
		.map(x -> x*x)
		.forEach(System.out::println);
		
		
		
		

	}

}
