package hw0_2;

import java.util.*;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("hw0_2 : 이현복");
		int number = 0;
		while (true) { 															// 양의 정수를 받기 위한 반복문
			System.out.print("양의 정수 n 입력: ");
			number = input.nextInt(); 											// 사용자로부터 키보드로 양의 정수 n을 입력
			if (number <= 0) { 													// number이 양의 정수가 아닐 경우
				System.out.println("다시 입력하시오");
				continue;
			} else 																// number이 양의 정수일 경우
				break;
		}
		System.out.println(); 													// 한칸 띄기
		System.out.println("factorial(" + number + ") = " + factorial(number)); // factorial(n)을 호출하여 리턴된 결과 값을 출력
		System.out.print("show(" + number + ") =");
		show(number); 															// show(n)을 호출
	}

	public static int factorial(int n) { 										// factorial 메소드 정의
		if (n == 1)
			return 1;
		return n * factorial(n - 1); 											// n * factorial(n-1) 리턴
	}

	public static void show(int n) { 											// show 메소드 정의
		if (n == 1)
			System.out.print(" " + n);											
		else {
			show(n - 1); 														// show(n-1) 정의
			System.out.print(" " + n); 											
		}
	}
}
