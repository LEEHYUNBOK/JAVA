package hw5_2;

public class MyMatrixService {
	// (1) ���� �޼ҵ� multiply�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ΰ��� ����� �Ű������� �޾� ���� ���� ����� ������ ���� �迭�� ǥ���Ͽ� ����
	// �Ű������� ���� �� ����� ���� ���ϱ⿡ Ÿ���� ũ���� �����ص� ��
	public static int[][] multiply(int[][] x, int[][] y) {
		int[][] array2 = new int[x.length][y[0].length];
		for(int column=0;column<array2.length;column++) {
			for(int row=0;row<array2[0].length;row++) {
				for(int num=0;num<x[0].length;num++) {
					array2[column][row] += x[column][num] * y[num][row];
				}
			}
		}
		return array2;
	}
	// (2) ���� �޼ҵ� print�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ϳ��� ����� �Ű������� �޾� �� �ٿ� �� �྿ ���
	public static void print(int[][] array) {
		for(int column=0;column<array.length;column++) {
			for(int row=0;row<array[0].length;row++) {
				System.out.print(array[column][row]+" ");
			}
			System.out.println();
		}
	}
}
