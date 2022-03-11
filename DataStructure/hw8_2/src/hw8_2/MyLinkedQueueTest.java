/*
  파일명 : MyLinkedQueueTest.java
  작성자 : 이현복
  작성일 : 2018-11-05
  설명 : int형 큐를 단순연결리스트로 구현하고 사용하는 프로그램을 작성하시오.
 */
package hw8_2;

import java.util.Scanner;

public class MyLinkedQueueTest {
	public static void main(String[] args) {
		System.out.println("lab8_1: 이현복");
		Scanner input = new Scanner(System.in);
		MyLinkedQueue queue = new MyLinkedQueue();
		int num;
		int delElement;
		int element;
		do {
			System.out.println("1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료");
			num = input.nextInt();
			switch(num){
			case 1:
				System.out.print("정수를 입력하시오.");
				element = input.nextInt();
				queue.enQueue(element);
				break;
			case 2:
				System.out.print("원소 삭제");
				delElement = queue.deQueue();
				System.out.println(delElement);
				break;
			case 3:
				System.out.print("원소 조회");
				System.out.println(queue.peek());
				break;
			case 4:
				System.out.println("크기 조회");
				System.out.println(queue.size());
				break;
			case 5:
				System.out.println("모든 원소 삭제");
				while(queue.size() > 0) {
					delElement = queue.deQueue();
					System.out.print(delElement+" ");
				}
				System.out.println("");
				break;
			case 6:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		}while(num != 6);
	}
}
