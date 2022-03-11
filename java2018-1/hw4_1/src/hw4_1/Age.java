package hw4_1; // hw4_1 패키지 설정

import java.util.Scanner; // 입력 받기위한 클래스 불러오기
public class Age {

	public static void main(String[] args) { // 메인함수
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in); // 입력 개체 설정
	System.out.println("hw4_1: 이현복"); // 출력문 설정
	System.out.print("나이 하한 입력: "); // 나이 하한 입력 출력
	int min = input.nextInt(); // 나이 하한 입력
	System.out.print("나이 상한 입력: "); // 나이 상한 입력 출력
	int max = input.nextInt(); // 나이 상한 입력
	System.out.print("학생 수 입력: "); // 학생 수 입력 출력
	int num = input.nextInt(); // 학생 수 입력
	int[] student = new int[max - min + 1]; // 학생 수 배열 선언
	for(int i=0; i < num;) { // 반복문
		System.out.print("나이 입력: "); // 나이 입력 출력
		int age=input.nextInt(); // 나이 입력
		if(min > age || max < age) { // 만약 나이가 하한보다 작거나 상한보다 크면
			System.out.println("범위를 벗어났습니다. 다시 입력하세요."); // 다시 입력
			continue; // 반복문 다시 시작
		}
		else { // 만약 아니면
			student[-(min - age)] += 1; // 나이의 학생 수 1 추가
		}
		i++; // 반복문의 수 1 추가
		
	}
	System.out.println("나이  학생수"); // 나이 학생수 출력
	for (int i = 0; i<num+1; i++) {
		System.out.println((min+i)+" "+student[i]); // 하한부터 상한까지 출력하고 그의 학생수 출력
	}
	}

}
