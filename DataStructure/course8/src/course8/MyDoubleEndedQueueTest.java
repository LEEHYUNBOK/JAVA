/*
  ���ϸ�: MyDoubleEndedQueueTest.java
  �ۼ���: ������
  �ۼ���: 2018-11-07
  ����: int�� ��(deque)�� ���߿��Ḯ��Ʈ�� �����ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package course8;

import java.util.Scanner;

public class MyDoubleEndedQueueTest {
	public static void main(String[] args) {
		System.out.println("course8: ������");
		Scanner input = new Scanner(System.in);
		MyLinkedQueue queue = new MyLinkedQueue();
		int menu = 0;
		int element = 0;
		do {
			System.out.print("1:�ջ��� 2:�ڻ��� 3:�ջ��� 4:�ڻ��� 5:��ü���� 6:����");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("���Ҹ� ����Ʈ�� �� �տ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				queue.insertFront(element);  // �ϼ��ϼ���.
				break;
			case 2:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				queue.insertRear(element);;    // �ϼ��ϼ���.
				break;
			case 3:
				System.out.println("���Ҹ� ����Ʈ�� �� ���� �����մϴ�.");
				element = queue.deleteFront();  // �ϼ��ϼ���.
				System.out.println(element);
				break;
			case 4:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڸ� �����մϴ�.");
				element = queue.deleteRear();  // �ϼ��ϼ���.
				System.out.println(element);
				break;
			case 5:
				System.out.println("����Ʈ�� ���Ҹ� ���� �����մϴ�.");
				while(queue.isEmpty() != true) {
					element = queue.deleteFront();
					System.out.print(element + " ");
				}
				System.out.println();
				break;
			case 6:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 6);
	}
}
