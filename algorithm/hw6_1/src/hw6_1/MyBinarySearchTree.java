package hw6_1;

public class MyBinarySearchTree {
	private class Node { 			// 노드 구조
		String key;					//노드 값 저장
		Node leftChild;				// 왼쪽 자식 노드 주소 선언
		Node rightChild;			// 오른쪽 자식 노드 주소 선언

		Node(String key) {			// 노드에 저장
			this.key = key;			// key 값 저장
			leftChild = null;		// 왼쪽 자식 노드 null로 저장
			rightChild = null;		// 오른쪽 자식 노드 null로 저장
		}
	}
	// 루트 노드를 가리키는 인스턴스 변수
	private Node root = null;

	// 트리에 키값 key를 삽입하는 메소드
	public void add(String key) {
		root = treeInsert(root, key);
	}

	// t를 루트로 하는 트리에 키값 key를 삽입하고, 삽입 후 루트를 리턴하는 메소드(재귀 알고리즘)
	private Node treeInsert(Node t, String key) {
		if(t == null) {
			Node newNode = new Node(key);
			return newNode;
		}
		else if(t.key.compareToIgnoreCase(key) > 0)
			t.leftChild = treeInsert(t.leftChild,key);
		else if(t.key.compareToIgnoreCase(key) < 0)
			t.rightChild = treeInsert(t.rightChild,key);
		else 
			return t;
		
		return t;
	}

	// 모든 key들을 키값 오름차순으로 출력
	public void printTree() {
		inorder(root);
	}

	// t를 루트로 하는 서브트리를 중순위 순회하며 key값을 출력하는 메소드(재귀 알고리즘)
	private void inorder(Node t) {
		if (t != null) {
			inorder(t.leftChild);
			System.out.print(t.key + " ");
			inorder(t.rightChild);
		}
	}


}