package lab6_2;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("lab6_2 :이현복");
	Circle c1 = new Circle();
	Circle c2 = new Circle(2.5);
	System.out.println("c1의 반지름 : "+c1.getRadius());
	System.out.println("c2의 반지름 : "+c2.getRadius());
	System.out.println("c1의 면적 : "+c1.area());
	System.out.println("c2의 면적 : "+c2.area());
	c1.setRadius(c2.getRadius());
	System.out.println("c1의 반지름 : "+c1.getRadius());
	System.out.println("c2의 반지름 : "+c2.getRadius());
	System.out.println("c1의 면적 : "+c1.area());
	System.out.println("c2의 면적 : "+c2.area());
	c2.setRadius(1.5);
	System.out.println("c1의 면적 : "+c1.area());
	System.out.println("c2의 면적 : "+c2.area());
	}

}
