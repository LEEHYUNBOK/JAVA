/*
  * ���ϸ�: Multiply.java
  * �ۼ���: 2018.3.26
  * �ۼ���: ������
  * ����:  ������ Ǯ� ������ ä��
*/
package hw3_1;

import java.util.Random; // ���� ����
import java.util.Scanner;// �Է� ����
public class Multiply { // Multiply Ŭ���� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random generator = new Random(); // ���� ����
	Scanner input = new Scanner(System.in); // �Է� ����
	System.out.println("hw3_1: ������"); // hw3_1: ������ ���
	int d=0, e=0, f=0; // ���� ����, Ʋ�� ����, ���� ����
	for(int i=0 ; i < 5; i++) { // �ݺ��� i�� 5�� �Ǳ� ������ �ݺ�
		int a = generator.nextInt(9)+1; // a�� 1~9���� �������� ����
		int b = generator.nextInt(9)+1; // b�� 1~9���� �������� ����
		System.out.print(a+"*"+b+"= ?"); // ���� ���
		int c = input.nextInt(); // c�� �Է¹޾� ����
		if(c==a*b) // ���� c�� ���̶��
		{
			System.out.println("�����Դϴ�."); // ����
			d++; // ���� ���� 1 ���ϱ�
			f=f+20; // ������ 20�� �߰�
		}
		if(c==0) // c�� 0�̸�
		{
			System.out.println("���"); // ���
		}
		if(c!=a*b && c!=0) // ���� c�� ���� �ƴϰ� 0�� �ƴϸ�
		{
			System.out.println("Ʋ�Ƚ��ϴ�."); // ���
			e++; // Ʋ�� ���� 1 ���ϱ�
			if(f-10<0) // ������ 0���� ������
			{
				f=0; // ������ 0
			}
			else // �ƴϸ�
			{
				f=f-10; // ������ -10�� �߰� 
			}
		}
		}
	if(f>=50) // ������ 50�� �̻��̸�
	{
		System.out.println("����� "+d+" ����� "+e+" ���� "+f+" --> �հ�"); // ���
	}
	if(f<50) // ������ 50�� �̸��̸�
	{
		System.out.println("����� "+d+" ����� "+e+" ���� "+f+" --> ���հ�"); // ���
	}
	}

}