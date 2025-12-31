package com.sorting;

public class InsertionSort {
	
	public static void sortElements(int[] arr) {
		int n = arr.length;
		
		for (int i=0; i<n; i++) {
			int k = arr[i];
			int j = i-1;
			
			while (j>=0 && arr[j]>k) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = k;
		}
	}
	
	public static void DisplayData(int[] arr)
	{
		for (int dt : arr) {
			System.out.print(dt + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] arr = {5, 2, 4, 6, 1, 3};
		
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
