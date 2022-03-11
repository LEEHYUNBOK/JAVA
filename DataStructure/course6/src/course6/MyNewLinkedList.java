package course6;

public class MyNewLinkedList {
	private class Node {
		int data;
		Node link;
		Node(int item) {
			data = item;
			link = null;
		}
	}

	private Node head = null; // ����Ʈ�� ù��° ��带 ����Ŵ
	private Node last = null; // ����Ʈ�� ������ ��带 ����Ŵ

	// (1) ù��° ���� item�� �����ϴ� �޼ҵ� - ���� �ð��� O(1) �̾�� ��
	public void addFirst(int item) {
		if(head == null) {
			Node t = new Node(item);
			head = t;
			last = t;
		}
		else {
			Node t = new Node(item);
			t.link = head;
			head = t;
		}
	}

	// (2) ������ ���� item�� �����ϴ� �޼ҵ� - ���� �ð��� O(1) �̾�� ��
	public void addLast(int item) {
		if(head == null) {
			Node t = new Node(item);
			head = t;
			last = t;
		}
		else {
			Node t = new Node(item);
			last.link = t;
			last = last.link;
		}
	}

	@Override
	public String toString() {
		String result = "";
		Node tmp = head;
		while(tmp != null) {
			result += tmp.data + " ";
			tmp = tmp.link;
		}
		return result;
	}
}
