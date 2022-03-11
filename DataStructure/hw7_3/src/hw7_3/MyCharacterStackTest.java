/*
  파일명 : MyCharacterStackTest.java
  작성자 : 이현복
  작성일 : 2018-10-29
  설명 : 스택을 이용하여 수식의 괄호를 검사하는 프로그램을 작성하시오.
 */
package hw7_3;

import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_3 :이현복");
		Scanner input = new Scanner(System.in);
		MyCharacterStack stack = new MyCharacterStack();
		System.out.print("수식 입력: ");
		String str = input.nextLine();
		String[] list = str.split("");
		String answer = "";
		int check = 0;

		for(int i = 0;i<list.length; i++) {
			if(list[i].equals("(") || list[i].equals("<")) {
				stack.push(list[i]);
			}
			else if(list[i].equals(")")) {
				if(stack.isEmpty() == true) {
					answer = "잘못된 괄호 수식입니다.";
					check = 1;
					break;
				}
				else if(stack.peek().equals("(")) {
					stack.pop();
					answer = "올바른 괄호 수식입니다.";
				}
				else {
					answer = "잘못된 괄호 수식입니다.";
					check=1;
					break;
				}
			}
			else if(list[i].equals(">")) {
				if(stack.isEmpty() == true) {
					answer = "잘못된 괄호 수식입니다.";
					check = 1;
					break;
				}
				else if(stack.peek().equals("<")) {
					stack.pop();
					answer = "올바른 괄호 수식입니다.";
				}
				else {
					answer = "잘못된 괄호 수식입니다.";
					check=1;
					break;
				}
			}
		}
		if(check == 0) {
			if(stack.isEmpty() == false) 
				answer = "잘못된 괄호 수식입니다.";
			else
				answer = "올바른 괄호 수식입니다.";
		}
		System.out.println(answer);
	}
}
