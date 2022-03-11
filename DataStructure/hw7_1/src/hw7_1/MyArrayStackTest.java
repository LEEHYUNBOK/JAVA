/*
  파일명 : MyArrayStackTest.java
  작성자 : 이현복
  작성일 : 2018-10-26
  설명 : 정수 자료를 저장하기 위해, 순차 자료구조로 구현한 정수 스택 클래스(MyArrayStack)를 정의하고 이용하는 프로그램을 작성하시오.
 */
package hw7_1;

import java.util.Scanner;

public class MyArrayStackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1: 이현복");
		Scanner input = new Scanner(System.in);
		MyArrayStack stack = new MyArrayStack();
		int num;
		int element;
		do {
			System.out.println("1:삽입 2:삭제 3:조회 4:합계 5:종료");
			num = input.nextInt();
			switch(num){
			case 1:
				System.out.print("정수를 입력하시오.");
				element = input.nextInt();
				stack.push(element);
				break;
			case 2:
				System.out.print("삭제");
				element = stack.pop();
				System.out.println(element);
				break;
			case 3:
				System.out.print("출력");
				System.out.println(stack.peek());
				break;
			case 4:
				int sum = 0;
				while(!stack.isEmpty()) {
					sum +=stack.pop();
				}
				System.out.println("합 = "+ sum);
				break;
			case 5:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		}while(num != 5);
	}

}
