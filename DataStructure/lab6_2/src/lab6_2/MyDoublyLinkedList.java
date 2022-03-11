/*
  ���ϸ� : MyDoublyLinkedList.java
  �ۼ��� : ������
  �ۼ��� : 2018-10-04
  ����  : ������ ���� ���������� ���� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyDoublyLinkedList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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


	// ����� ��ũ�� ����� �����Ǿ������� Ȯ���ϱ� ���� ����Ʈ�� �պ��ϸ� ����ϴ� �޼ҵ�
	public void printList() {
		if(head == null) {
			System.out.println("( )( )");
		}
		else {
			Node temp = head;
			String list = "(";
			// .........  �ϼ��ϼ���.
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
