/*
  파일명: MyLinkedList.java
  작성자: 이현복
  작성일: 2018-09-27
  설명: 다음과 같이 내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스를 작성하고 사용하는 프로그램을 작성하시오.
 */
package lab6_1;

public class MyLinkedList {
	private class Node{
		int data;
		Node link;
		Node(int x){
			data = x;
		}
	}
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
		return "list=" + list;
	}
}

