/*
 * 파일 이름 : Main.java
 * 작성자 : 이현복
 * 작성일 : 2018-06-11
 * 내용 : 아래 프로그램은 가속량을 입력받아 자동차를 가속하는 프로그램이다.
 *       이 프로그램을 다음과 같이 예외를 발생시키고 처리하도록 수정하시오.
 */
package hw14_1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		System.out.println("hw14_1: 이현복");

		// 속도가 50인 자동차 생성하여 자동차 정보 출력
		Car myCar = new Car(50);
		System.out.println(myCar);

		// 가속량을 입력받아 자동차 가속
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("가속량 입력: ");
			int value = scan.nextInt();
			myCar.speedUp(value);
		} 
		catch (SpeedUpException e) {
			System.out.println("최대 속도 초과로 가속 불가능하여 자동차를 멈춥니다.");
			myCar.stop();
		}
		catch (TooSmallException e) {
		}
		catch (InputMismatchException e) {
			System.out.println("잘못 입력하였습니다.");
		}
		// 자동차 정보 출력
		System.out.println(myCar);   // 어떤 예외가 발생하든 반드시 출력해야 함
	}
}

class Car {
	private int speed; // 속도
	public final int MAX_SPEED = 100;   // 최대 속도

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException, TooSmallException {  // 가속
		if(value+speed> MAX_SPEED) {
			throw new SpeedUpException();
		}
		if(value <= 0 ) {
			throw new TooSmallException(value);
		}
		speed += value;
	}

	public void speedDown(int value) {  // 감속
		speed -= value;
	}

	public void stop() { // 멈춤
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