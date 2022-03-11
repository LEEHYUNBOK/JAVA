/*
  ���ϸ�:MyArrayList.java
  �ۼ���:������
  �ۼ���:2018-09-11
  ����:���� ����Ʈ�� �����ϴ� MyArrayList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� ������ ���� �ۼ��Ͻÿ�.
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