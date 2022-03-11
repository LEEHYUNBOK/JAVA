package hw5_1;

import java.util.*;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("hw5_1 : ������");
		
		String[] word = new String[20]; 						// word �迭 ����
		
		System.out.print("20���� �ܾ� �Է�: ");
		for (int i = 0; i < 20; i++) {
			word[i] = sc.next(); 								// word�� �ܾ� ���ʷ� �Է�
		}
		
		
		System.out.println("1��° ���� �ܾ� = "+select(word,0,word.length-1,1));
		System.out.println("6��° ���� �ܾ� = "+select(word,0,word.length-1,6));
		System.out.println("17��° ���� �ܾ� = "+select(word,0,word.length-1,17));
		System.out.println("20��° ���� �ܾ� = "+select(word,0,word.length-1,20));
	}
	public static String select(String[] a,int p,int r,int i) {
		if(p==r)												// a�迭�� ũ�Ⱑ 1�� ��� a[p]�� ����
			return a[p];
		int q = partition(a,p,r);								// partition�޼ҵ忡�� ������ ���ذ��� q�� ����
		int k = q-p+1;											// k�� a�迭���� k��° ���� ������
		if(i<k)													// ���� k�� i���� ũ��
			return select(a,p,q-1,i);							// p~q-1������ �ؼ� �ٽ� ã�´�
		else if(i==k)											// ���� ������ q��° ����
			return a[q];
		else													// k�� i���� ������
			return select(a,q+1,r,i-k);							// q+1~r������ �ؼ� i-k��° ���� ���� ã��
	}
	public static int partition(String[] a, int min, int max) {
		String compare = a[max]; 								// �迭 ���κп� �ִ� ���ڿ��� �������� �Ǵ� compare�� ����
		int pivot = min - 1;									// min���� max�� �����ϱ� ���� p-1�� pivot�� ����, min���� �ö���鼭 ���� �������� �Ǵ� ����
		String change; 											// ��ȯ�� ���� change ����
		for (int j = min; j < max; j++) { 						// ó���� min���� max ���� �ݺ�
			if (a[j].compareToIgnoreCase(compare) <= 0) { 		// j��° ���ڿ��� compare���� ������
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
