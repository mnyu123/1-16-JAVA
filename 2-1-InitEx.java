package Practice2;

import java.util.*; // 자바 - 유틸 폴더의 모든 기능을 import 하겠다.
					// 단점 - 효율적이지 않음

public class InitEx {
	static int sVar; // static 변수 , 클래스 변수

	static void sMethod() { // static 메소드
		System.out.println("static : 가장 먼저 한번만 실행");
	}

	int Var; // 인스턴스 변수

	void Method() { // 인스턴스 메소드
		System.out.println("인스턴스 생성됨.");
	}

	static { // static 초기화 블럭
		sVar = 0; // 클래스 변수
		sMethod(); // static 메소드

//		var = 0; // 에러남
//		Method(); // 인스턴스 변수,메소드는 static 초기화 블럭에서 사용불가
	}

//	static void sMethod2() { // 에러 this 사용불가
//		this.sVar = 0; // static 변수
//		this.sMethod(); // static 메소드
//	}

	public InitEx() {
		super(); // 부모 생성자
		// TODO Auto-generated constructor stub
		System.out.println("5.생성자 호출");
	}

	// static 초기화 블럭
	static {
		System.out.println("1.클래스 초기화 블럭 실행");
	}

	// 인스턴스 초기화 블럭 실행
	{
		System.out.println("4.인스턴스 초기화 블럭 실행");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2.메인 메소드 실행");
		System.out.println("3.첫번째 객체 InitEx 생성");
		new InitEx();
		System.out.println("---------------------");
		new InitEx();

		Scanner scan = new Scanner(System.in);
	}

}
