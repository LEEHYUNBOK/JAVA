/*
  * 파일명: RegularMember.java
  * 작성일: 2018.05.24
  * 작성자: 이현복
  * 내용:  회비는 회원 종류에 따라 달리 책정한다. (시간제회원은 사용시간당 100 이고, 정회원은 1000)
*/
package hw7_2;

public class RegularMember extends Member {
	//나이를 매개변수로 받아 초기화하는 생성자
	public RegularMember(int age) {
		super(age);
	}
	//getPayment() - 회비를 조회하는 메소드
	@Override
	public int getPayment() {
		// TODO Auto-generated method stub
		return 1000;
	}
}
