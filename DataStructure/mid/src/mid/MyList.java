package mid;

//�ܼ� ���Ḯ��Ʈ�� ���� ����Ʈ�� ������ Ŭ����
public class MyList {

	// ����Ʈ ��� ������ ǥ���ϴ� Ŭ����
	private class Node {
		int data;
		Node link;
		Node(int data) {
			this.data = data;
		}
	}
	// ����Ʈ�� �� �� ���Ҹ� ����Ű�� �ν��Ͻ� ����
	private Node head = null;

	// (4) item�� ����Ʈ�� �� �տ� �����ϴ� �޼ҵ�
	public void addFirst(int item) {
		Node temp = new Node(item);
		temp.link = head;
		head = temp;
	}

	// (5) ����Ʈ�� ���� ���� �����ϴ� �޼ҵ�(�� �޼ҵ� ���� ��¹� ����)
	public int getSum() {
		Node num = head;
		int sum = 0;
		while(num != null) {
			sum+= num.data;
			num = num.link;
		}
		return sum;
	}
}
