package hw6_1;

import java.util.*;

public class MyBinarySearchTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_1 : ������");
		// ���� ����Ž��Ʈ�� tree�� ����
		MyBinarySearchTree tree = new MyBinarySearchTree();
		// tree�� �߼��� ��ȸ�Ͽ� ���
		System.out.print("\n�������� ��� = ");
		tree.printTree(); // �Ǵ� System.out.println(tree.toString());

		// tree�� ������ ���� 1���� �ܾ ������ �� tree�� �߼��� ��ȸ�Ͽ� ���
		tree.add("cat");
		System.out.print("\n�������� ��� = ");
		tree.printTree(); // �Ǵ� System.out.println(tree.toString());

		// tree�� ������ ���� 13���� �ܾ �߰��� ������ �� tree�� �߼��� ��ȸ�Ͽ� ���
		tree.add("HAT");
		tree.add("ant");
		tree.add("BEE");
		tree.add("dog");
		tree.add("Last");
		tree.add("KEY");
		tree.add("Korea");
		tree.add("egg");
		tree.add("ink");
		tree.add("juice");
		tree.add("free");
		tree.add("go");
		tree.add("CAT"); // �̹� �����ϴ� �ܾ��̹Ƿ� ���Ե��� ���� ����
		System.out.print("\n�������� ��� = ");
		tree.printTree(); // �Ǵ� System.out.println(tree.toString());
	}
}
