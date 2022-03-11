package hw5_2;

public class MyMatrixService {
	// (1) 정적 메소드 multiply를 작성하시오.
	// 이차원 정수 배열로 표현된 두개의 행렬을 매개변수로 받아 곱을 구해 결과를 이차원 정수 배열로 표현하여 리턴
	// 매개변수로 받은 두 행렬은 곱을 구하기에 타당한 크기라고 가정해도 됨
	public static int[][] multiply(int[][] x, int[][] y) {
		int[][] array2 = new int[x.length][y[0].length];
		for(int column=0;column<array2.length;column++) {
			for(int row=0;row<array2[0].length;row++) {
				for(int num=0;num<x[0].length;num++) {
					array2[column][row] += x[column][num] * y[num][row];
				}
			}
		}
		return array2;
	}
	// (2) 정적 메소드 print를 작성하시오.
	// 이차원 정수 배열로 표현된 하나의 행렬을 매개변수로 받아 한 줄에 한 행씩 출력
	public static void print(int[][] array) {
		for(int column=0;column<array.length;column++) {
			for(int row=0;row<array[0].length;row++) {
				System.out.print(array[column][row]+" ");
			}
			System.out.println();
		}
	}
}
