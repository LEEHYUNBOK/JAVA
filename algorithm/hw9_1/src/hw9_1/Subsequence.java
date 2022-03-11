package hw9_1;

import java.util.*;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw9_1 : ������");
		Scanner sc = new Scanner(System.in);
		String first, second; 					// ù��° ���ڿ��� �ι�° ���ڿ� �Է¹ޱ� ���� ����
		System.out.print("ù��° ���ڿ� �Է�:");
		first = sc.nextLine(); 					// ù��° ���ڿ� �ޱ�(���� enter)
		System.out.print("�ι�° ���ڿ� �Է�:");
		second = sc.nextLine(); 				// �ι�° ���ڿ� �ޱ�(���� enter)
		LCS(first, second); 					// LCS �޼ҵ忡 first�� second �Է�
	}

	public static void LCS(String first, String second) {
		int m = first.length(); 					// ù��° ���ڿ� ���̸� ���� m�� ����
		int n = second.length(); 					// �ι�° ���ڿ� ���̸� ���� n�� ����
		String[] firstString; 						// �迭 firstString ����
		String[] secondString; 						// �迭 secondString ����
		firstString = first.split(""); 				// ���ڿ� �ϳ��� ������ �迭 firstString�� ����
		secondString = second.split(""); 			// ���ڿ� �ϳ��� ������ �迭 secondString�� ����
		String[][] lcs = new String[m + 1][n + 1]; 	// �������κм��� ���ڿ��� ������ ���߹迭 lcs ����
		for (int i = 0; i <= m; i++)				// lcs[0]�� ���� ��� ��ĭ���� ����
			lcs[i][0] = "";

		for (int i = 0; i <= n; i++)				// lcs[0]�� ���� ��� ��ĭ���� ����
			lcs[0][i] = "";

		for (int i = 1; i <= m; i++) {				// i�� 1��°���� m��° ���� �ݺ�
			for (int j = 1; j <= n; j++) {			// j�� 1��°���� n��° ���� �ݺ�
				if (firstString[i - 1].compareTo(secondString[j - 1]) == 0)		// ù��° ���ڿ��� �ι�° ���ڿ��� ������
					lcs[i][j] = lcs[i - 1][j - 1].concat(firstString[i - 1]);	// lcs[i-1][j-1]��°�� ���� ������ ù��° ���ڿ� �߰�

				else {															// �ƴϸ�
					if (lcs[i - 1][j].length() > lcs[i][j - 1].length())		// lcs[i-1][j]�� ���̿� lcs[i][j-1]�� ���� ��
						lcs[i][j] = lcs[i - 1][j];								// �� ū���� lcs[i][j]�� ����

					else
						lcs[i][j] = lcs[i][j - 1];

				}
			}
		}
		System.out.println("LCS ���� = " + lcs[m][n].length());					// lcs�� ���� ���
		System.out.println("LCS = " + lcs[m][n]);								// lcs ���
	}

}
