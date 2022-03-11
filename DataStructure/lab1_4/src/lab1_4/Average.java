/*
  파일명: lab1_4.java
  작성자: 이현복
  작성일: 2018-09-04
  설명: 사용자가 원하는 갯수의 정수값을 입력받아 이 정수값들의 평균을 구하는 프로그램을 다음과 같이 작성하시오.
 */
package lab1_4;
import java.util.*;
public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_4: 이현복");
		Scanner input = new Scanner(System.in);
		System.out.print("정수 개수 입력: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.print("5개의 정수 입력: ");
		for(int i = 0; i<n;i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("평균 = "+getAverage(arr) );
	}
	public static double getAverage(int[] arr){
		double sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum/arr.length;
	}
}