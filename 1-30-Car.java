package Practice2;

public class Car {
	
	// 필드의 변수들의 종류 정리
	static int num; // 클래스 변수(정적 변수) , 대표로 '하나'만 있고 공유해서 사용
	// 클래스 변수는 프로그램 시작부터 끝까지 메모리에 계속 있음
	// 클래스 변수 생성시기 : 클래스가 메모리에 로드 될때
	
	String color; // 인스턴스 변수 (객체마다 각각 따로따로 존재함) , 객체가 사용되는 동안만 존재
	// 인스턴스 변수 생성시기 : 객체가 생성(new) 될때
	String company;
	String type;

	// 예제 코드를 수정 - 1. 생성자 생성 ( 필드에 우클릭 -> source -> Generated from ~~~ using field )
	public Car(String color, String company, String type) {
		super();
		this.color = color;
		this.company = company;
		this.type = type;
		
		int sum = 0; // 지역변수(메소드 내부에서만 사용하는 변수)
		// 지역변수 생성시기 : 해당 메소드 실행문이 실행 될 때 / 메소드 종료시 : 사라짐
	}

	public void go() {
		System.out.println("전진하다.");
	}

	public void back() {
		System.out.println("후진하다.");
	}

	
	// 예제 코드를 수정 - 2. 출력해주는 '메소드' 생성
	public void Print() {
		System.out.println("color = " +this.color);
		System.out.println("company = " +this.company);
		System.out.println("type = " +this.type);
	}
}

