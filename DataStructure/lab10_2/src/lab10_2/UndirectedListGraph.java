/*
 * 파일명: UndirectedListGraph.java
 * 작성일: 2018.11.22
 * 작성자: 이현복
 * 설명: 무방향 그래프를 생성하고 이용하는 프로그램
 */
package lab10_2;

public class UndirectedListGraph {
	private class Node {
		int vertex;
		Node link;
		Node(int vertex) {
			this.vertex = vertex;
		}
	}
	private Node[] list;
	private int n;
	
	public UndirectedListGraph(int n) {
		this.n = n;
		list = new Node[n];
	}
	
	public boolean hasEdge(int v1, int v2) {
		Node tm = list[v1];
		while(tm != null) {
			if(tm.vertex == v2) 
				return true;
			tm = tm.link;
		}
		return false;
	}
	
	public void addEdge(int v1, int v2) {
		if(!isValid(v1) || !isValid(v2))
			System.out.println("잘못된 정점 번호 입니다.");
		else if(hasEdge(v1,v2))
			System.out.println("이미 존재하는 간선입니다.");
		else {
			Node t1 = new Node(v2);
			t1.link = list[v1];
			list[v1] = t1;
			Node t2 = new Node(v1);
			t2.link = list[v2];
			list[v2] = t2;
		}
	}

	public boolean isValid(int v) {
		return (v >= 0) && (v<n);
	}
	
	public void printAdjacentVertices(int v) {
		Node t = list[v];
		while(t != null) {
			System.out.print(t.vertex + " ");
			t = t.link;
		}
	}
}
