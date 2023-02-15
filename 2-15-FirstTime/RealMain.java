package Test7;

public class RealMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(); // A클래스 객체 생성
		System.out.println("-------------------------------------");

		A.B b = new A.B(); // static 클래스 객체 생성함
		b.var1 = 3; // var1 3으로 초기화 , 인스턴스로 접근함
		b.method1(); // 인스턴스로 메소드 접근함

		System.out.println("-------------------------------------");

		A.B.var2 = 3; // var2 3으로 초기화 , static클래스 사용
		A.B.method2(); // static 클래스 사용하여 접근함

		System.out.println("-------------------------------------");

		A.C c = a.new C();
		c.var1 = 3;
		c.method1();

		System.out.println("-------------------------------------");

		a.method();

		System.out.println("-------------------------------------");
	}

}
