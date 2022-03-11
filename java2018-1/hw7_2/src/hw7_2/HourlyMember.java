/*
  * ���ϸ�: HourlyMember.java
  * �ۼ���: 2018.05.24
  * �ۼ���: ������
  * ����:  ȸ��� ȸ�� ������ ���� �޸� å���Ѵ�. (�ð���ȸ���� ���ð��� 100 �̰�, ��ȸ���� 1000)
*/
package hw7_2;

public class HourlyMember extends Member {
	private int hour;
	//����, ���ð��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public HourlyMember(int age,int hour) {
		super(age);
		this.hour = hour;
	}
	//�ð� getter
	public int getHour() {
		return hour;
	}
	//getPayment() - ȸ�� ��ȸ�ϴ� �޼ҵ�
	@Override
	public int getPayment() {
		// TODO Auto-generated method stub
		return 100*hour;
	}
}