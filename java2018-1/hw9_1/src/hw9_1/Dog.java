/*
 * 파일명: Dog.java
 * 작성일: 2018.05.24
 * 작성자: 이현복
 * 내용: Speakable 인터페이스를 정의하고, 이를 구현한 Person, Dog 클래스를 정의하고 이용하는 프로그램을 작성하시오.
 */
package hw9_1;

public class Dog implements Speakable {
	private int age;
	//생성자 나이 받기
	public Dog(int age) {
		this.age = age;
	}
	//나이 getter/setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//개의 speak()는 자신의 나이만큼 "멍"을 출력한다. 예를 들어 3살이면 멍멍멍
	public void speak() {
		for(int i =0; i<age;i++) {
			System.out.print("멍");
		}
		System.out.println("");
	}
}
