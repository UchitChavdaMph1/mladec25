package com.custom.qs;

class ArrayQueue {
	private int[] arr;
	private int front, rear, size, capacity;
	
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public int size() {
		return size;
	}
	
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full !!");
			return;
		}
		rear = (rear + 1)%capacity;
		arr[rear] = value;
		size++;
		System.out.println("Enqueued one item : " + value);
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("The queue is empty !!");
			return -1;
		}
		int value = arr[front];
		front = (front+1)%capacity;
		size--;
		System.out.println("Dequeued one item : " + value );
		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("The queue is empty !!!");
		}
		System.out.println("The top element is : " + arr[front]);
		return arr[front];
	}
}

public class Exp2 {

	public static void main(String[] args) {
		
		ArrayQueue data = new ArrayQueue(5);
		
		data.enqueue(101);
		data.enqueue(201);
		data.enqueue(301);
		data.enqueue(401);
		data.enqueue(501);
		
		data.peek();
		data.dequeue();
		data.peek();
		data.dequeue();
		data.dequeue();
		data.peek();
		data.dequeue();
		data.peek();
		data.dequeue();
		data.peek();

	}

}
