/*
 * 파일명: DirectedMatrixGraph.java
 * 작성일: 2018.12.03
 * 작성자: 이현복
 * 설명: directed graph를 표현하는 추상자료형인 DirectedMatrixGraph 클래스를 정의하고 이를 이용하는 프로그램을 작성하시오.
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
			System.out.println("잘못된 정점 번호 입니다.");
		else if(hasEdge(v1,v2))
			System.out.println("이미 존재하는 간선입니다.");
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
			System.out.println("잘못된 정점 번호 입니다.");
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