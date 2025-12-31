package com.strms;

import java.util.stream.Stream;

public class Exp5 {
	
	public static void main(String[] args) {
		
		Stream<Number> strm = Stream.of(10, 20, 30, 40);
//		System.out.println(strm);
//		System.out.println();	
		
		Stream<String> names = Stream.of("sky", "kohli", "dravid", "rohit", "dhoni");
//		System.out.println(names);
//		System.out.println();
		
		Stream.of(2, 4, 5, 6, 7).findAny().ifPresent(System.out::println);
//		System.out.println();
		
		Stream.of("java", "python", "kotlin").findAny().ifPresent(System.out::println);
		System.out.println();
		
		names.parallel().sorted().forEach(System.out::println);
		
		System.out.println("==============");
		
		Stream<String> names1 = Stream.of("sky", "kohli", "dravid", "rohit", "dhoni");
		
		names1.sorted().forEach(System.out::println);
		
		
	
		
		
		
	}

}
