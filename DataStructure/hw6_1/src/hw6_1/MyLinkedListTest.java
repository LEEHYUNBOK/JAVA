/*
  파일명 : MyLinkedListTest.java
  작성자 : 이현복
  작성일 : 2018-10-04
  설명 : 다음과 같이 내부적으로 단순 연결리스트를 사용하여 정수 리스트를 관리하는 MyLinkedList 클래스를 작성하고 사용하는 프로그램을 작성하시오.
 */
package hw6_1;

import java.util.Scanner;

public class MyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("hw6_1: 이현복");

		Scanner input = new Scanner(System.in);

		// (1) Integer를 타입 매개변수로 하여 ArrayList 객체를 생성(list라는 이름의 변수에 저장)
		MyLinkedList list = new MyLinkedList();// 완성하세요.

		// (2) 사용자에게 메뉴를 반복 제공하고 7을 입력하면 반복 종료
		int menu = 0;
		int element = 0;
		do {
			System.out.print("1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("리스트 전체를 조회합니다.");
				System.out.println(list.toString());   // 완성하세요.
				break;
			case 2:
				System.out.println("리스트 길이를 조회합니다.");
				int size = list.size();  // 완성하세요.
				System.out.println(size);
				break;
			case 3:
				System.out.println("원소를 리스트의 맨 앞에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.addFirst(element);  // 완성하세요.
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.addLast(element);;    // 완성하세요.
				break;
			case 5:
				System.out.println("원소를 리스트의 맨 앞을 삭제합니다.");
				element = list.removeFirst();  // 완성하세요.
				System.out.println(element);
				break;
			case 6:
				System.out.println("원소를 리스트의 맨 뒤를 삭제합니다.");
				element = list.removeLast();  // 완성하세요.
				System.out.println(element);
				break;
			case 7:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 7);
	}
}