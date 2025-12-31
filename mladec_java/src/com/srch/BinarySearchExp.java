package com.srch;

public class BinarySearchExp {
	
	public static int searchElements(int[] arr, int target) {
		int l = 0;
		int h = arr.length;
		
		while (l <= h) {
			int m = l + (h-l) /2;
			
			if (arr[m] == target) {
				return m;
			}
			
			if (arr[m] < target) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {10, 15, 20, 25, 30, 35};
		int target = 25;
		int index = searchElements(arr, target);
		
		if (index != -1) {
			System.out.println("The target element is : " + arr[index]);
			System.out.println("Target value found on index : " + index);
		} else {
			System.out.println("Target value not found in array");
		}

	}

}
