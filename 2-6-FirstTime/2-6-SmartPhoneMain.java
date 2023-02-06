package test5;

import java.util.ArrayList;

import test4.Phone; // Phone 클래스가 같은 패키지에 없기 때문에 import

public class SmartPhoneMain {
	// 자바의 '다형성'을 보기위한 예제
	public static void main(String[] args) {
		ArrayList<Phone> list = new ArrayList<Phone>(); // ArrayList 클래스 사용
		list.add(new Apple()); // '자식 클래스'를 리스트에 추가 가능함 상속 관계때문
		list.add(new Samsung()); // 자식 클래스의 타입인 Samsung을 부모 클래스 타입인 Phone으로 자동 형 변환
		list.add(new Phone());
		// 원래 리스트에는 같은 자료형만 들어가야 하지만 위의 3개의 자료형이 '같은' 자료형으로 관리가 가능하다.
		// 자식 클래스의 객체는 부모 클래스의 객체의 '타입(자료형)'으로 '자동 형 변환' 가능
		// 부모 클래스는 '자료형'으로 자식 클래스의 객체를 접근하여 사용가능
		// 부모 클래스가 상속해준 필드와 메소드는 접근 가능함

		// 자식 클래스가 따로 생성한 메소드는 접근 불가 -> 접근하려면? 자료형을 부모의 타입에서 다시 자식의 타입으로 변경
		for (int i = 0; i < list.size(); i++) {
			list.get(i).OnPower();

			if (list.get(i) instanceof Apple) { // i번째 객체가 Apple이냐 를 알아보는 메소드
				Apple apple = (Apple) list.get(i); // 부모 -> 자식클래스의 타입으로 수동 형 변환
				apple.AppleRepair();
			}
			if (list.get(i) instanceof Samsung) { // i번째 객체가 Samsung이냐 를 알아보는 메소드
				Samsung samsung = (Samsung) list.get(i); // 부모 -> 자식클래스의 타입으로 수동 형 변환
				samsung.SamsungRepair();
			}
		}
	}

}
