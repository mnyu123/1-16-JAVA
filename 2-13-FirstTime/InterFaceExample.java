package Test3;

public interface InterFaceExample1 {
	public int MAX_PRICE = 1000000;
	public int MIN_PRICE = 0;

	abstract public double meanprice(); // 인터페이스에는 추상메소드만 선언 가능함

	public double totalprice(); // 'abstract'는 작성하지 않아도 무관

	default double getSalePrice(double price) { // 인터페이스에는 default메소드만 작성가능
		return price - (price * 0.05);
	}

	static void printPrice(double price) { // 객체를 안 만들고 특정 기능만 실행하고 싶을때 사용
		System.out.println("값 출력: " + price);
	}
}


