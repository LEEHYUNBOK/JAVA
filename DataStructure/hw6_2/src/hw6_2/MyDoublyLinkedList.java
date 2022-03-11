/*
  파일명 : MyDoublyLinkedList.java
  작성자 : 이현복
  작성일 : 2018-10-09
  설명 : 다음과 같이 내부적으로 이중 연결리스트를 사용하여 정수 리스트를 관리하는 MyDoublyLinkedList 클래스를 작성하고 사용하는 프로그램을 작성하시오.
 */
package hw6_2;

public class MyDoublyLinkedList {
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
	private Node head = null;

	public void addFirst(int num) {
		Node t = new Node(num);
		if(head == null) {
			head = t;
		}
		else {
			t.rlink = head;
			head.llink = t;
			head = t;
		}
	}

	public int size() {
		Node t = head;
		int size = 0;
		while(t != null) {
			size++;
			t = t.rlink;
		}
		return size;
	}

	public void addLast(int num) {
		Node p = head;
		Node t = new Node(num);
		while(p.rlink != null) {
			p = p.rlink;
		}
		p.rlink = t;
		t.llink = p;
	}

	public int removeFirst() {
		if(head.rlink == null) {
			int num = head.data;
			head = null;
			return num;
		}
		else {
			int num = head.data;
			head.rlink.llink = null;
			head = head.rlink;
			return num;
		}
	}

	public int removeLast() {
		if(head.rlink == null) {
			int num = head.data;
			head = null;
			return num;
		}
		else {
			Node t = head;
			while(t.rlink != null) {
				t = t.rlink;
			}
			int num = t.data;
			t.llink.rlink = null;
			t.llink = null;
			return num;
		}
	}

	public boolean remove(int num) {
		Node t = head;
		if(head == null) {
			return false;
		}
		if(t.data == num) {
			if(t.rlink == null) {
				head = null;
				return true;
			}
			head.rlink.llink = null;
			head = head.rlink;
			return true;
		}
		while(t.rlink != null) {
			t = t.rlink;
			if(t.data == num) {
				if(t.rlink == null) {
					t.llink.rlink = null;
					t.llink = null;
					return true;
				}
				t.llink.rlink = t.rlink;
				t.rlink.llink = t.llink;
				t.rlink = null;
				t.llink = null;
				return true;
			}
		}
		return false;
	}

	public String toString() {
		String list = "list = ";
		Node t = head;
		while(t != null) {
			list += t.data + " ";
			t = t.rlink;
		}
		return list;
	}

	public void printList() {
		if(head == null) {
			System.out.println("( )( )");
		}
		else {
			Node temp = head;
			String list = "(";
			// .........  완성하세요.
			while(temp.rlink != null) {
				list += temp.data + " ";
				temp = temp.rlink;
			}
			list += temp.data + " ";
			list += ") (";
			while(temp.llink != null) {
				list += temp.data + " ";
				temp = temp.llink;
			}
			list += temp.data + " ";
			list += ")";
			System.out.println(list);
		}
	}
}
