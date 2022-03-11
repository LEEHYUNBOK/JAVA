/*
 * ���ϸ�: Dog.java
 * �ۼ���: 2018.05.24
 * �ۼ���: ������
 * ����: Speakable �������̽��� �����ϰ�, �̸� ������ Person, Dog Ŭ������ �����ϰ� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw9_1;

public class Dog implements Speakable {
	private int age;
	//������ ���� �ޱ�
	public Dog(int age) {
		this.age = age;
	}
	//���� getter/setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//���� speak()�� �ڽ��� ���̸�ŭ "��"�� ����Ѵ�. ���� ��� 3���̸� �۸۸�
	public void speak() {
		for(int i =0; i<age;i++) {
			System.out.print("��");
		}
		System.out.println("");
	}
}
