/*
 * ���ϸ�: MemberTest.java
 * �ۼ���: 2018.05.24
 * �ۼ���: ������
 * ����:  ȸ��� ȸ�� ������ ���� �޸� å���Ѵ�. (�ð���ȸ���� ���ð��� 100 �̰�, ��ȸ���� 1000)
 */
package hw7_2;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_2: ������");
		double age=0;
		int sum=0;
		//ũ�Ⱑ 4�� Member �迭�� ����
		Member[] peaple = new Member[4];
		//���� 4�� �����Ͽ� ���� ȸ�� �迭�� ����
		peaple[0] = new HourlyMember(22,2);
		peaple[1] = new HourlyMember(33,3);
		peaple[2] = new RegularMember(44);
		peaple[3] = new RegularMember(55);
		//ȸ���� ���� ����� ���� ��� <--- �ݺ��� �̿��� ��, ���� ���ͷ� �̿� ����
		//ȸ���� ȸ�� ���� ���� ��� <--- �ݺ��� �̿��� ��, ȸ�� ���ͷ� �̿� ����
		for(int i=0; i<peaple.length; i++) {
			age+=peaple[i].getAge();
			sum+=(peaple[i].getPayment());
		}
		System.out.println("���� ��� : "+(age/peaple.length));
		System.out.println("ȸ�� �� : " + (sum));
	}

}
