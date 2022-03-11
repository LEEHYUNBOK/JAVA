/*
  파일명:CircleTest.java
  작성자:이현복
  작성일:2018-09-10
  설명:반지름 속성을 갖는 Circle 클래스를 작성하고 사용하는 프로그램을 다음과 같이 작성하시오.
 */
package lab1_5;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_5 : 이현복");
		Circle circle1 = new Circle(2);
		Circle circle2 = new Circle((int)(Math.random()*4)+1);
		System.out.println(circle1);
		System.out.println(circle2);
		System.out.println(circle1.equals(circle2));
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());
		System.out.println(circle1.area());
		System.out.println(circle2.area());
	}

}
