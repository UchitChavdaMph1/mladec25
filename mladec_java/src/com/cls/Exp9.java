package com.cls;

import java.util.EmptyStackException;

class Node<T> {
	T data;
	Node<T> next;
//	Node<T> prev;
	
	Node(T data) {
		this.data = data;
		this.next = null;
	}
}


class LinkedListStack<T> {
	private Node<T> top;
	private int size;
	
	public LinkedListStack() {
		this.top = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
//	public boolean isFull() {
//		return top == size;
//	}
	
	public int size() {
		System.out.println("Size of the stack is : " + size);
		return size;
	}
	
	public void push(T element) {
		Node<T> newNode = new Node<>(element);
		newNode.next = top;
		top = newNode;
		size++;
		System.out.println("Pushed Element :" + element);
	}
	
	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack Undeflow!");
			throw(new EmptyStackException());
		}
		
		T poppedElement = top.data;
		top = top.next;
		size--;
		System.out.println("Popped Element :" + poppedElement);
		return poppedElement;
	}
	
	public T peek() {
		if (isEmpty()) {
			System.out.println("Stack Underflow!");
			throw(new EmptyStackException());
		}
		System.out.println("The top element is : " + top.data);
		return top.data;
	}
}


public class Exp9 {

	public static void main(String[] args) {

		LinkedListStack<Integer> data = new LinkedListStack<>();
		
		data.push(100);
		data.push(200);
		data.push(300);
		data.push(400);
		data.push(500);
		
		data.peek();
		data.pop();
		data.peek();
		data.pop();
		data.peek();
		data.pop();
		data.peek();
		data.pop();
		data.peek();
		data.pop();
//		data.peek();
//		data.pop();
		
		
		

	}

}

























