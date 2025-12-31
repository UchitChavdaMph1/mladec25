package com.cls;

class StackArray {
	private int maxSize;
	private int[] arr;
	private int top;
	
	public StackArray (int size) {
		this.maxSize = size;
		this.arr = new int[maxSize];
		this.top = -1;
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack Overflow !!!, c'ant add element");
			return;
		}
		
		arr[++top] = value;
		System.out.println("Element (" + value + ") added to the stack.");
		
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow !!!, c'ant remove element");
			return -1 ;
		}
		
		int tp = arr[top];
		top--;
		
		System.out.println("Element (" + tp + ") poped from the stack.");
		return tp;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack underfloe , unable to fetch element.");
			return -1;
		}
		System.out.println(arr[top]);
		return arr[top];
	}
}

public class Exp8 {

	public static void main(String[] args) {
		
		StackArray obj = new StackArray(5);
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		
		obj.peek();
		
		obj.pop();
		obj.peek();
;
		
		
		

	}

}
