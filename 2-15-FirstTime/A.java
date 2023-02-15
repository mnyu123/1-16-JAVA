package Test7;

class A { // 외부 클래스
	A() {
		System.out.println("A클래스의 생성자: A객체 생성함.");
	}

	static class B { // static 내부(중첩) 클래스
		B() {
			System.out.println("static 내부 클래스의 생성자: B객체 생성함.");
		}

		int var1;
		static int var2;

		void method1() {
			System.out.println("static 내부 클래스의 메소드1 실행함.");
		}

		static void method2() {
			System.out.println("static 내부 클래스의 static 메소드2 실행함.");
		}

	}

	public class C { // 인스턴트 내부(중첩) 클래스
		C() {
			System.out.println("인스턴트 내부 클래스의 생성자: C객체 생성함.");
		}

		int var1;

		void method1() {
			System.out.println("인스턴트 내부 클래스의 메소드1 실행함.");
		}

	}

	void method() { // 외부(바깥) 클래스의 메소드

		class D { // 로컬(내부,중첩) 클래스
			D() {
				System.out.println("로컬 클래스의 생성자: D객체 생성함.");
			}

			int var1;

			void method1() {
				System.out.println("로컬(내부,중첩) 클래스의 메소드1 실행함.");
			}

		}
		D d = new D(); // 로컬 클래스 객체 생성
		d.var1 = 3;
		d.method1();
	}
}
