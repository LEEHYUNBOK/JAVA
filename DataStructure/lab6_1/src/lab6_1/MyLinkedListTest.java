/*
  파일명: MyLinkedListTest.java
  작성자: 이현복
  작성일: 2018-09-27
  설명: 다음과 같이 내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스를 작성하고 사용하는 프로그램을 작성하시오.
 */
package lab6_1;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_1: 이현복");
		MyLinkedList list = new MyLinkedList();
		System.out.println(list);
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list);
	}

}
