package TryCatch;

public class TryTest1 {

	public void f01() throws Exception {
		System.out.println("f01 메소드");
//		try {
//			f02();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		f02();// 결국 f01이 예외를 처리해야 한다. 만약 f01도 예외를 처리하지 않는다면? ->'던지기'
	}

	public void f02() throws Exception {
		System.out.println("f02 메소드");
//		try {
//			f03();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		f03();// f02는 두가지 방법이 있다 1. 직접 예외 처리 2. 또 떠넘기기
	}

	public void f03() throws Exception { // 예외 '떠넘기기' => (throws 예외상황)
		System.out.println("f03 메소드");

//		try { // 예외를 처리하는 구문
		int test = 1 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

		// 만약 f03에서 예외를 처리하지 않고 f02나 f01 메소드에서 처리하고 싶다면?
		// '예외 떠넘기기'

		// 예외는 메소드 단위

//		int test = 1 / 0; // 런타임 에러 ,예외 발생 , 0으로 나누는경우는 없다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryTest1 t = new TryTest1();
		try {
			t.f01();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		// 이제 메인메소드가 예외를 책임져야 한다.
		// 만약 메인메소드 에서도 예외를 책임지지 않는다? -> 최악의 경우(아무도 책임을 안짐)
	}

}
