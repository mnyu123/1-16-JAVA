package Practice5;

abstract class Shape { // 추상 = abstract 클래스
	// 추상 클래스는 미완성된 클래스 , 그래서 인스턴스 생성을 하면 에러
	String type;

	Shape(String type) {
		this.type = type;
	}
	// 추상 클래스 , 메소드 실습
	abstract double area();

	abstract double length();
	
	// 왜 부모클래스는 메소드를 미완성 했는가?
	// 자바의 다형성 생각 -> 상황에 따라서 자식이 재정의 할 때가 있음
	// 따라서 부모클래스는 대체로 틀 정도만 만들어서 상속 형태로 자식 클래스에 제공
}


