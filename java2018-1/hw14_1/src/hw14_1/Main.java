/*
 * ���� �̸� : Main.java
 * �ۼ��� : ������
 * �ۼ��� : 2018-06-11
 * ���� : �Ʒ� ���α׷��� ���ӷ��� �Է¹޾� �ڵ����� �����ϴ� ���α׷��̴�.
 *       �� ���α׷��� ������ ���� ���ܸ� �߻���Ű�� ó���ϵ��� �����Ͻÿ�.
 */
package hw14_1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		System.out.println("hw14_1: ������");

		// �ӵ��� 50�� �ڵ��� �����Ͽ� �ڵ��� ���� ���
		Car myCar = new Car(50);
		System.out.println(myCar);

		// ���ӷ��� �Է¹޾� �ڵ��� ����
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("���ӷ� �Է�: ");
			int value = scan.nextInt();
			myCar.speedUp(value);
		} 
		catch (SpeedUpException e) {
			System.out.println("�ִ� �ӵ� �ʰ��� ���� �Ұ����Ͽ� �ڵ����� ����ϴ�.");
			myCar.stop();
		}
		catch (TooSmallException e) {
		}
		catch (InputMismatchException e) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
		// �ڵ��� ���� ���
		System.out.println(myCar);   // � ���ܰ� �߻��ϵ� �ݵ�� ����ؾ� ��
	}
}

class Car {
	private int speed; // �ӵ�
	public final int MAX_SPEED = 100;   // �ִ� �ӵ�

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException, TooSmallException {  // ����
		if(value+speed> MAX_SPEED) {
			throw new SpeedUpException();
		}
		if(value <= 0 ) {
			throw new TooSmallException(value);
		}
		speed += value;
	}

	public void speedDown(int value) {  // ����
		speed -= value;
	}

	public void stop() { // ����
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", MAX_SPEED=" + MAX_SPEED + "]";
	}
}
class SpeedUpException extends Exception {
}
class TooSmallException extends Exception {
	int speed;
	public TooSmallException(int speed){
		this.speed = speed;
	}
}