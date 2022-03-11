/*
  * 파일명: Multiply.java
  * 작성일: 2018.3.26
  * 작성자: 이현복
  * 내용:  문제를 풀어서 점수를 채점
*/
package hw3_1;

import java.util.Random; // 랜덤 설정
import java.util.Scanner;// 입력 설정
public class Multiply { // Multiply 클래스 설정

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random generator = new Random(); // 랜덤 정의
	Scanner input = new Scanner(System.in); // 입력 정의
	System.out.println("hw3_1: 이현복"); // hw3_1: 이현복 출력
	int d=0, e=0, f=0; // 맞은 개수, 틀린 개수, 점수 정의
	for(int i=0 ; i < 5; i++) { // 반복문 i가 5가 되기 전까지 반복
		int a = generator.nextInt(9)+1; // a는 1~9까지 랜덤으로 정의
		int b = generator.nextInt(9)+1; // b는 1~9까지 랜덤으로 정의
		System.out.print(a+"*"+b+"= ?"); // 문제 출력
		int c = input.nextInt(); // c에 입력받아 저장
		if(c==a*b) // 만약 c가 답이라면
		{
			System.out.println("정답입니다."); // 츨력
			d++; // 맞은 개수 1 더하기
			f=f+20; // 점수에 20점 추가
		}
		if(c==0) // c가 0이면
		{
			System.out.println("통과"); // 출력
		}
		if(c!=a*b && c!=0) // 만약 c가 답이 아니고 0도 아니면
		{
			System.out.println("틀렸습니다."); // 출력
			e++; // 틀린 개수 1 더하기
			if(f-10<0) // 점수가 0보다 작으면
			{
				f=0; // 점수는 0
			}
			else // 아니면
			{
				f=f-10; // 점수에 -10점 추가 
			}
		}
		}
	if(f>=50) // 점수가 50점 이상이면
	{
		System.out.println("정답수 "+d+" 오답수 "+e+" 총점 "+f+" --> 합격"); // 출력
	}
	if(f<50) // 점수가 50점 미만이면
	{
		System.out.println("정답수 "+d+" 오답수 "+e+" 총점 "+f+" --> 불합격"); // 출력
	}
	}

}