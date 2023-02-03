package Practice2;

public class ParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Param param = new Param();
		// 수동 형변환
		param.add((int) 3.0, (int) 5.0); // 인수 -> 파라미터로 전달
		param.add2(3.126, 4.134);
		System.out.println("리턴값으로 받은 결과: " + param.Add(4, 6));

		System.out.println("-------------------------------");

		System.out.println("add2 메소드 리턴값 출력: " + param.add2(5.142, 6.421));
		System.out.println("-------------------------------");

		param.add(3.0, 5.0);
		System.out.println("-------------------------------");

		param.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("-------------------------------");

		int[] arr = { 101, 202, 303, 404, 505, 606, 707, 808, 909, 1010 };
		param.add3(arr);
	}

}

class Param {

	void add(int x, int y) { // 매개변수(파라미터),순서랑 타입 일치할것.
		int sum = x + y;
		System.out.println("정수 덧셈 결과: " + sum);
	}

	// 메소드 오버로딩 = 메소드 이름은 같은데 매개변수가 다름.
	void add(double x, double y) { // 매개변수(파라미터),순서랑 타입 일치할것.
		System.out.println("구분된 add 메소드의 덧셈 결과: " + (x + y));
	}

	void add(int... x) { // '...'은 여러개를 "배열"로 받을 수 있음
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("가변적인 매개변수: " + sum);
	}

	// 배열 객체의 참조변수 1개 전달가능
	void add3(int[] x) { // 이 형태는 위의 내용과 내부적으로 같지만
		// 입력받는 형식이 다르다 , 배열 형태로 받아야함
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("배열 매개변수를 받은 메소드 출력: " + sum);
	}

	double add2(double x, double y) { // void 형은 리턴하는 값이 없을때
		double sum = x + y;
		System.out.println("실수 덧셈 결과: " + sum);
		return x + y;
	}

	int Add(int x, int y) { // int 형은 리턴하는 값은 int형으로 반환 해야함
		// return 타입은 리턴할 값의 자료형으로 맞춰라.
		return x + y;
	}

	// 접근제한자|리턴타입|메소드명|매개변수
	public void TestMethod(int A, int B) {
		// 실행문 작성
		// return 값 작성 , 단 void형은 리턴값이 없다
	}
}