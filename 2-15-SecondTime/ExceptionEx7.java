package Test8;

public class ExceptionEx7 {

	public static void main(String[] args) {// throws Exception{
		// TODO Auto-generated method stub
		try {
			first(); // 1번 first 실행
		} catch (Exception e) {
			System.out.println("main() 예외 처리"); // 7번 떠넘겨진 예외 catch
			System.out.println(e.getMessage()); // 8번 "예외 발생" 메시지 출력
//			e.printStackTrace();
//			throw e;
		}
	}

	static void first() throws Exception {
		try {
			second(); // 2번 second 실행
		} catch (Exception e) {
			System.out.println("first() 예외 처리");
			throw e; // 6번 예외 재 발생 -> 메인으로 토스
		}
	}

	static void second() throws Exception {
		try {
			throw new Exception("예외 발생"); // 3번 출력문 실행
		} catch (Exception e) { // 4번 매개변수 e로 예외가 넘어오는데 예외를 catch는 했으나
			System.out.println("second() 예외 처리");
			throw e; // 5번 그 'e'를 다시 던졌기 때문에 예외 재 발생 -> first로 토스
		}
	}

}
