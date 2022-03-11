/*
  ���ϸ� : MyCharacterStack.java
  �ۼ��� : ������
  �ۼ��� : 2018-10-29
  ���� : ������ �̿��Ͽ� ������ ��ȣ�� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw7_3;

import java.util.EmptyStackException;

public class MyCharacterStack {
	private class Node {
		String data;  // ����Ʈ ���Ұ�
		Node link;  
		Node(String data) {
			this.data = data;
			this.link = null;
		}
	}

	private Node top =null;

	public void push(String a) {
		Node l = new Node(a);
		if(top == null) {
			top = l;
		}
		else {
			l.link =top;
			top = l;
		}
	}

	public String pop() {
		String a = "";
		if(top == null) {
			throw new EmptyStackException();
		}
		else {
			a = top.data;
			top = top.link;
			return a;
		}
	}

	public String peek() {
		if(top == null) {
			throw new EmptyStackException();
		}
		else {
			return top.data;
		}
	}

	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		else {
			return false;
		}
	}
}
