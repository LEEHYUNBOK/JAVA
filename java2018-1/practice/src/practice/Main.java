package practice;

class Rectangle implements Comparable<Rectangle>{
	
	private int width =0;
	private int height=0;
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	public int getArea() {
		return width * height;
	}
	@Override
	public int compareTo(Rectangle arg0) {
		// TODO Auto-generated method stub
		return (getArea() - other.getArea());
	}
	
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
