/*
  ���ϸ� : MyDoublyLinkedListTest.java
  �ۼ��� : ������
  �ۼ��� : 2018-10-04
  ����  : ������ ���� ���������� ���� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyDoublyLinkedList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package lab6_2;

public class MyDoublyLinkedListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_2 : ������");
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		System.out.println(list);
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list);
		list.printList();
	}
}