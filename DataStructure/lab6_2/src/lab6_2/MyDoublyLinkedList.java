/*
  파일명 : MyDoublyLinkedList.java
  작성자 : 이현복
  작성일 : 2018-10-04
  설명  : 다음과 같이 내부적으로 이중 연결리스트를 사용하여 정수 리스트를 관리하는 MyDoublyLinkedList 클래스를 작성하고 사용하는 프로그램을 작성하시오.
 */
package lab6_2;

public class MyDoublyLinkedList {
	private class Node {
		int data;
		Node rlink;
		Node llink;
		Node(int data) {
			this.data = data;
			this.rlink = null;
			this.llink = null;
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

	public String toString() {
		String list = "list = ";
		Node t = head;
		while(t != null) {
			list += t.data + " ";
			t = t.rlink;
		}
		return list;
	}


	// 양방향 링크가 제대로 구성되었는지를 확인하기 위해 리스트를 왕복하며 출력하는 메소드
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
