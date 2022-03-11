/*
 * ���ϸ�: Person.java
 * �ۼ���: 2018.05.24
 * �ۼ���: ������
 * ����: Speakable �������̽��� �����ϰ�, �̸� ������ Person, Dog Ŭ������ �����ϰ� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw9_1;

public class Person implements Speakable {
	private String name;
	//������ �̸� �ޱ�
	public Person(String name) {
		this.name= name;
	}
	//�̸� getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//����� speak()�� �λ縻�� ����Ѵ�.
	public void speak() {
		System.out.println("�ȳ��ϼ���.");
	}
}
