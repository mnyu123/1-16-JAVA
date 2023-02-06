package test5;

import test4.Phone; // 자바의 '다형성'을 보기위한 예제

public class Samsung extends Phone { // "phone" 클래스를 상속받아서 써보자.
	// 에러가 났던 이유 = default 생성자는 알아서 해주는데 우리가 만든 생성자는 괄호안에 뭐가 있는지 모르기 때문

	@Override
	public void OnPower() { // 메소드 오버라이딩. 부모 클래스에 있던 메소드를 자식 클래스에서 다시 '같은 이름'으로
							// 재 정의 하여 사용(덮어쓰기가 적용되어 자식클래스의 메소드 내용이 출력)
		System.out.println("삼성 전원 켜짐");
	}

}

