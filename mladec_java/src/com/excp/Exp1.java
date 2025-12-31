package com.excp;

public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "Java";
//		
//		System.out.println(str.charAt(0));
//		
//		System.out.println(10/2);
//		
//		int[] arr = {12, 33, 44};
//		System.out.println(arr[3]);
//		
//		System.out.println("Done. ");
		
		try {
			 System.out.println(10/5);
			 
			 String str = "Java";
			 System.out.println(str.charAt(1));
			 
			 int x = Integer.parseInt("11");
			 System.out.println(x);
			 
		} catch( ArithmeticException ae) {
			System.out.println("Do not enter Zero in the denominoter");
		} catch (NullPointerException npe) {
			System.out.println("String Input Mandatory");
		} catch (StringIndexOutOfBoundsException sie) {
			System.out.println("String index out of bound");
		} catch (Exception e) {
			System.out.println("Check your input !!");
		} finally {
			System.out.println("Outer Finally");
			try {
				
			} catch (Exception e) {
				
			} finally {
				 
			}
		} 
		
		

	}

}
