/*
 * ���ϸ�: SortTest.java
 * �ۼ���: 2018.12.12
 * �ۼ���: ������
 * ����: ���� ���� �˰����� �̿��Ͽ� �������� �������� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw11_1;

import java.util.Scanner;

public class SortTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("hw11_1 : ������");
		System.out.print("�迭 ũ�� = ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.print("�迭�� �� ���� = ");
		for(int i = 0; i < array.length;i++) {
			int num = input.nextInt();
			array[i] = num;
		}
		System.out.print("���� �� �迭 =");
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		MyIntegerSort.mergeSort(array);
		System.out.print("���� �� �迭 =");
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
