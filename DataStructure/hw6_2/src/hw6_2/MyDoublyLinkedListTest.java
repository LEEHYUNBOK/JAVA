/*
  ���ϸ� : MyDoublyLinkedListTest.java
  �ۼ��� : ������
  �ۼ��� : 2018-10-09
  ���� : ������ ���� ���������� ���� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyDoublyLinkedList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw6_2;

import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		System.out.println("hw6_2: ������");

		Scanner input = new Scanner(System.in);

		// (1) Integer�� Ÿ�� �Ű������� �Ͽ� ArrayList ��ü�� ����(list��� �̸��� ������ ����)
		MyDoublyLinkedList list = new MyDoublyLinkedList();// �ϼ��ϼ���.

		// (2) ����ڿ��� �޴��� �ݺ� �����ϰ� 7�� �Է��ϸ� �ݺ� ����
		int menu = 0;
		int element = 0;
		do {
			System.out.print("1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� 8:�պ���� 9:����");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("����Ʈ ��ü�� ��ȸ�մϴ�.");
				System.out.println(list.toString());   // �ϼ��ϼ���.
				break;
			case 2:
				System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");
				int size = list.size();  // �ϼ��ϼ���.
				System.out.println(size);
				break;
			case 3:
				System.out.println("���Ҹ� ����Ʈ�� �� �տ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.addFirst(element);  // �ϼ��ϼ���.
				break;
			case 4:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.addLast(element);;    // �ϼ��ϼ���.
				break;
			case 5:
				System.out.println("���Ҹ� ����Ʈ�� �� ���� �����մϴ�.");
				element = list.removeFirst();  // �ϼ��ϼ���.
				System.out.println(element);
				break;
			case 6:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڸ� �����մϴ�.");
				element = list.removeLast();  // �ϼ��ϼ���.
				System.out.println(element);
				break;
			case 7:
				System.out.println("���Ҹ� ����Ʈ���� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();
				boolean remove =list.remove(element);  // �ϼ��ϼ���.
				if(remove == true) {
					System.out.println("�����߽��ϴ�.");
				}
				else {
					System.out.println("���Ұ� �����ϴ�.");
				}
				break;
			case 8:
				System.out.println("����Ʈ ��ü�� �պ����� ��ȸ�մϴ�.");
				list.printList();   // �ϼ��ϼ���.
				break;
			case 9:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 9);
	}
}