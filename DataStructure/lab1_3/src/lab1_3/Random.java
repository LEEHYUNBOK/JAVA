/*
  ���ϸ�: lab1_3.java
  �ۼ���: ������
  �ۼ���: 2018-09-04
  ����: 1~4 ������ ���� �ѹ� 10���� �����Ͽ� �� �ѹ��� ��� �����Ǿ��°��� ���� ���α׷��� �ۼ��Ͻÿ�.
 */
package lab1_3;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_3: ȫ�浿");
		int count[] = new int[4];
		System.out.print("���� �ѹ� =");
		for(int i = 0; i<10;i++) {
			int rand = (int)(Math.random()*4)+1;
			System.out.print(rand + " ");
			count[rand-1]++;
		}
		System.out.println("\n"+"1�� ���� =" + count[0]);
		System.out.println("2�� ���� =" + count[1]);
		System.out.println("3�� ���� =" + count[2]);
		System.out.println("4�� ���� =" + count[3]);
	}

}
