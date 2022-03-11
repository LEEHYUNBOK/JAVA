/*
 * ���ϸ� : WordRunnableTest.java
 * �ۼ��� : ������
 * �ۼ��� 2018-06-14
 * ���� : Ư�� �ܾ Ư�� Ƚ����ŭ �ݺ��Ͽ� ����ϴ� �����带 2�� �����Ͽ� �����ϴ� ���α׷��̴�.
 */
package hw16_1;

//�ܾ�� �ݺ�Ƚ�� ������ ���� Ŭ���� WordClass
class WordClass {
	private String word; // �ܾ�
	private int number; // �ݺ�Ƚ��

	// �ܾ�� �ݺ�Ƚ���� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public WordClass(String word, int number) {
		this.word = word;
		this.number = number;
	}

	public String getWord() {
		return word;
	}

	public int getNumber() {
		return number;
	}

	// �ܾ �ݺ�Ƚ����ŭ �� �ٿ� ����ϴ� �޼ҵ�
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.print(word + " ");
		}
	}
}

//(1) Ŭ���� Runnable ���� - WordClass�� ��ӹް�, Runnable�� ������
class WordRunnable extends WordClass implements Runnable {
	// (2) �ܾ�� �ݺ�Ƚ���� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public WordRunnable(String word, int number) {
		super(word, number);
	}
	// (3) ��Ÿ �ݵ�� �ʿ��� �޼ҵ�
	@Override
	public void run() {
		print();
	}
}

public class WordRunnableTest {
	public static void main(String[] args) {
		System.out.println("hw16_1: ������");

		// (4) aaa�� 5�� ����ϴ� ������ t1�� BB�� 10�� ����ϴ� ������ t2 ����
		Thread t1 = new Thread(new WordRunnable("aaa", 5));
		Thread t2 = new Thread(new WordRunnable("BB", 10));


		// (5) ������ t1�� t2�� ���۽�Ŵ
		t1.start();
		t2.start();



	}
}