package test3;

import java.util.Calendar;
import java.util.Date;

public class SingleTonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingleTon s = new SingleTon(); // 에러

		SingleTon s1 = SingleTon.getInstance(); // static이 있기 때문에 new가 없어도 바로 접근 가능
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();

		System.out.println("---------");

//		Date date = new Date(); // 새로운 객체를 만드는 방식
//		System.out.println(1900 + date.getYear() + "년"); // 취소선은 "권장하지 않는 기능" , 에러는 나지 않으나 너무 예전버전 내용
//		System.out.print(date.getMonth() + 1 + "월"); // 0월부터 세서 +1 해줘야함
//		System.out.println(date.getDate() + "일");
//		System.out.println(date.getHours() + "시" + date.getMinutes() + "분" + date.getSeconds() + "초");
		// 예전 방식은 객체를 계속 새로 만들어서 쓰기 때문에 이것을 방지하기 위한 디자인 패턴이 "싱글턴" 구조

		// 싱글턴 구조 getInstance는 static 구조 = 생성하지 않아도 먼저 생성됨.
//		Calendar ca = Calendar.getInstance(); // 객체를 생성하지 않았음
//		System.out.println(ca.get(Calendar.YEAR) + "년");
//		System.out.println(ca.get(Calendar.MONTH) + 1 + "월" + ca.get(Calendar.DATE) + "일");
//		System.out.println(ca.get(Calendar.HOUR) + "시" + ca.get(Calendar.MINUTE) + "분" + ca.get(Calendar.SECOND) + "초");
//		
		// 싱글톤은 데이터베이스를 접근하는 객체에 자주사용

		Final f = new Final();
//		f.number = 200; // 에러. 이름이 있는 상수 number는 '100'으로 값이 고정되어 변경될 수 없다.
		System.out.println(Final.newYear);
		Final.newYear = 2024;
		System.out.println(Final.newYear);
	}

}

class Final {
	final int number; // 이름이 있는 상수

	static int newYear; // static이 붙어있기 때문에 참조변수로 접근하지 않아도
	// 클래스 이름 'Final'로 접근 가능하다.

	Final() {
		number = 100;
		newYear = 2023;
	}

}
