package com.cls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Exp1 {

	public static void main(String[] args) {
		
		// Collection data = new ArrayList();
		// List data = new ArrayList();
//		ArrayList data = new ArrayList();
//		CopyOnWriteArrayList data = new CopyOnWriteArrayList();
		
		LinkedList data  = new LinkedList();
		
		data.add(1000);
		data.add("java");
		data.add('a');
		data.add("java");
		data.add(22.33f);
		data.add(33.22);
		data.add(false);
		data.add("hello");
		
		System.out.println(data);
		
		// Iterator, ListIteratorand Enumeration
		// Iterator itr = data.iterator();
		ListIterator itr = data.listIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("================");
		
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.out.println("================");
		
		System.out.println(data.getFirst());
		System.out.println(data.get(0));
		System.out.println(data.getLast());
		System.out.println(data.getClass());
		System.out.println(data.size());
		
		System.out.println("================");
		
		data.set(0, 2000);
		data.add(1, 1000);
		data.remove(0);
		
		System.out.println(data);
		
		System.out.println(data.size());
		
		data.remove("King");
		
		System.out.println(data.size());
		
		

	}

}
