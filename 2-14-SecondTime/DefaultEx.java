package Test6;

public class DefaultEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.deMathod(); // default 메소드
		c.Method1(); // parent클래스가 가지고 있는 일반 메소드

		MyInterFace1.stMathod(); // static 메소드
		MyInterFace2.stMathod();
	}

}
