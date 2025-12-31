package com.sorting;

public class SelectionSort {
	
	public static void sortElements(int[] arr) {
		int n = arr.length;
		
		for (int i=0; i<n; i++) {
			int minIndex = i;
			for (int j=i+1; j<n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int t = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = t;
			}
		}
	}
	
	public static void DisplayData(int[] arr) {
		for (int dt : arr) {
			System.out.print(dt + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] arr = {5, 1, 12, -5, 16, 2, 12, 14};
		
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
