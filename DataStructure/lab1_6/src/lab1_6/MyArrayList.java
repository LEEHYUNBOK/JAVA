/*
  파일명:MyArrayList.java
  작성자:이현복
  작성일:2018-09-11
  설명:정수 리스트를 관리하는 MyArrayList 클래스를 작성하고 사용하는 프로그램을 다음과 같이 작성하시오.
 */
package lab1_6;

import java.util.Arrays;

public class MyArrayList {
	private int[] array;
	private int num;
	public MyArrayList() {
		array = new int[10];
		num = 0;
	}
	public boolean add(int n) {
		if(num == array.length-1) {
			return false;
		}
		else {
			array[num] = n;
			num++;
			return true;
		}

	}
	@Override
	public String toString() {
		String munza="";
		for(int i = 0; i < num;i++) {
			munza+=array[i]+" ";
		}
		return "list = " + munza;
	}
}