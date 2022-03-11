package hw6_1;

public class MyBinarySearchTree {
	private class Node { 			// ��� ����
		String key;					//��� �� ����
		Node leftChild;				// ���� �ڽ� ��� �ּ� ����
		Node rightChild;			// ������ �ڽ� ��� �ּ� ����

		Node(String key) {			// ��忡 ����
			this.key = key;			// key �� ����
			leftChild = null;		// ���� �ڽ� ��� null�� ����
			rightChild = null;		// ������ �ڽ� ��� null�� ����
		}
	}
	// ��Ʈ ��带 ����Ű�� �ν��Ͻ� ����
	private Node root = null;

	// Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�
	public void add(String key) {
		root = treeInsert(root, key);
	}

	// t�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϰ�, ���� �� ��Ʈ�� �����ϴ� �޼ҵ�(��� �˰���)
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

	// ��� key���� Ű�� ������������ ���
	public void printTree() {
		inorder(root);
	}

	// t�� ��Ʈ�� �ϴ� ����Ʈ���� �߼��� ��ȸ�ϸ� key���� ����ϴ� �޼ҵ�(��� �˰���)
	private void inorder(Node t) {
		if (t != null) {
			inorder(t.leftChild);
			System.out.print(t.key + " ");
			inorder(t.rightChild);
		}
	}


}