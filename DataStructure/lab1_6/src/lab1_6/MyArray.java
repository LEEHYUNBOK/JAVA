/*
  파일명:MyArray.java
  작성자:이현복
  작성일:2018-09-11
  설명:정수 리스트를 관리하는 MyArrayList 클래스를 작성하고 사용하는 프로그램을 다음과 같이 작성하시오.
 */
package lab1_6;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_6 : 이현복");
		MyArrayList list = new MyArrayList();
		System.out.println(list);
		list.add(2);
		list.add(-3);
		list.add(0);
		System.out.println(list);
	}

}
