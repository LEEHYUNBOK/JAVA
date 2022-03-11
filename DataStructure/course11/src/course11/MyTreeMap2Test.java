/*
 ���ϸ�: MyTreeMap2Test.java
 �ۼ���: 2018.11.27
 �ۼ���: ������
 ����: String-String ���� �����ϴ� ����Ž��Ʈ���� �����ϰ� ������ �����ϴ� ���α׷�
 */
package course11;

public class MyTreeMap2Test {
	public static void main(String[] args) {

		System.out.println("course11 : ������");

		// ���� ����Ž��Ʈ�� tree�� ����
		MyTreeMap2 tree = new MyTreeMap2();

		// ���� tree���� key ���� �ش��ϴ� value�� ��ȸ
		System.out.println("kim=" + tree.get("kim"));
		System.out.println();

		// tree�� key-value ���� ����  
		tree.put("kim", "Seoul");
		tree.put("park", "Pusan");
		tree.put("choi", "Incheon");
		tree.put("hong", "Seoul");
		tree.put("seo", "Pusan");
		tree.put("lee", "Suwon");
		tree.put("kim", "Jeju");

		// tree���� key ���� �ش��ϴ� value�� ��ȸ
		System.out.println("kim=" + tree.get("kim"));
		System.out.println("park=" + tree.get("park"));
		System.out.println("choi=" + tree.get("choi"));
		System.out.println("hong=" + tree.get("hong"));
		System.out.println("seo=" + tree.get("seo"));
		System.out.println("lee=" + tree.get("lee"));   
	}
}
