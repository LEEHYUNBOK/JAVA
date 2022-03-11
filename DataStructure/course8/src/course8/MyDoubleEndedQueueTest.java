/*
  파일명: MyDoubleEndedQueueTest.java
  작성자: 이현복
  작성일: 2018-11-07
  설명: int형 덱(deque)을 이중연결리스트로 구현하고 사용하는 프로그램을 작성하시오.
 */
package course8;

import java.util.Scanner;

public class MyDoubleEndedQueueTest {
	public static void main(String[] args) {
		System.out.println("course8: 이현복");
		Scanner input = new Scanner(System.in);
		MyLinkedQueue queue = new MyLinkedQueue();
		int menu = 0;
		int element = 0;
		do {
			System.out.print("1:앞삽입 2:뒤삽입 3:앞삭제 4:뒤삭제 5:전체삭제 6:종료");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("원소를 리스트의 맨 앞에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				queue.insertFront(element);  // 완성하세요.
				break;
			case 2:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				queue.insertRear(element);;    // 완성하세요.
				break;
			case 3:
				System.out.println("원소를 리스트의 맨 앞을 삭제합니다.");
				element = queue.deleteFront();  // 완성하세요.
				System.out.println(element);
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤를 삭제합니다.");
				element = queue.deleteRear();  // 완성하세요.
				System.out.println(element);
				break;
			case 5:
				System.out.println("리스트의 원소를 전부 삭제합니다.");
				while(queue.isEmpty() != true) {
					element = queue.deleteFront();
					System.out.print(element + " ");
				}
				System.out.println();
				break;
			case 6:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 6);
	}
}
