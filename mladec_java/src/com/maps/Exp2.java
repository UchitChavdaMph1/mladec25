package com.maps;

import java.util.TreeMap;

public class Exp2 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> data = new TreeMap<>();
		
		data.put("orange", 200);
		data.put("banana", 25);
		data.put("sprouts", 45);
		data.put("orange", 250);
		data.put("millets", 110);
		data.put("mango", 210);
		data.put("apple", 250);
		data.put("mango", 180);
		data.put("Zen", 33);
		
		System.out.println(data);
		
		data.forEach((k,v) -> System.out.println("Item : " + k + ", Price : " + v));

	}

}
