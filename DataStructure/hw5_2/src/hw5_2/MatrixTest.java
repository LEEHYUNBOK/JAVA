/*
  파일명: MatrixTest.java
  작성자: 이현복
  작성일: 2018-09-26
  설명: 2차원 정수 배열로 표현된 행렬의 곱을 구하여 출력하는 프로그램을 작성하시오
 */
package hw5_2;

public class MatrixTest {
	public static void main(String[] args) {
		System.out.println("hw5_2: 이현복 ");
		System.out.println();
		// 행렬 x, y의 곱을 구하여 출력
		int[][] x = {
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4}
		};

		int[][] y = {
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2}
		};

		int[][] z = MyMatrixService.multiply(x,y);     
		MyMatrixService.print(z);
		System.out.println();

		// 행렬 a, b의 곱을 구하여 출력
		int[][] a = {
				{1, 1, 1},
				{2, 2, 2},
				{1, 2, 3},
				{4, 5, 6}
		};

		int[][] b = {
				{1, 1, 1, 1, -3},
				{1, 2, 3, 4, 5},
				{-2, 0, 6, 9, 12}
		};
		int[][] c = MyMatrixService.multiply(a,b);     
		MyMatrixService.print(c);
	}
}