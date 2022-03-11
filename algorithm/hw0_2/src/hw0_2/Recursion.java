package hw0_2;

import java.util.*;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("hw0_2 : ������");
		int number = 0;
		while (true) { 															// ���� ������ �ޱ� ���� �ݺ���
			System.out.print("���� ���� n �Է�: ");
			number = input.nextInt(); 											// ����ڷκ��� Ű����� ���� ���� n�� �Է�
			if (number <= 0) { 													// number�� ���� ������ �ƴ� ���
				System.out.println("�ٽ� �Է��Ͻÿ�");
				continue;
			} else 																// number�� ���� ������ ���
				break;
		}
		System.out.println(); 													// ��ĭ ���
		System.out.println("factorial(" + number + ") = " + factorial(number)); // factorial(n)�� ȣ���Ͽ� ���ϵ� ��� ���� ���
		System.out.print("show(" + number + ") =");
		show(number); 															// show(n)�� ȣ��
	}

	public static int factorial(int n) { 										// factorial �޼ҵ� ����
		if (n == 1)
			return 1;
		return n * factorial(n - 1); 											// n * factorial(n-1) ����
	}

	public static void show(int n) { 											// show �޼ҵ� ����
		if (n == 1)
			System.out.print(" " + n);											
		else {
			show(n - 1); 														// show(n-1) ����
			System.out.print(" " + n); 											
		}
	}
}
