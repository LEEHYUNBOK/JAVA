/*
  * 파일명: Member.java
  * 작성일: 2018.05.24
  * 작성자: 이현복
  * 내용:  회비는 회원 종류에 따라 달리 책정한다. (시간제회원은 사용시간당 100 이고, 정회원은 1000)
*/
package hw7_2;

public abstract class Member {
	private int age;
	//나이를 매개변수로 받아 초기화 하는 생성자
	public Member(int age) {
		this.age = age;
	}
	//나이 getter
	public int getAge() {
		return age;
	}
	//  getPayment() - 회비를 조회하는 메소드(매개변수는 없고, int형을 리턴하는 abstract method)
	public abstract int getPayment();
}
