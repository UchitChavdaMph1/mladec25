package com.test;

import java.util.Scanner;

public class Exp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50, 60};
		
		for (int x : arr) {
			System.out.print(x + " ");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a num : ");
		
		int y = sc.nextInt();
		
		arr[5] = y;
		
		for (int x : arr) {
			System.out.print(x + " ");
		}
		
	}

}
