package com.custom.qs;

import java.util.NoSuchElementException;

class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedListQueue<T> {
	private Node<T> front , rear;
	private int size ;
	
	public LinkedListQueue() {
		this.front = front;
		this.rear = rear;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return this.front == null;
	}
	
	public int size() {
		return size;
	}
	
	public void enqueue(T item) {
		Node<T> newNode = new Node<>(item);
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
	
	public T dequeue() {
		if(isEmpty()) {
			System.out.println("Thr queue is empty!");
			throw(new NoSuchElementException("Queue is empty"));
		}
		
		T data = front.data;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		size--;
		return data;
	}
	
	public T peek() {
		if(isEmpty()) {
			throw(new NoSuchElementException("Queue is empty"));
		}
		return front.data;
	}
	
}

public class Exp1 {

	public static void main(String[] args) {
		
		LinkedListQueue<Integer> data = new LinkedListQueue<>();
		
		data.enqueue(101);
		data.enqueue(201);
		data.enqueue(301);
		data.enqueue(401);
		data.enqueue(501);
		
		System.out.println("Size : " + data.size());
		System.out.println("Peek : " + data.peek());
		System.out.println("Dequeue : " + data.dequeue());
		System.out.println("Peek : " + data.peek());

	}

}

































