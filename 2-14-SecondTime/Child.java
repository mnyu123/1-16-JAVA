package Test6;

public class Child extends Parent implements MyInterFace1, MyInterFace2 {

	@Override
	public void deMathod() {
		// TODO Auto-generated method stub
		System.out.println("Child 클래스의 default 메소드");
		MyInterFace1.super.deMathod();
		MyInterFace2.super.deMathod();
	}

}
