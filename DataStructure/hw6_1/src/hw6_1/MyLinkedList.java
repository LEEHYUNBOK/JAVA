/*
  파일명 : MyLinkedList.java
  작성자 : 이현복
  작성일 : 2018-10-04
  설명 : 다음과 같이 내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스를 작성하고 사용하는 프로그램을 작성하시오.
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
