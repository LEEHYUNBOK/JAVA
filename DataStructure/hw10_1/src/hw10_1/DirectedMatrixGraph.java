/*
 * ���ϸ�: DirectedMatrixGraph.java
 * �ۼ���: 2018.12.03
 * �ۼ���: ������
 * ����: directed graph�� ǥ���ϴ� �߻��ڷ����� DirectedMatrixGraph Ŭ������ �����ϰ� �̸� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package hw10_1;

public class DirectedMatrixGraph {
	private int n;
	private int[][] array;
	private boolean[] check;

	public DirectedMatrixGraph(int n) {
		this.n = n;
		array = new int[n][n];
	}

	public boolean hasEdge(int v1, int v2) {
		return array[v1][v2] == 1;
	}

	public void addEdge(int v1, int v2) {
		if(!isValid(v1) || !isValid(v2))
			System.out.println("�߸��� ���� ��ȣ �Դϴ�.");
		else if(hasEdge(v1,v2))
			System.out.println("�̹� �����ϴ� �����Դϴ�.");
		else {
			array[v1][v2] = 1;
		}
	}

	public boolean isValid(int v) {
		return (v >= 0) && (v < n);
	}
	public void printAdjacentVertices(int v) {
		for(int i = 0; i < n; i++) {
			if(array[v][i] == 1)
				System.out.print(i + " ");
		}
	}

	public void depthFirstSearch(int v) {
		if(!isValid(v)) {
			System.out.println("�߸��� ���� ��ȣ �Դϴ�.");
		}
		else {
			check = new boolean[n];
			dfs(v);
		}
	}
	private void dfs(int v) {
		System.out.print(v+" ");
		check[v]=true;
		for(int i = 0; i < n; i++) {
			if(check[i] == false && array[v][i] == 1) {
					dfs(i);
			}
		}		
	}
}