package hw4_1; // hw4_1 ��Ű�� ����

import java.util.Scanner; // �Է� �ޱ����� Ŭ���� �ҷ�����
public class Age {

	public static void main(String[] args) { // �����Լ�
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in); // �Է� ��ü ����
	System.out.println("hw4_1: ������"); // ��¹� ����
	System.out.print("���� ���� �Է�: "); // ���� ���� �Է� ���
	int min = input.nextInt(); // ���� ���� �Է�
	System.out.print("���� ���� �Է�: "); // ���� ���� �Է� ���
	int max = input.nextInt(); // ���� ���� �Է�
	System.out.print("�л� �� �Է�: "); // �л� �� �Է� ���
	int num = input.nextInt(); // �л� �� �Է�
	int[] student = new int[max - min + 1]; // �л� �� �迭 ����
	for(int i=0; i < num;) { // �ݺ���
		System.out.print("���� �Է�: "); // ���� �Է� ���
		int age=input.nextInt(); // ���� �Է�
		if(min > age || max < age) { // ���� ���̰� ���Ѻ��� �۰ų� ���Ѻ��� ũ��
			System.out.println("������ ������ϴ�. �ٽ� �Է��ϼ���."); // �ٽ� �Է�
			continue; // �ݺ��� �ٽ� ����
		}
		else { // ���� �ƴϸ�
			student[-(min - age)] += 1; // ������ �л� �� 1 �߰�
		}
		i++; // �ݺ����� �� 1 �߰�
		
	}
	System.out.println("����  �л���"); // ���� �л��� ���
	for (int i = 0; i<num+1; i++) {
		System.out.println((min+i)+" "+student[i]); // ���Ѻ��� ���ѱ��� ����ϰ� ���� �л��� ���
	}
	}

}
