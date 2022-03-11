/*
  ���ϸ� : MyLinkedList.java
  �ۼ��� : ������
  �ۼ��� : 2018-10-04
  ���� : ������ ���� ���������� �ܼ� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyLinkedList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw6_1;

class Node {
	int data;
	Node link;
	Node(int data) {
		this.data = data;
		this.link = null;
	}
}
public class MyLinkedList {
	private Node head = null;

	public void addFirst(int x) {
		Node t = new Node(x);
		t.link = head;
		head = t;
	}

	@Override
	public String toString() {
		String list = " ";
		Node l = head;
		while(l != null) {
			list += (l.data+" ");
			l = l.link;
		}
		return "list = " + list;
	}

	public int size() {
		Node t = head;
		int a = 0;
		while(t != null) {
			t = t.link;
			a++;
		}
		return a;
	}

	public void addLast(int num) {
		Node t = head;
		Node plusLast = new Node(num);
		while(t.link != null) {
			t = t.link;
		}
		t.link = plusLast;
	}

	public int removeFirst() {
		int a = head.data;
		head = head.link;
		return a;
	}

	public int removeLast() {
		int a = 0;
		Node t = head;
		while(t.link.link != null) {
			t = t.link;
		}
		a = t.link.data;
		t.link = null;
		return a;
	}
}
