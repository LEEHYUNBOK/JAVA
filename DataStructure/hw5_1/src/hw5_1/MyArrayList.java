/*
  ���ϸ�: MyArrayList.java
  �ۼ���: ������
  �ۼ���: 2018-09-13
  ����:������ ���� ���� ����Ʈ�� �����ϴ� MyArrayList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 */
package hw5_1;

public class MyArrayList<T> {
	private int[] array;
	private int num;
	private int[] array1;
	public MyArrayList() {
		array = new int[10];
		num = 0;
	}
	public boolean add(int n) {
		if(num == array.length) {
			array1 = new int[num*2];
			for(int i = 0; i<array.length;i++) {
				array1[i]=array[i];
			}
			array = new int[num*2];
			for(int i = 0; i<array.length;i++) {
				array[i]=array1[i];
			}
			array[num] = n;
			num++;
			return true;
		}
		else {
			array[num] = n;
			num++;
			return true;
		}
	}
	public int get(int index) {
		return array[index];
	}
	public int size() {
		return num;
	}
	public void add(int index,int element) {
		if(num == array.length) {
			array1 = new int[num*2];
			for(int i = 0; i<array.length;i++) {
				array1[i]=array[i];
			}
			array = new int[num*2];
			for(int i = 0; i<array.length;i++) {
				array[i]=array1[i];
			}
			int change1 = array[index];
			int change2 = 0;
			array[index] = element;
			for(int i =index; i<num;i++) {
				change2 = array[i+1];
				array[i+1]=change1;
				change1 = change2;
			}
			num+=1;
		}
		else {
			int change1 = array[index];
			int change2 = 0;
			array[index] = element;
			for(int i =index; i<num;i++) {
				change2 = array[i+1];
				array[i+1]=change1;
				change1 = change2;
			}
			num+=1;
		}
	}
	public int remove(int index) {
		int a=array[index];
		array[index] = 0;
		for(int i = index; i < num; i++) {
			array[i] = array[i+1];
		}
		num-=1;
		return a;
	}
	@Override
	public String toString() {
		StringBuffer munza=new StringBuffer();
		for(int i = 0; i < num;i++) {
			munza.append(array[i]+" ");
		}
		return "list = " + munza;
	}
}