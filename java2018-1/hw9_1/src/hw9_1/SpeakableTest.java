/*
 * ���ϸ�: SpeakableTest.java
 * �ۼ���: 2018.05.24
 * �ۼ���: ������
 * ����: Speakable �������̽��� �����ϰ�, �̸� ������ Person, Dog Ŭ������ �����ϰ� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw9_1;

public class SpeakableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw9_1: ������");
		//ũ�Ⱑ 4�� Speakble �迭�� ����
		Speakable[] peaple = new Speakable[4];
		//Person ��ü 2��, Dog ��ü 2���� �����Ͽ� �迭�� ����
		//�̶� �ʵ� ���� ������ �ʱ�ȭ(�Ǵ� ����)�� ��
		peaple[0] = new Person("ȫ�浿");
		peaple[1] = new Person("������");
		peaple[2] = new Dog(2);
		peaple[3] = new Dog(5);
		//��� �迭 ���� ��ü�� ���� speak()�� ȣ���ϰ�,
		//���� �迭 ���Ұ� ����̸� �߰��� �̸��� ��ȸ(getName() ȣ��)�Ͽ� ����� ��
		for(int i=0; i<peaple.length;i++) {
			if(peaple[i] instanceof Person) {
				peaple[i].speak();
				System.out.println(((Person)peaple[i]).getName()+"�Դϴ�.");
			}
			else if(peaple[i] instanceof Dog) {
				peaple[i].speak();
			}
		}
	}

}
