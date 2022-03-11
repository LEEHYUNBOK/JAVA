/*
  파일명: lab1_3.java
  작성자: 이현복
  작성일: 2018-09-04
  설명: 1~4 범위의 랜덤 넘버 10개를 생성하여 각 넘버가 몇개씩 생성되었는가를 세는 프로그램을 작성하시오.
 */
package lab1_3;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_3: 홍길동");
		int count[] = new int[4];
		System.out.print("랜덤 넘버 =");
		for(int i = 0; i<10;i++) {
			int rand = (int)(Math.random()*4)+1;
			System.out.print(rand + " ");
			count[rand-1]++;
		}
		System.out.println("\n"+"1의 갯수 =" + count[0]);
		System.out.println("2의 갯수 =" + count[1]);
		System.out.println("3의 갯수 =" + count[2]);
		System.out.println("4의 갯수 =" + count[3]);
	}

}
