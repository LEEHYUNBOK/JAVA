/*
  파일명 : MyCharacterStack.java
  작성자 : 이현복
  작성일 : 2018-10-29
  설명 : 스택을 이용하여 수식의 괄호를 검사하는 프로그램을 작성하시오.
 */
package hw7_3;

import java.util.EmptyStackException;

public class MyCharacterStack {
	private class Node {
		String data;  // 리스트 원소값
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
