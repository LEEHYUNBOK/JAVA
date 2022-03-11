/*
  파일명 : MyArrayStack.java
  작성자 : 이현복
  작성일 : 2018-10-26
  설명 : 정수 자료를 저장하기 위해, 순차 자료구조로 구현한 정수 스택 클래스(MyArrayStack)를 정의하고 이용하는 프로그램을 작성하시오.
 */
package hw7_1;

public class MyArrayStack {
	private int[] array;
	int top = -1;
	public MyArrayStack() {
		array = new int[5];
	}
	public MyArrayStack(int num) {
		array = new int[num];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == array.length-1);
	}
	public void push(int num) {
		if(isEmpty() == true) {
			top++;
			array[0] = num;
		}
		else {
			for(int i = top; i>=0; i--) {
				array[i+1] = array[i];
			}
			top++;
			array[0] = num;
		}
	}
	public int pop() {
		if(isEmpty() == true) {
			return 0;
		}
		else {
			int num = array[0];
			array[0]=0;
			for(int i = 0;i<top;i++) {
				array[i] = array[i+1];
			}
			top--;
			return num;
		}
	}
	public int peek() {
		return array[0];
	}
}
