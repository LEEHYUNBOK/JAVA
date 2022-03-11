/*
  파일명 : MyLinkedQueue.java
  작성자 : 이현복
  작성일 : 2018-11-05
  설명 : int형 큐를 단순연결리스트로 구현하고 사용하는 프로그램을 작성하시오.
 */
package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	private class Node {
		int data;  // 리스트 원소값
		Node link;  
		Node(int data) {
			this.data = data;
			this.link = null;
		}
	}
	Node temp;
	private Node front;
	private Node rear;
	private int count=0;
	
	public MyLinkedQueue() {
		front = null;
		rear = null;
	}

	public boolean isEmpty() {
		return (front==null);
	}

	public void enQueue(int num) {
		temp = new Node(num);
		if(isEmpty()) {
			count++;
			front = temp;
			rear = temp;
		}
		else {
			count++;
			rear.link = temp;
			rear = rear.link;
		}
	}

	public int deQueue() {
		if(isEmpty())
			throw new NoSuchElementException();
		else {
			count--;
			int num = front.data;
			front = front.link;
			return num;
		}
	}

	public int peek() {
		if(isEmpty() == true)
			throw new NoSuchElementException();
		else {
			return front.data;
		}
	}
	public int size() {
		return count;
	}
}
