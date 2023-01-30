package Practice2;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("TEST2", "Test@gmail.com", "테스트", 3); // <- '인수' 라고 부름
		            // 작성한 내용을 생성자에게 전달 , 매개변수에 작성했던 순서대로 작성해야함 
		
		Member m2 = new Member("TEST3", "Test3@gmail.com", "테스트3");
		Member m3 = m;

		// 하나의 "Member" 설계도(클래스) 에서 2개의 'new' 키워드로 2개의 객체가 생성되었다.
		// m이 참조하는 객체와 m2가 참조하는 객체가 서로 다르게 생성된 '2'개의 객체이므로
		// 서로 다르다고 할 수 있다.

//		if (m == m2) {
//			System.out.println("m객체와 m2객체는 같다.");
//		} else {
//			System.out.println("m객체와 m2객체는 다르다.");
//		}
//		System.out.println("----------------------------------");
//		if (m == m3) {
//			System.out.println("m객체와 m3객체는 같다.");
//			// 같은 이유 : m이 가지고 있는 주소를 m3에 복사(대입)해서 전달해줬기 때문에 서로 같다.
//		} else {
//			System.out.println("m객체와 m3객체는 다르다.");
//		}

//		m.ID = "JOEYOUNGJAE";
//		m.Email = "whdudwo555582@gmail.com";
//		m.Name = "조영재";
//		m.Level = 6;

//		m2.ID = "TEST2";
//		m2.Email = "Test@gmail.com";
//		m2.Name = "테스트";
//		m2.Level = 3;
		
		System.out.println("----------------------------------");
		
		System.out.println("회원의 아이디는: "+m3.ID); // m3가 참조하는 클래스 - Member에서 생성자로 전달된
												   // 매개변수 ID를 참조해 접근
		System.out.println("회원의 이메일은: "+m3.Email);
		System.out.println("회원의 이름은: "+m3.Name);
		System.out.println("회원의 레벨은: "+m3.Level);
		
		System.out.println("----------------------------------");
		
		System.out.println("회원의 아이디는: "+m2.ID);
		System.out.println("회원의 이메일은: "+m2.Email);
		System.out.println("회원의 이름은: "+m2.Name);
		System.out.println("회원의 레벨은: "+m2.Level);
	}

}