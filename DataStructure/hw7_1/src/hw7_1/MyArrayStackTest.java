/*
  ���ϸ� : MyArrayStackTest.java
  �ۼ��� : ������
  �ۼ��� : 2018-10-26
  ���� : ���� �ڷḦ �����ϱ� ����, ���� �ڷᱸ���� ������ ���� ���� Ŭ����(MyArrayStack)�� �����ϰ� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw7_1;

import java.util.Scanner;

public class MyArrayStackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1: ������");
		Scanner input = new Scanner(System.in);
		MyArrayStack stack = new MyArrayStack();
		int num;
		int element;
		do {
			System.out.println("1:���� 2:���� 3:��ȸ 4:�հ� 5:����");
			num = input.nextInt();
			switch(num){
			case 1:
				System.out.print("������ �Է��Ͻÿ�.");
				element = input.nextInt();
				stack.push(element);
				break;
			case 2:
				System.out.print("����");
				element = stack.pop();
				System.out.println(element);
				break;
			case 3:
				System.out.print("���");
				System.out.println(stack.peek());
				break;
			case 4:
				int sum = 0;
				while(!stack.isEmpty()) {
					sum +=stack.pop();
				}
				System.out.println("�� = "+ sum);
				break;
			case 5:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		}while(num != 5);
	}

}
