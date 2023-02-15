package Test7;

public class Outer { // 바깥 클래스
	int i = 10;

	void outerMethod() {
		class inner { // 로컬 클래스
			int x = 20;
			int i = 30;

			void inner() {
				System.out.println("안쪽 클래스의 x변수의 값: " + x); // inner클래스 지역변수 값
				System.out.println("안쪽 클래스의 i변수의 값: " + i); // inner클래스 지역변수 값
				System.out.println("안쪽 클래스의 i변수의 값: " + this.i);
				// 만약 inner 클래스의 i를 지운다면 내부 클래스 inner는 i를 찾으러 바깥 클래스에 있는 변수를 사용함
				// this.i가 에러나는것은 이 inner 메소드 안에서 i를 출력하라고 했기 때문에 에러남
				System.out.println("바깥 클래스의 i변수의 값: " + Outer.this.i);
			}

		}

		inner in = new inner();
		in.inner();

	}

	public static void main(String[] args) {
		Outer out = new Outer();
		out.outerMethod();
	}
}
