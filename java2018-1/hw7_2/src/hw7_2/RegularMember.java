/*
  * ���ϸ�: RegularMember.java
  * �ۼ���: 2018.05.24
  * �ۼ���: ������
  * ����:  ȸ��� ȸ�� ������ ���� �޸� å���Ѵ�. (�ð���ȸ���� ���ð��� 100 �̰�, ��ȸ���� 1000)
*/
package hw7_2;

public class RegularMember extends Member {
	//���̸� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public RegularMember(int age) {
		super(age);
	}
	//getPayment() - ȸ�� ��ȸ�ϴ� �޼ҵ�
	@Override
	public int getPayment() {
		// TODO Auto-generated method stub
		return 1000;
	}
}
