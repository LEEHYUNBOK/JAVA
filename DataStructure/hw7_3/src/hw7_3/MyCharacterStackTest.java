/*
  ���ϸ� : MyCharacterStackTest.java
  �ۼ��� : ������
  �ۼ��� : 2018-10-29
  ���� : ������ �̿��Ͽ� ������ ��ȣ�� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw7_3;

import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_3 :������");
		Scanner input = new Scanner(System.in);
		MyCharacterStack stack = new MyCharacterStack();
		System.out.print("���� �Է�: ");
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
					answer = "�߸��� ��ȣ �����Դϴ�.";
					check = 1;
					break;
				}
				else if(stack.peek().equals("(")) {
					stack.pop();
					answer = "�ùٸ� ��ȣ �����Դϴ�.";
				}
				else {
					answer = "�߸��� ��ȣ �����Դϴ�.";
					check=1;
					break;
				}
			}
			else if(list[i].equals(">")) {
				if(stack.isEmpty() == true) {
					answer = "�߸��� ��ȣ �����Դϴ�.";
					check = 1;
					break;
				}
				else if(stack.peek().equals("<")) {
					stack.pop();
					answer = "�ùٸ� ��ȣ �����Դϴ�.";
				}
				else {
					answer = "�߸��� ��ȣ �����Դϴ�.";
					check=1;
					break;
				}
			}
		}
		if(check == 0) {
			if(stack.isEmpty() == false) 
				answer = "�߸��� ��ȣ �����Դϴ�.";
			else
				answer = "�ùٸ� ��ȣ �����Դϴ�.";
		}
		System.out.println(answer);
	}
}
