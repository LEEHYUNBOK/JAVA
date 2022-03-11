/*
  ���ϸ� : MyCircularQueue.java
  �ۼ��� : ������
  �ۼ��� : 2018-11-02
  ���� : int�� ť�� �迭�� �̿��Ͽ� ���� ť�� �����ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
			System.out.println("ť�� �������� ������ �� �����ϴ�.");
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
