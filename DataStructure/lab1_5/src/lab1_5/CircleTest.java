/*
  ���ϸ�:CircleTest.java
  �ۼ���:������
  �ۼ���:2018-09-10
  ����:������ �Ӽ��� ���� Circle Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� ������ ���� �ۼ��Ͻÿ�.
 */
package lab1_5;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_5 : ������");
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
