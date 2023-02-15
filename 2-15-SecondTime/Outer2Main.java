package Test7;

public class Outer2Main {
	public static void main(String[] args) {
		Outer2 out = new Outer2();

		out.setexam(new InExam1()); // ex) 필터 1 사용
		out.outerMethod(); // 출력문

		out.setexam(new InExam2()); // ex) 필터 교체, 필터 2 사용
		// 다형성,
		out.outerMethod(); // 출력문
	}
}
