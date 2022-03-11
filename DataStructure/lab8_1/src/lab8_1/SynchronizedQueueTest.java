/*
 * 파일명 : SynchronizedQueueTest.java
 * 작성일: 2018년 11월 1일
 * 작성자: 이현복
 * 내용: 하나의 원형 큐를 공유하는 생산자, 소비자 스레드를 실행하는 프로그램
 */
package lab8_1;

public class SynchronizedQueueTest {
	public static void main(String[] args) {
		System.out.println("lab8_1: 이현복");

		// 크기 5인 원형 큐를 생성
		SynchronizedQueue queue = new SynchronizedQueue(5);

		// 원형 큐를 공유하는 생산자 스레드, 소비자 스레드를 실행
		Thread producer1 = new ProducerThread(queue, 1);
		Thread producer2 = new ProducerThread(queue, 11);
		Thread consumer1 = new ConsumerThread(queue);
		Thread consumer2 = new ConsumerThread(queue);
		producer1.start();
		producer2.start();
		consumer1.start();
		consumer2.start();
	}
}


class ProducerThread extends Thread {
	private SynchronizedQueue queue;
	private int startNumber;

	public ProducerThread(SynchronizedQueue queue, int startNumber) {
		this.queue = queue;
		this.startNumber = startNumber;
	}

	@Override
	public void run() {
		for(int i = startNumber; i < startNumber + 10; i++) {
			try {
				queue.enQueue(i);
				sleep((int) (Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class ConsumerThread extends Thread {
	private SynchronizedQueue queue;

	public ConsumerThread(SynchronizedQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		int sum = 0;
		try {
			sleep(1000);
			for(int i = 0; i < 10; i++) {
				int value = queue.deQueue();  
				sum += value;
				sleep((int) (Math.random() * 500));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" " + currentThread().getName() + "가 소비한 정수 합 = " + sum);
	}
}
