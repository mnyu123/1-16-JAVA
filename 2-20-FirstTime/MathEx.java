package Test9;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math 클래스
//		System.out.println(Math.abs(-10)); // abs = 절댓값
//		System.out.println(Math.PI); // PI final상수
		// -------------------------------------------

		// Wrapper 클래스
		int i = 10;
		Integer intg = (Integer) i;
		Integer intg2 = new Integer(20); // 현재 취소선 -> 권장하지 않음
		int k = (int) intg2; // 형 변환
		int j = Integer.parseInt("40");
		Integer m = Integer.valueOf("60");
		System.out.println(m);

	}

}
