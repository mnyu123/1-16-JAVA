package Test6;

public interface MyInterFace2 {
	default void deMathod() {
		System.out.println("2번 인터페이스의 default 메소드");
	}

	static void stMathod() {
		System.out.println("2번 인터페이스의 static 메소드");
	}
}
