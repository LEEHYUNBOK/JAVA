package hw4_1;

import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("hw4_1 : ������");
		System.out.println();

		int num = 0; 											// �ܾ� �� �Է¹��� num ����
		while (true) { 											// ���� ������ �ޱ� ���� �ݺ���
			System.out.print("�ܾ� �� �Է�:");
			num = sc.nextInt();									// ����ڷκ��� Ű����� ���� ���� n�� �Է�
			if (num <= 0) { 									// num�� ���� ������ �ƴ� ���
				System.out.println("�ٽ� �Է��Ͻÿ�");
				continue;
			} else 												// num�� ���� ������ ���
				break;
		}
		String[] word = new String[num]; 						// word �迭 ����
		System.out.print(num + "���� �ܾ� �Է�: ");
		for (int i = 0; i < num; i++) {
			word[i] = sc.next(); 								// word�� �ܾ� ���ʷ� �Է�
		}

		quickSort(word, 0, num - 1);
		System.out.print("�� ���� ��� = ");
		for (int i = 0; i < num; i++) {
			System.out.print(word[i] + " "); 					// word ���ĵȰ� ����ϱ�
		}
	}

	public static void quickSort(String[] a, int min, int max) {// ��� quickSort�޼ҵ� ����
		if (min < max) {
			int pivot = partition(a, min, max); 				// partition�޼ҵ� �����ؼ� ���� �� q�� ����
			quickSort(a, min, pivot - 1); 						// quickSort�޼ҵ� q�� �������� ����(p~q-1) �迭 ��� ����
			quickSort(a, pivot + 1, max); 						// quickSort�޼ҵ� q�� �������� ����(q+1~r) �迭 ��� ����
		}
	}

	public static int partition(String[] a, int min, int max) {
		String compare = a[max]; 								// �迭 ���κп� �ִ� ���ڿ��� �������� �Ǵ� compare�� ����
		int pivot = min - 1;									// min���� max�� �����ϱ� ���� p-1�� pivot�� ����, min���� �ö���鼭 ���� �������� �Ǵ� ����
		String change; 											// ��ȯ�� ���� change ����
		for (int j = min; j < max; j++) { 						// ó���� min���� max ���� �ݺ�
			if (a[j].compareToIgnoreCase(compare) <= -1) { 		// j��° ���ڿ��� compare���� ������
				change = a[++pivot]; 							// ++pivot��° ���ڿ��� compare���� ���� j��° ���ڿ��� ��ȯ
				a[pivot] = a[j]; 								// ���� �������� �Ǳ����� �ϳ��� �÷������
				a[j] = change;
			}
		}

		change = a[pivot + 1];									// compare���� ���ڿ��� �� ������ ���ڿ��� ��ȯ
		a[pivot + 1] = a[max];
		a[max] = change;

		return pivot + 1; 										// ���� �������� �Ǵ� compares+1�� ����
	}
}
