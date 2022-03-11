/*
 파일명: MyTreeMap2.java
 작성일: 2018.11.27
 작성자: 이현복
 설명: String-String 쌍을 저장하는 이진탐색트리를 생성하고 연산을 수행하는 프로그램
 */
package course11;


class MyTreeMap2 {
	// 트리의 노드를 표현하는 private 클래스 Node
	private class Node {
		String key;
		String value;
		Node leftChild = null;
		Node rightChild = null;
		Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	// private 인스턴스 변수 트리의 루트 노드를 가킬 변수(root)를 선언하고 null로 초기화
	private Node root = null;


	public String get(String key) {
		return getKey(root,key);
	}

	// 키값 key에 해당하는 value를 리턴하고, key 값을 찾지 못하면 null을 리턴하는 메소드(반복 알고리즘)
	public String getKey(Node t, String key) {
		Node p = t;
		if(p == null)
			return null;
		else if(key.compareTo(p.key) < 0)
			return getKey(p.leftChild,key);
		else if(key.compareTo(p.key) > 0)
			return getKey(p.rightChild,key);
		else
			return p.value;
	}

	// (1) 위의 get 메소드 대신, 재귀 알고리즘을 이용한 get 메소드를 작성하시오.(위의 get 메소드는 삭제할 것)



	// 트리에  key-value 쌍을 삽입하는 메소드
	// (2) (옵션) 위의 두 메소드 put, insertKey 대신, 반복 알고리즘을 이용한 put 메소드를 작성하시오.(위의 put, insertKey 메소드는 삭제할 것)
	public void put(String key, String value) {
		Node temp = new Node(key,value);
		Node r = null;
		Node p = root;
		while(p != null) {
			r=p;
			if(key.compareTo(p.key) < 0)
				p = p.leftChild;
			else if(key.compareTo(p.key) > 0)
				p = p.rightChild;
			else if(key.compareTo(p.key) == 0) {
				p.value = value;
				break;
			}
		}
		if(root == null)
			root = temp;
		else if(p == null) {
			if(key.compareTo(r.key) < 0)
				r.leftChild = temp;
			else if(key.compareTo(r.key) > 0)
				r.rightChild = temp;
		}
	}
}
