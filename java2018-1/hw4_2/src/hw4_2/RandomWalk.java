/*
  * ���ϸ�: hw4_2
  * �ۼ���: 2018-04-02
  * �ۼ���: ������
  * ����: (������ũ)��������ּ� �������� ����Ͽ� ���� ������ �����ߴ����� ���� ��� 
  */
package hw4_2; // ��Ű�� �̸�

public class RandomWalk { // Ŭ���� RandomWalk

	public static void main(String[] args) { // ���� �Լ�
		// TODO Auto-generated method stub
	System.out.println("hw4_2: ������"); // ���
	int x = 0, y = 0; // ���� ��ǥ x,y ����
	boolean tile[][] = new boolean[5][5]; // ��ǥ�� ������ ���� ���� ������ ��Ÿ���� ���� �迭 tile ����
	int steps, count=0; // �����̴� Ƚ�� steps ���� , �� ������ Ƚ�� count ����
	int arrivex =(int) (Math.random()*5); // ��ǥ x ��ǥ �������� ����
	int arrivey =(int) (Math.random()*5); // ��ǥ y ��ǥ �������� ����
	System.out.println("��� = (0,0)"); // ��� ���� ���
	System.out.println("��ǥ = "+"("+arrivex+","+arrivey+")"); // ���� ���� ���
	System.out.print("�̵� ���:"); // �̵� ��� ���
	tile[0][0]=true; // ���� ��ǥ�� true
	for (steps = 0; steps < 20; steps++) { // �̵��ϱ� ���� �ݺ���
		int direction =(int) (Math.random()*4); // direction�� 0~3���� �ݺ�
		if (direction == 0 && x>=0) // ���� �������� 0�� ������ x�� 0 �̻��� ���
			if ((x-1) < 0) // ���� x-1�� 0���� ������
				x=0; // x = 0
			else // �ƴϸ�
				x--; // x�� 1 ����
		else if (direction == 1 && x<=4) // ���� �������� 1�� ������ x�� 4 ������ ���
			if ((x+1) >= 5) // x+1�� 5 �̻��̸�
				x=x; // x=x
			else // �ƴϸ� 
				x++; // x�� 1 ���ϱ�
		else if (direction == 2 && y>=0) // ���� �������� 2�� ������ y�� 0�̻��� ���
			if ((y+1) >= 5) // y+1�� 5 �̻��̸�
				y=y; // y=y
			else // �ƴϸ� 
				y++; // y�� 1 ���ϱ�
		else if (y < 4) { // ���� y�� 4 �̸��̸� 
			if ((y-1) < 0) // y-1�� 0���� ������
				y=0; // y=0
			else // �ƴϸ�
				y--; // y�� 1 ����
		}
		System.out.print("("+x+","+y+")"); // ��ǥ ���
		tile[x][y] = true; // ������ ���� �̵��� tile�� ��ǥ�� true ����
		count++; // �̵�Ƚ�� 1 ���ϱ�
		if(x == arrivex && y == arrivey) { // x�� y�� ��ǥ�� ���� ��ǥ�� ������ 
			break; // �ݺ��� Ż��
		}
	}
	System.out.println();
	System.out.println("------------------------");
	for (int j = 0; j < 5; j++) { // y��ǥ�� ���� �ݺ���
		for (int i =0;i <5; i++) { // x��ǥ�� ���� �ݺ���
			if (i == 0 && j == 0) { // ��� ������
				System.out.print("S"); // S ���
				continue; // �ݺ��� ����
			}
			else if (i==arrivex && j == arrivey) { // ���� ������
				System.out.print("G"); // G ���
				continue; // �ݺ��� ����
			}
			if (tile[i][j] == true) // ���� ��ǥ�� true �̸�
				System.out.print("#"); // # ���
			else // �ƴϸ�
				System.out.print("."); // . ���
		}
		System.out.println();
	}
	System.out.println("------------------------");
	if(x == arrivex && y == arrivey) { // ��ǥ�� ���� ������ ����
		System.out.println("����"); // ����
		System.out.println("�� Ƚ�� �õ� = "+count); // �� Ƚ�� �õ� ���
	}
	else { // �ƴϸ�
		System.out.println("����"); // ����
	}
	}
}
