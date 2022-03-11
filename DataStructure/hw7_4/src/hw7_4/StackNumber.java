/*
  ���ϸ� : StackNumber.java
  �ۼ��� : ������
  �ۼ��� : 2018-10-29
  ���� : ������ �̿��Ͽ� ����ǥ�� ������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw7_4;

import java.util.Scanner;
import java.util.Stack;

public class StackNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_4 :������");
		Scanner input = new Scanner(System.in);
		Stack<Double> stack = new Stack<Double>();
		System.out.print("����ǥ����� �Է�: ");
		String str = input.nextLine();
		str = str.trim();
		String[] list = str.split(" ");
		double num=0,num1=0, num2=0,sum=0;
		String answer = "";
		for(int i = 0;i<list.length;i++) {
			if(list[i].equals("+") || list[i].equals("-")|| list[i].equals("*")|| list[i].equals("/")) {
				if(stack.isEmpty()==true) {
					answer = "�߸��� �����Դϴ�.";
					break;
				}
				num1 =stack.pop();
				if(stack.isEmpty()==true) {
					answer = "�߸��� �����Դϴ�.";
					break;
				}
				num2 =stack.pop();
				if(list[i].equals("+"))
					sum = num2+num1;
				if(list[i].equals("-"))
					sum = num2-num1;
				if(list[i].equals("*"))
					sum = num2*num1;
				if(list[i].equals("/"))
					sum = num2/num1;
				stack.push(sum);
			}
			else {
				num = Double.parseDouble(list[i]);
				stack.push(num);
			}
		}
		if(stack.isEmpty()==false)
			sum=stack.pop();
		if(stack.isEmpty()==false)
			System.out.println("�߸��� �����Դϴ�.");
		else if(answer != "�߸��� �����Դϴ�.")
			System.out.println("���  = " + sum);
		else 
			System.out.println(answer);
	}
}
