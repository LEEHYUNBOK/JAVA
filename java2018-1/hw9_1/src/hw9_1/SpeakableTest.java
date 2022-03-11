/*
 * 파일명: SpeakableTest.java
 * 작성일: 2018.05.24
 * 작성자: 이현복
 * 내용: Speakable 인터페이스를 정의하고, 이를 구현한 Person, Dog 클래스를 정의하고 이용하는 프로그램을 작성하시오.
 */
package hw9_1;

public class SpeakableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw9_1: 이현복");
		//크기가 4인 Speakble 배열을 생성
		Speakable[] peaple = new Speakable[4];
		//Person 객체 2개, Dog 객체 2개를 생성하여 배열에 저장
		//이때 필드 값은 적당히 초기화(또는 지정)할 것
		peaple[0] = new Person("홍길동");
		peaple[1] = new Person("이현복");
		peaple[2] = new Dog(2);
		peaple[3] = new Dog(5);
		//모든 배열 원소 객체에 대해 speak()를 호출하고,
		//만일 배열 원소가 사람이면 추가로 이름을 조회(getName() 호출)하여 출력할 것
		for(int i=0; i<peaple.length;i++) {
			if(peaple[i] instanceof Person) {
				peaple[i].speak();
				System.out.println(((Person)peaple[i]).getName()+"입니다.");
			}
			else if(peaple[i] instanceof Dog) {
				peaple[i].speak();
			}
		}
	}

}
