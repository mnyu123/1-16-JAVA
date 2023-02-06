package test4;
//자바의 '다형성'을 보기위한 예제
public class Phone extends Object { // 'extends Object'를 따로 쓰지 않아도 JAVA가 알아서 생성함
	// 뜻: Object클래스를 "상속" 받겠다.

	// 상속 받은 관계에서는 'protected' 접근 제한자를 사용해 상속 관계 끼리 같은 클래스 내의 변수와 메소드를 사용할 수 있다.
	public void OnPower() {
		System.out.println("기본 스마트폰 전원 킴");
	}
}

