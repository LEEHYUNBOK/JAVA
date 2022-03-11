package final1;

//��������Ʈ�� �̿��Ͽ� ���� �׷����� ������ Ŭ����
public class MyListGraph {
	private class Node {
		int vertex;
		Node link;
		Node(int vertex) {
			this.vertex = vertex;
		}
	}
	private Node[] list;	// ���� ����Ʈ
	private int n;		// ���� ��

	// ���� 0, 1, 2, ..., n-1 �� �׷����� ����
	public MyListGraph(int n) {
		list = new Node[n];
		this.n = n;
	}

	// (1) ���� v�� ���� ������ ���Ͽ� ���� (���� ��ȣ v�� ��ȿ�� �˻��� �ʿ� ����)
	public int outDegree(int v) {
		Node t = list[v];
		int num=0;
		while(t != null) {
			num++;
			t=t.link;
		}
		return num;   // �޼ҵ� �ϼ� �� ������ ��
	}

	// ���� (v1, v2)�� ����
	public void addEdge(int v1, int v2) {
		Node newNode = new Node(v2);
		newNode.link = list[v1];
		list[v1] = newNode;
	}
}
