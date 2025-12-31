package com.sorting;

public class BubbleSort {
	
	public static void sortElements(int[] arr) {
		int n = arr.length;
		int t = 0;
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-1; j++) {
				if (arr[j] > arr[j+1]) {
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	}
	
	public static void DisplayData(int[] arr)
	{
		for (int dt : arr) {
			System.out.print(dt + ",");
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5, 1, 12, -5, 16};
		
		// Before sorting the data
		System.out.println("Array before sorting the data :");
		DisplayData(arr);
		System.out.println();
				
		// After sorting the data
		System.out.println("Array after sorting the data :");
		sortElements(arr);
		DisplayData(arr);

	}

}
