package com.cls;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Exp3 {

	public static void main(String[] args) {
		
//		HashSet data = new HashSet();
		LinkedHashSet data = new LinkedHashSet<>();
		
		data.add(1000);
		data.add("java");
		data.add('a');
		data.add("java");
		data.add(22.33f);
		data.add(33.22);
		data.add(false);
		data.add("hello");
		
		System.out.println(data);
		System.out.println(data.size());
		
		Iterator itr = data.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
