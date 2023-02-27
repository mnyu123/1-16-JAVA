package Pack6;

public class ThreadEx {

	public static void main(String[] args) {
		ThreadExtend t1 = new ThreadExtend();

		Runnable r = new RunnableImple();

		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
	}

}

class ThreadExtend extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("스레드 상속 받는 방법");
		for (int i = 0; i < 50; i++) {
			System.out.println("ThreadExtend: " + i);
		}
	}

}

class RunnableImple implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable 구현 방법");
		for (int i = 0; i < 50; i++) {
			System.out.println("RunnableImple: " + i);
		}
	}

}