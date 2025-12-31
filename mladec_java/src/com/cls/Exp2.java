package com.cls;

import java.util.Stack;

public class Exp2 {

	public static void main(String[] args) {
		
		Stack data = new Stack();
		
		data.add(1000);
		data.add("java");
		data.add('a');
		data.add("java");
		data.add(22.33f);
		data.add(33.22);
		data.add(false);
		data.add("hello");
		
		System.out.println(data);
		data.push("Spring");
		System.out.println(data);
		System.out.println(data.pop());
		System.out.println(data);
		System.out.println(data.peek());
		
		System.out.println(data.search(1000));
//		data.clear();
		System.out.println(data.empty());

	}

}
