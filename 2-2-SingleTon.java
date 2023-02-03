package test3;

public class SingleTon {

	private static SingleTon instance = new SingleTon(); // static 변수
	// static때문에 이미 인스턴스는 만들어져 있다 , private라서 외부에서 접근 불가(같은 패키지만 가능)

	private SingleTon() {
		// TODO Auto-generated constructor stub
		System.out.println("객체 생성");
	}

	public static SingleTon getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}

}

