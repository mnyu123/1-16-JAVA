package Test7;

public class Outer2 {
	interface exam { // 내부 인터페이스 , 관리적 차원으로 연관성이 높고 종속적이다.
		// 내부 인터페이스 - 활용?
		void method(); // 추상 메소드
	}

	exam ie;

	void setexam(exam ie) {
		this.ie = ie;
	}

	void outerMethod() {
		ie.method();
	}
}
