/*
  파일명 : MyDoublyLinkedListTest.java
  작성자 : 이현복
  작성일 : 2018-10-04
  설명  : 다음과 같이 내부적으로 이중 연결리스트를 사용하여 정수 리스트를 관리하는 MyDoublyLinkedList 클래스를 작성하고 사용하는 프로그램을 작성하시오.
 */
package lab6_2;

public class MyDoublyLinkedListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_2 : 이현복");
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		System.out.println(list);
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list);
		list.printList();
	}
}