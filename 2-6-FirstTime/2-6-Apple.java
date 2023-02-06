package test5;

import test4.Phone;

public class Apple extends Phone { // 자바의 '다형성'을 보기위한 예제

	@Override
	public void OnPower() { // 메소드 오버라이딩. 부모 클래스에 있던 메소드를 자식 클래스에서 다시 '같은 이름'으로
							// 재 정의 하여 사용(덮어쓰기가 적용되어 자식클래스의 메소드 내용이 출력)
		System.out.println("아이폰 전원 켜짐");
	}
}

