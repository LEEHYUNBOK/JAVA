/*
  ���ϸ�: lab1_4.java
  �ۼ���: ������
  �ۼ���: 2018-09-04
  ����: ����ڰ� ���ϴ� ������ �������� �Է¹޾� �� ���������� ����� ���ϴ� ���α׷��� ������ ���� �ۼ��Ͻÿ�.
 */
package lab1_4;
import java.util.*;
public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_4: ������");
		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� �Է�: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.print("5���� ���� �Է�: ");
		for(int i = 0; i<n;i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("��� = "+getAverage(arr) );
	}
	public static double getAverage(int[] arr){
		double sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum/arr.length;
	}
}