package test5;

import test4.Phone;

public class Samsung extends Phone { // "phone" 클래스를 상속받아서 써보자.
	// 에러가 났던 이유 = default 생성자는 알아서 해주는데 우리가 만든 생성자는 괄호안에 뭐가 있는지 모르기 때문

	public Samsung(String company, String color, String model) {
		// 부모클래스에서 먼저 초기화가 되고 나서 사용해야 하는데 아직 초기화 되지 않아서 에러 발생.

		super(company, color, model, 0, false); // 부모 생성자 호출

		System.out.println("Samsung 클래스의 초기화");
	}

	public static void main(String[] args) {
		Samsung samsung = new Samsung("삼성", "블루", "갤럭시S23");
		samsung.color = "블랙";
		samsung.price = 1300000;
		System.out.println("가격은: " + samsung.price);

		samsung.OnPower();
		samsung.OffPower();
	}

}
