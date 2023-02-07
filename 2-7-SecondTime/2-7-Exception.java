package TryCatch;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = { 1, 2, 3 };
			System.out.println(arr[3]); // 3번지가 없는데 접근 -> 예외 상황
			System.out.println(3 / 0); // 0으로 나눌수 없는데 작성 -> 예외 상황
			Integer.parseInt("a"); // 문자열을 넣어야 하는데 -> 예외 상황
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누는 경우가 없음");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 초과함");
		} catch (Exception e) { // Exception - 가장 큰 범위의 예외 처리
			System.out.println("예외 발생");
		} finally {
			System.out.println("finally는 예외가 발생하든 안하든 마지막에 무조건 실행함.");
		}
	}

}

