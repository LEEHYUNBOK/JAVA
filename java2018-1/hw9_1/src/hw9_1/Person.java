/*
 * 파일명: Person.java
 * 작성일: 2018.05.24
 * 작성자: 이현복
 * 내용: Speakable 인터페이스를 정의하고, 이를 구현한 Person, Dog 클래스를 정의하고 이용하는 프로그램을 작성하시오.
 */
package hw9_1;

public class Person implements Speakable {
	private String name;
	//생성자 이름 받기
	public Person(String name) {
		this.name= name;
	}
	//이름 getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//사람의 speak()는 인사말을 출력한다.
	public void speak() {
		System.out.println("안녕하세요.");
	}
}
