/*
  * ���ϸ�: Member.java
  * �ۼ���: 2018.05.24
  * �ۼ���: ������
  * ����:  ȸ��� ȸ�� ������ ���� �޸� å���Ѵ�. (�ð���ȸ���� ���ð��� 100 �̰�, ��ȸ���� 1000)
*/
package hw7_2;

public abstract class Member {
	private int age;
	//���̸� �Ű������� �޾� �ʱ�ȭ �ϴ� ������
	public Member(int age) {
		this.age = age;
	}
	//���� getter
	public int getAge() {
		return age;
	}
	//  getPayment() - ȸ�� ��ȸ�ϴ� �޼ҵ�(�Ű������� ����, int���� �����ϴ� abstract method)
	public abstract int getPayment();
}
