package course7;

import java.util.NoSuchElementException;

public class MyArrayQueue {
	// (1) private 인스턴스 변수 선언: 배열(array), 배열 크기(arraySize), front, rear
	private int[] array;
	private int arraySize = 0;
	private int front = 0;
	private int rear = 0;
	// (2) 생성자 : 크기가 5인 배열로 큐를 구현하도록 인스턴스 변수들을 초기화
	public MyArrayQueue() {
		this.arraySize = 5;
		array = new int[arraySize];
	}

	// 큐가 비어있는지를 검사
	public boolean isEmpty() {
		return rear == front;
	}

	// 큐가 가득찼는지를 검사
	public boolean isFull() {
		return (rear + 1) % arraySize == front;
	}

	// (3) 큐에 data를 삽입
	public void enQueue(int data) {
		if(isFull())
			System.out.println("큐가 가득차서 삽입 실패: " + data);
		else {
			rear = (rear + 1) % arraySize;
			array[rear] = data;
		}
	}

	// (4) 큐에서 원소를 하나 삭제하여 리턴
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
