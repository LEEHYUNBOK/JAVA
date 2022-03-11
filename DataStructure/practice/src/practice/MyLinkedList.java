package practice;


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
	public void k() {
		Node l = head;
		while(l.link != null) {
			l = l.link;
		}
		l.link = head;
	}
	public void add(int item) {
		Node t = new Node(item);
		Node k = head;
		t.link = head;
		head = t;
		while(k.link != t.link) {
			k = k.link;
		}
		k.link = t;
	}

	@Override
	public String toString() {
		String list = " ";
		Node l = head;
		int i =0;
		if(head == null)
			return "list=" + list;
		else {
			while(i<7) {
				list += (l.data+" ");
				l = l.link;
				i++;
			}
		}
		return "list=" + list;
	}
}