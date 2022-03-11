/*
 * 파일명: MemberTest.java
 * 작성일: 2018.05.24
 * 작성자: 이현복
 * 내용:  회비는 회원 종류에 따라 달리 책정한다. (시간제회원은 사용시간당 100 이고, 정회원은 1000)
 */
package hw7_2;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_2: 이현복");
		double age=0;
		int sum=0;
		//크기가 4인 Member 배열을 생성
		Member[] peaple = new Member[4];
		//다음 4명 생성하여 위의 회원 배열에 저장
		peaple[0] = new HourlyMember(22,2);
		peaple[1] = new HourlyMember(33,3);
		peaple[2] = new RegularMember(44);
		peaple[3] = new RegularMember(55);
		//회원의 나이 평균을 구해 출력 <--- 반복문 이용할 것, 나이 리터럴 이용 금지
		//회원의 회비 합을 구해 출력 <--- 반복문 이용할 것, 회비 리터럴 이용 금지
		for(int i=0; i<peaple.length; i++) {
			age+=peaple[i].getAge();
			sum+=(peaple[i].getPayment());
		}
		System.out.println("나이 평균 : "+(age/peaple.length));
		System.out.println("회비 합 : " + (sum));
	}

}
