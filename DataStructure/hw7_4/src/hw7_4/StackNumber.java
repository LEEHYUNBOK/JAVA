/*
  파일명 : StackNumber.java
  작성자 : 이현복
  작성일 : 2018-10-29
  설명 : 스택을 이용하여 후위표기 수식의 결과를 계산하는 프로그램을 작성하시오.
 */
package hw7_4;

import java.util.Scanner;
import java.util.Stack;

public class StackNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_4 :이현복");
		Scanner input = new Scanner(System.in);
		Stack<Double> stack = new Stack<Double>();
		System.out.print("후위표기수식 입력: ");
		String str = input.nextLine();
		str = str.trim();
		String[] list = str.split(" ");
		double num=0,num1=0, num2=0,sum=0;
		String answer = "";
		for(int i = 0;i<list.length;i++) {
			if(list[i].equals("+") || list[i].equals("-")|| list[i].equals("*")|| list[i].equals("/")) {
				if(stack.isEmpty()==true) {
					answer = "잘못된 수식입니다.";
					break;
				}
				num1 =stack.pop();
				if(stack.isEmpty()==true) {
					answer = "잘못된 수식입니다.";
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
			System.out.println("잘못된 수식입니다.");
		else if(answer != "잘못된 수식입니다.")
			System.out.println("결과  = " + sum);
		else 
			System.out.println(answer);
	}
}
