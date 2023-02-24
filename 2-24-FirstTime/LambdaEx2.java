package Pack5;

public class LambdaEx2 {

	public static void main(String[] args) {

		System.out.println("시작");
		Runnable run = () -> { // 람다식
			for (int i = 1; i <= 10; i++) {
				System.out.println("첫번째: " + i);
			}
		};

		Runnable run2 = () -> { // 함수화 되었다.
			for (int i = 1; i <= 10; i++) {
				System.out.println("두번째: " + i);
			}
		};

		Thread t = new Thread(run);
		Thread t2 = new Thread(run2); // 순서가 다른 이유는
		// 스레드(일명 일꾼)이 두개여서 실행 순서가 섞이기 때문에
		// 멀티 스레드
		t.start();
		t2.start();
		System.out.println("종료"); // 메인 스레드는 시작하자마자 종료 되었음
	}

}

