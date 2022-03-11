/*
  ���ϸ� : MyLinkedQueueTest.java
  �ۼ��� : ������
  �ۼ��� : 2018-11-05
  ���� : int�� ť�� �ܼ����Ḯ��Ʈ�� �����ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw8_2;

import java.util.Scanner;

public class MyLinkedQueueTest {
	public static void main(String[] args) {
		System.out.println("lab8_1: ������");
		Scanner input = new Scanner(System.in);
		MyLinkedQueue queue = new MyLinkedQueue();
		int num;
		int delElement;
		int element;
		do {
			System.out.println("1:���� 2:���� 3:��ȸ 4:ũ�� 5:��ü���� 6:����");
			num = input.nextInt();
			switch(num){
			case 1:
				System.out.print("������ �Է��Ͻÿ�.");
				element = input.nextInt();
				queue.enQueue(element);
				break;
			case 2:
				System.out.print("���� ����");
				delElement = queue.deQueue();
				System.out.println(delElement);
				break;
			case 3:
				System.out.print("���� ��ȸ");
				System.out.println(queue.peek());
				break;
			case 4:
				System.out.println("ũ�� ��ȸ");
				System.out.println(queue.size());
				break;
			case 5:
				System.out.println("��� ���� ����");
				while(queue.size() > 0) {
					delElement = queue.deQueue();
					System.out.print(delElement+" ");
				}
				System.out.println("");
				break;
			case 6:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		}while(num != 6);
	}
}
