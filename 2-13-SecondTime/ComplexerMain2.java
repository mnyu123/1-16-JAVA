package Test3;

public class ComplexerMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 익명 구현 객체
		Fax fax = new Fax() { // 원래 인터페이스는 객체생성이 불가하지만
			// 이렇게 생성은 가능함
			// 익명 클래스를 만들어 쓰고 1번 사용하고 버린다. 익명 클래스는 이름이 없다.

			@Override
			public void send(String tel) {
				// TODO Auto-generated method stub
				System.out.println("익명 구현 객체의 send()");
			}

			@Override
			public void receive(String tel) {
				// TODO Auto-generated method stub
				System.out.println("익명 구현 객체의 receive()");
			}
		};
		fax.send("02-3456-78910");
		fax.receive("02-01234-56789");

		Com_InterFace ci = new Com_InterFace() {

			@Override
			public void send(String tel) {
				// TODO Auto-generated method stub

			}

			@Override
			public void receive(String tel) {
				// TODO Auto-generated method stub

			}

			@Override
			public void scan() {
				// TODO Auto-generated method stub

			}

			@Override
			public void print() {
				// TODO Auto-generated method stub

			}
		};

	}

}
