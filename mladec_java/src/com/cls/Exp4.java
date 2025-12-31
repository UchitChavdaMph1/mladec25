package com.cls;

import java.util.Iterator;
import java.util.TreeSet;

public class Exp4 {
	
	public static void main(String[] args) {
		
		TreeSet<String> data = new TreeSet<>();
		
		data.add("java");
		data.add("python");
		data.add("php");
		data.add("go lang");
		data.add("typescript");
		data.add("angular");
		data.add("java");
		data.add("php");
		data.add("react");
		
		System.out.println(data);

		Iterator itr = data.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println(data.subSet("go lang",false, "python", true));
		
		System.out.println(data.ceiling("php"));
		System.out.println(data.floor("php"));
		
		System.out.println(data.lower("php"));
		System.out.println(data.higher("php"));
	}

}
