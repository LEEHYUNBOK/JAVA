package hw7_2;

import java.util.EmptyStackException;

public class MyLinkedStack {
	private class Node {
		int data;  // 리스트 원소값
		Node link;  
		Node(int data) {
			this.data = data;
			this.link = null;
		}
	}
	private Node top =null;

	public void push(int a) {
		Node l = new Node(a);
		if(top == null) {
			top = l;
		}
		else {
			l.link =top;
			top = l;
		}
	}

	public int pop() {
		int a = 0;
		if(top == null) {
			throw new EmptyStackException();
		}
		else {
			a = top.data;
			top = top.link;
			return a;
		}
	}

	public int peek() {
		if(top == null) {
			throw new EmptyStackException();
		}
		else {
			return top.data;
		}
	}

	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		else {
			return false;
		}
	}
}
