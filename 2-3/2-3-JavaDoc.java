package test3;

public class JavaDoc {
	/**
	 * 두 변수의 합 반환
	 * 
	 * @param a -> 첫번째 변수
	 * @param b -> 두번째 변수
	 * @return a+b
	 */
	// 본인이 만든 메소드나 클래스의 도움말을 작성하는 주석코드 -> JavaDoc
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		JavaDoc j = new JavaDoc();
		j.add(0, 0);
	}
}

