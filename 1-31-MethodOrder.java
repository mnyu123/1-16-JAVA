package Practice2;

public class MethodOrder {

	void one(int x) {
		System.out.println("첫번째 메소드 실행");
		System.out.println("첫번째 메소드에서 x의 값: " + x);
		two(x + 10);
		System.out.println("첫번째 메소드 종료");
	}

	void two(int x) {
		System.out.println("두번째 메소드 실행");
		System.out.println("두번째 메소드에서 x의 값: " + x);
		three(x + 20);
		System.out.println("두번째 메소드 종료");
	}

	void three(int x) {
		System.out.println("세번째 메소드 실행");
		System.out.println("세번째 메소드에서 x의 값: " + x);
		System.out.println("-------------------------------");
		System.out.println("세번째 메소드 종료");

	}

	public static void main(String[] args) { // 객체를 만들적에 'static'이 붙어있는 객체는 무시가능.
		// TODO Auto-generated method stub

		// 메소드의 실행 순서 - stack(후입선출)

		System.out.println("메인 메소드 실행");

		MethodOrder m = new MethodOrder();
		m.one(10);

	}

}
