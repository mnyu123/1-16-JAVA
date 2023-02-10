package Test3;

public interface InterFaceExample1 {
	public int MAX_PRICE = 1000000;
	public int MIN_PRICE = 0;

	abstract public double meanprice(); // 인터페이스에는 추상메소드 선언 가능함

	public double totalprice(); // 'abstract'는 작성하지 않아도 무관

}

