package test4;

public class Phone extends Object { // 'extends Object'를 따로 쓰지 않아도 JAVA가 알아서 생성함
	// 뜻: Object클래스를 "상속" 받겠다.
	protected String company;
	protected String color;
	protected String model;
	protected int price;
	boolean bettery;

	// 상속 받은 관계에서는 'protected' 접근 제한자를 사용해 상속 관계 끼리 같은 클래스 내의 변수와 메소드를 사용할 수 있다.

	public Phone(String company, String color, String model, int price, boolean bettery) {
		super(); // "부모 클래스"인 Object 클래스의 생성자 호출
		// 생성자는 당연히 부모 클래스의 초기화가 먼저

		System.out.println("Phone클래스의 초기화");

		this.company = company;
		this.color = color;
		this.model = model;
	}

	protected void OnPower() {
		System.out.println("전원 킴");
	}

	protected void OffPower() {
		System.out.println("전원 종료");
	}
}

