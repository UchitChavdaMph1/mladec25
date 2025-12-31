package com.dtm;

import java.util.Arrays;
import java.util.List;

class  Customer {
	
}

public class Exp3 {

	private static double add(List<? extends Number> list) {
		double a = 0;
		
		for (Number n : list) {
;			a += n.doubleValue();
		}
		return a;
	}
	 //lower bound
	public static void lowerBounded(List<? super Integer> list) {
		System.out.println(list);
	}
	
	public static void unBoundedData(List<?> list) {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		 //upper bound
		List<Integer> list1 = Arrays.asList(12,3,4,5);
		add(list1);
		System.out.println(list1);
		System.out.println("Addition of list 1 :" + add(list1));
		
		List<Double> list2 = Arrays.asList(34.44,33.55,55.44);
		add(list2);
		System.out.println(list2);
		System.out.println("Addition of list 2 :" + add(list2));
		
		lowerBounded(list1);
		unBoundedData(list2);
		
		List<String> names = Arrays.asList("java", "python", "spring");
		unBoundedData(names);
		
		List<Customer> lstc = Arrays.asList(new Customer());
		unBoundedData(lstc);
		
	}

}
