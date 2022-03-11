/*
 * 파일명: SortTest.java
 * 작성일: 2018.12.12
 * 작성자: 이현복
 * 설명: 병합 정렬 알고리즘을 이용하여 정수값을 오름차순 정렬하는 프로그램을 작성하시오.
 */
package hw11_1;

import java.util.Scanner;

public class SortTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("hw11_1 : 이현복");
		System.out.print("배열 크기 = ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.print("배열의 각 정수 = ");
		for(int i = 0; i < array.length;i++) {
			int num = input.nextInt();
			array[i] = num;
		}
		System.out.print("정렬 전 배열 =");
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		MyIntegerSort.mergeSort(array);
		System.out.print("정렬 후 배열 =");
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
