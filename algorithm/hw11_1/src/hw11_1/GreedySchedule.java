package hw11_1;

import java.util.*;

public class GreedySchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw11_1 : ������");
		Scanner sc = new Scanner(System.in);
		int start; // ���۽ð� �Է¹ޱ� ���� ����
		int end; // ������ �ð� �Է¹ޱ� ���� ����
		String name; // ȸ�Ǹ� �Է� �ޱ� ���� ����
		int meeting; // ��û ȸ�� �� �Է� ����
		System.out.print("��û ȸ�� �� �Է�:");
		meeting = sc.nextInt(); // ��û ȸ�� �� �Է� ����
		System.out.println(meeting + "���� ȸ�Ǹ�� ȸ�ǽ� ��� �ð�(���۽ÿ� �����)�� whitespace�� �����Ͽ� �Է�:");
		Greedy[] array = new Greedy[meeting]; // ȸ������ ��ü �迭 ���� array ����
		for (int i = 0; i < meeting; i++) { // meeting����ŭ �ݺ�
			name = sc.next();
			start = sc.nextInt();
			end = sc.nextInt();
			array[i] = new Greedy(name, start, end);
		}
		countingSort(array); // array�迭�� end �� �������� ��������

		int greedyNum = 0; // �׸���� ���� �����ϱ� ���� ����
		int last = 0; // �׸���� ���� �� ���� ������ ����
		Greedy[] greedy = new Greedy[array.length]; // �׸���� ���� �����ϱ� ���� ��ü �迭 ����
		if (array[0].start >= 6 && array[0].start <= 23 && array[0].end >= 6 && array[0].end <= 23 // 0��°�迭�� start�� 6�̻�
																									// 23�����̰� end�� 6�̻�
																									// 23�����̰� end��
																									// start���� ũ��
				&& array[0].end > array[0].start) {
			greedy[greedyNum] = array[0]; // greedy�� 0��° ����
			greedyNum++; // greedyNum 1����
		}
		for (int i = 1; i < array.length; i++) { // �Է� ���� ����ŭ �ݺ�
			if (array[i].start >= 6 && array[i].start <= 23 && array[i].end >= 6 && array[i].end <= 23
					&& array[i].end > array[i].start) { // i��°�迭�� start�� 6�̻� 23�����̰� end�� 6�̻� 23�����̰� end�� start���� ũ��
				if (array[last].end <= array[i].start) { // ���� last��°�� end���� i��°�� start������ �۰ų� ������
					greedy[greedyNum] = array[i]; // greedyNum��° �׸��忡 i��° array�߰�
					last = i; // last�� i�� ����
					greedyNum++; // greedyNum 1����
				}
			}
		}
		Greedy[] copy = new Greedy[greedyNum]; // ȸ������ ��ü ������ copy�迭 ����
		for (int i = 0; i < copy.length; i++) { // greedy�迭 copy�� ����
			copy[i] = greedy[i];
		}

		System.out.println("������ ȸ�� �� = " + copy.length);
		for (int i = 0; i < copy.length; i++) { // copy�迭 ���̸�ŭ ���
			copy[i].print();
		}
	}

	public static void countingSort(Greedy[] array) { // ��� ����
		int k = 0;
		Greedy[] sort = new Greedy[array.length]; // ���İ� �����ϴ� �迭
		for (int i = 0; i < array.length - 1; i++) { // array�迭�� end���� ���� ū��
			if (array[i].end < array[i + 1].end)
				k = array[i + 1].end;
		}
		int[] c = new int[k + 1]; // kũ�⸸ŭ c�迭 ����
		for (int i = 1; i < c.length; i++) { // c�迭 ��� ��°�� 0 ����
			c[i] = 0;
		}
		for (int i = 0; i < array.length; i++) { // i��° array�� end���� �ش��ϴ� �ּҿ� c�� 1 ����
			c[array[i].end]++;
		}
		for (int i = 2; i < c.length; i++) { // 0��°���� ���ʴ�� ���ϱ�
			c[i] = c[i] + c[i - 1];
		}
		for (int i = array.length - 1; i >= 0; i--) { // array�迭 ũ�⸸ŭ 1�� �����ϸ鼭 �ݺ�
			sort[c[array[i].end] - 1] = array[i]; // array�� end���� �ش��ϴ� ��°�� ���� �ش��ϴ� ��°�� i��° array����
			c[array[i].end]--; // c��° �ϳ� ����
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = sort[i]; // array�迭�� �ٽ� �ű��
		}
	}
}
