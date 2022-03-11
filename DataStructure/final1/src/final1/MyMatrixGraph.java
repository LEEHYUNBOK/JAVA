package final1;

//인접행렬을 이용하여 방향 그래프를 구현한 클래스
public class MyMatrixGraph {
	private int[][] matrix;		// 인접 행렬
	private int n;			// 정점 수

	// 정점 0, 1, 2, ..., n-1 인 그래프를 생성
	public MyMatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
	}

	// (1) 정점 v의 진출 차수를 구하여 리턴 (정점 번호 v의 유효성 검사할 필요 없음)
	public int outDegree(int v) {
		int num = 0;
		for(int i =0; i < n; i++) {
			if(matrix[v][i]==1)
				num++;
		}
		return num;	// 메소드 완성 후 삭제할 것
	}

	// 간선 (v1, v2) 를 삽입
	public void addEdge(int v1, int v2) {
		matrix[v1][v2] = 1;
	}
}