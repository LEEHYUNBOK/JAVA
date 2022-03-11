package course7;

import java.util.NoSuchElementException;

public class MyArrayQueue {
	// (1) private �ν��Ͻ� ���� ����: �迭(array), �迭 ũ��(arraySize), front, rear
	private int[] array;
	private int arraySize = 0;
	private int front = 0;
	private int rear = 0;
	// (2) ������ : ũ�Ⱑ 5�� �迭�� ť�� �����ϵ��� �ν��Ͻ� �������� �ʱ�ȭ
	public MyArrayQueue() {
		this.arraySize = 5;
		array = new int[arraySize];
	}

	// ť�� ����ִ����� �˻�
	public boolean isEmpty() {
		return rear == front;
	}

	// ť�� ����á������ �˻�
	public boolean isFull() {
		return (rear + 1) % arraySize == front;
	}

	// (3) ť�� data�� ����
	public void enQueue(int data) {
		if(isFull())
			System.out.println("ť�� �������� ���� ����: " + data);
		else {
			rear = (rear + 1) % arraySize;
			array[rear] = data;
		}
	}

	// (4) ť���� ���Ҹ� �ϳ� �����Ͽ� ����
	public int deQueue() {
		if(isEmpty())
			throw new NoSuchElementException();
		else {
			front = (front + 1) % arraySize;
			int num = array[front];
			return num;
		}
	}
}
