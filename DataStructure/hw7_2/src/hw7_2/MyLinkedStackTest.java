package hw7_2;

import java.util.Scanner;

public class MyLinkedStackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_2: ������");
		Scanner input = new Scanner(System.in);
		MyLinkedStack stack = new MyLinkedStack();
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
				System.out.print("���� ����");
				element = stack.pop();
				System.out.println(element);
				break;
			case 3:
				System.out.print("���� ���");
				System.out.println(stack.peek());
				break;
			case 4:
				int sum = 0;
				while(stack.isEmpty() != true) {
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

