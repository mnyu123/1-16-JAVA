package Test6;

public class UserClass {

	@UserAnnot(value = "A")
	public void methodA() {
		System.out.println("메소드 A 실행");
	}

	@UserAnnot(value = "B", number = 10)
	public void methodB() {
		System.out.println("메소드 B 실행");
	}
}
