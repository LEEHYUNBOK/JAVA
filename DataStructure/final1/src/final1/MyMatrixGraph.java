package final1;

//��������� �̿��Ͽ� ���� �׷����� ������ Ŭ����
public class MyMatrixGraph {
	private int[][] matrix;		// ���� ���
	private int n;			// ���� ��

	// ���� 0, 1, 2, ..., n-1 �� �׷����� ����
	public MyMatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
	}

	// (1) ���� v�� ���� ������ ���Ͽ� ���� (���� ��ȣ v�� ��ȿ�� �˻��� �ʿ� ����)
	public int outDegree(int v) {
		int num = 0;
		for(int i =0; i < n; i++) {
			if(matrix[v][i]==1)
				num++;
		}
		return num;	// �޼ҵ� �ϼ� �� ������ ��
	}

	// ���� (v1, v2) �� ����
	public void addEdge(int v1, int v2) {
		matrix[v1][v2] = 1;
	}
}