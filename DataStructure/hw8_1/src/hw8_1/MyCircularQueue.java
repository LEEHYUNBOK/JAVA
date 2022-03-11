/*
  파일명 : MyCircularQueue.java
  작성자 : 이현복
  작성일 : 2018-11-02
  설명 : int형 큐를 배열을 이용하여 원형 큐로 구현하고 사용하는 프로그램을 작성하시오.
 */
package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {
	private int[] array;
	private int count=0;
	private int arraySize;
	private int front = 0;
	private int rear = 0;

	public MyCircularQueue(int arraySize) {
		this.arraySize = arraySize;
		array = new int[arraySize];
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == arraySize;
	}
	
	public void enQueue(int num) {
		if(isFull()) 
			System.out.println("큐가 가득차서 삽입할 수 없습니다.");
		else {
			count++;
			rear = (rear+1)%arraySize;
			array[rear]= num;
		}
	}
	
	public int deQueue() {
		if(isEmpty() == true)
			throw new NoSuchElementException();
		else {
			count--;
			front=(front+1)%arraySize;
			int num = array[front];
			return num;
		}
	}
	
	public int peek() {
		if(isEmpty() == true)
			throw new NoSuchElementException();
		else {
			return array[(front+1)%arraySize];
		}
	}
	public int size() {
		return count;
	}
}
