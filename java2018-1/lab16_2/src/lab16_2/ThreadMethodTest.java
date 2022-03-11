package lab16_2;

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run(){
		for(int i = 0; i < 5; i++) {
			// (1) 500 밀리초 동안 쉬었다가 출력하도록 이곳에 코드를 추가하세요.   
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(getName() + i + " ");
		}
	}
}
public class ThreadMethodTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("lab16_2: 이현복");
		System.out.print("\n어서오세요.");

		// 두 개의 스레드 t1, t2를 생성하여 시작
		Thread t1 = new MyThread("A");    // 스레드 이름을 "A"로 지정
		Thread t2 = new MyThread("b");    // 스레드 이름을 "b"로 지정
		t1.start();
		t2.start();

		// (2) 활동 중인 스레드 수를 출력하도록 아래 문장을 수정하세요.
		System.out.println("\n활동중인 스레드 수 = " + t1.activeCount());

		for(int i = 0; i < 5; i++) {
			Thread.sleep((long) (Math.random()*1000));
			// (3) 0~999 밀리초 동안 쉬었다가 출력하도록 이곳에 코드를 추가하세요.
			System.out.print(Thread.currentThread().getName() + i + " ");
		}

		// (4) t1, t2가 모두 종료한 후에 안녕히가세요 를 출력하도록 이곳에 코드를 추가하세요.
		t1.join();
		t2.join();
		System.out.println("\n안녕히가세요.");
	}
}
