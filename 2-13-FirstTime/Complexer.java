package Test3;

public class Complexer implements Printer, Scanner, Fax { // 인터페이스를 '구현' 시킨다.
	// 인터페이스는 '다중' 구현이 가능함
	@Override
	public void send(String tel) { // 인터페이스에는 추상메소드 밖에 없으므로 '무조건' 다시 정의해줘야 함
		// TODO Auto-generated method stub
		System.out.println(Fax_number + " 에서 " + tel + " 로 FAX 전송됨.");
	}

	@Override
	public void receive(String tel) {
		// TODO Auto-generated method stub
		System.out.println(tel + " 에서 " + Fax_number + " 로 FAX 수신됨.");
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("스캔 실행");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("출력 실행");
	}
}
