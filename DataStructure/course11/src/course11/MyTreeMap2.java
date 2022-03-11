/*
 ���ϸ�: MyTreeMap2.java
 �ۼ���: 2018.11.27
 �ۼ���: ������
 ����: String-String ���� �����ϴ� ����Ž��Ʈ���� �����ϰ� ������ �����ϴ� ���α׷�
 */
package course11;


class MyTreeMap2 {
	// Ʈ���� ��带 ǥ���ϴ� private Ŭ���� Node
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

	// private �ν��Ͻ� ���� Ʈ���� ��Ʈ ��带 ��ų ����(root)�� �����ϰ� null�� �ʱ�ȭ
	private Node root = null;


	public String get(String key) {
		return getKey(root,key);
	}

	// Ű�� key�� �ش��ϴ� value�� �����ϰ�, key ���� ã�� ���ϸ� null�� �����ϴ� �޼ҵ�(�ݺ� �˰���)
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

	// (1) ���� get �޼ҵ� ���, ��� �˰����� �̿��� get �޼ҵ带 �ۼ��Ͻÿ�.(���� get �޼ҵ�� ������ ��)



	// Ʈ����  key-value ���� �����ϴ� �޼ҵ�
	// (2) (�ɼ�) ���� �� �޼ҵ� put, insertKey ���, �ݺ� �˰����� �̿��� put �޼ҵ带 �ۼ��Ͻÿ�.(���� put, insertKey �޼ҵ�� ������ ��)
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
