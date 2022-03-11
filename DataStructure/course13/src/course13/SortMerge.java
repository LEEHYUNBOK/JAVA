/*
 * ���ϸ�: SortMerge.java
 * �ۼ���: 2018.12.11
 * �ۼ���: ������
 * ����: �������İ� ������ �����ϰ� �̿��ϴ� ���α׷�
 */

package course13;

import java.util.Arrays;
import java.util.Random;

public class SortMerge {

	public static void main(String[] args) {
		System.out.println("course13: ������");
		Random generator = new Random();

		// array1, array2�� ���� ����(1~10)�� ���� ���Ұ�(0~99)���� �ʱ�ȭ
		int[] array1 = new int[generator.nextInt(10) + 1];
		for(int i = 0; i < array1.length; i++) {
			array1[i] = generator.nextInt(100);
		}
		int[] array2 = new int[generator.nextInt(10) + 1];
		for(int i = 0; i < array2.length; i++) {
			array2[i] = generator.nextInt(100);
		}

		// array1�� array2�� ����
		insertionSort(array1);     // (2) insertionSort ȣ��    
		insertionSort(array2);      
		System.out.println(" ���� ���:");
		System.out.println("array1 = " + Arrays.toString(array1));
		System.out.println("array2 = " + Arrays.toString(array2));

		// array1�� array2�� ������ ����� array3�� ���� ���
		int[] array3 = mergeArrays(array1, array2);  // (1) mergeArrays ȣ��
		System.out.println(" �� �迭�� ���� ���:");
		System.out.println("array3 = " + Arrays.toString(array3));
	}

	// (1) ���ĵ� �� �迭�� �����Ͽ� ���ο� �迭�� ��� �޼ҵ�
	private static int[] mergeArrays(int[] array1, int[] array2) {
		int[] k = new int[array1.length+array2.length];
		int i1=0;
		int i2=0;
		int i = 0;
		while(i1 < array1.length && i2 < array2.length) {
			if(array1[i1] <= array2[i2]) {
				k[i] = array1[i1];
				i1++;
			}
			else {
				k[i] = array2[i2];
				i2++;
			}
			i++;
		}
		if(i1 < array1.length) {
			while(i1 != array1.length) {
				k[i] = array1[i1];
				i1++;
				i++;
			}
		}
		if(i2 < array2.length) {
			while(i2 != array2.length) {
				k[i] = array2[i2];
				i2++;
				i++;
			}
		}
		return k; // �޼ҵ� �ϼ� �� ������ ��
	}

	// (2) ���� ���� �˰����� �̿��Ͽ� �迭�� ���ҵ��� ������������ �����ϴ� �޼ҵ� 
	private static void insertionSort(int[] array) {
		int num = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = i; j < array.length; j++) {
				if(array[i] > array[j]) {
					num=array[i];
					array[i] = array[j];
					array[j]=num;
				}
			}
		}



	}
}
