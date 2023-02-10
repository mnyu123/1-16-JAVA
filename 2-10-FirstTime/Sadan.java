package Test1;

// sadan 클래스는 추상메소드를 완성시키거나, 
// sadan이 추상클래스가 되어 상속받은 자식클래스에게 또 미루거나 선택을 한다.
public class Sadan extends CAR {
	// 부모가 default 생성자를 썼으면 따로 생성하지 않아도 되나,
	// 따로 생성했다면 자식도 '필수'로 생성해야할 '의무'가 있다.

	// 또한 자식클래스는 의무적으로 추상메소드를 '완성' 시킬 '의무'가 있다.
	// 메소드 오버라이딩 (다형성)
	// 추상 메소드가 아니라도 메소드 오버라이딩 가능(선택 사항)

	Sadan(String color, int max_Speed, int seat, boolean power, int fuel) {
		super(color, max_Speed, seat, power, fuel); // super는 부모클래스 호출
		// TODO Auto-generated constructor stub
	}

	@Override // 메소드 오버라이딩
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Sadan이 앞으로 전진");
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		System.out.println("Sadan이 후진");
	}

	public void SadanMethod() {
		System.out.println("Sadan이 갖고있는 메소드");
	}

}
