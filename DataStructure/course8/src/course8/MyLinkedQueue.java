/*
  ���ϸ�: MyLinkedQueue.java
  �ۼ���: ������
  �ۼ���: 2018-11-07
  ����: int�� ��(deque)�� ���߿��Ḯ��Ʈ�� �����ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package course8;

public class MyLinkedQueue {
	private class Node{
		int data;
		Node rlink;
		Node llink;
		Node(int data) {
			this.data = data;
			rlink = null;
			llink = null;
		}
	}
	Node temp;
	private Node front = null;
	private Node rear = null;
	
	public boolean isEmpty() {
		return (front==null) || (rear == null);
	}
	
	public void insertFront(int num) {
		temp = new Node(num);
		if(isEmpty()) {
			front = temp;
			rear = temp;
		}
		else {
			temp.rlink = front;
			front.llink = temp;
			front = temp;
		}
	}
	
	public void insertRear(int num) {
		temp = new Node(num);
		if(isEmpty()) {
			front = temp;
			rear = temp;
		}
		else {
			rear.rlink = temp;
			temp.llink = rear;
			rear = rear.rlink;
		}
	}

	public int deleteFront() {
		if(isEmpty()) {
			System.out.println("�ƹ��͵� �����ϴ�.");
			return 0;
		}
		else {
			int num = front.data;
			front = front.rlink;
			return num;
		}
	}

	public int deleteRear() {
		if(isEmpty()) {
			System.out.println("�ƹ��͵� �����ϴ�.");
			return 0;
		}
		else {
			int num = rear.data;
			rear = rear.llink;
			return num;
		}
	}

}
