/*
  파일명:Circle.java
  작성자:이현복
  작성일:2018-09-10
  설명:반지름 속성을 갖는 Circle 클래스를 작성하고 사용하는 프로그램을 다음과 같이 작성하시오.
 */
package lab1_5;

public class Circle {
	private int radius = 0;
	public Circle() {
		radius = 1;
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		return (radius*radius*3.14);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}


}
