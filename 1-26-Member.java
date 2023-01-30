package Practice2;

// 클래스 구성 = 필드 , 생성자 , 메소드
public class Member {
	String ID;
	String Name;
	String Email;
	int Level;
	// 위의 '필드'에 있는 내용은 '인스턴스 변수'라고도 부른다.

	// '생성자' 작성 (하나의 메소드) , 클래스 이름과 똑같이 메소드 작성
	// '생성자'를 작성하지 않았을 경우 JAVA가 자동으로 '기본 생성자(디폴트 생성자)'를 만들어서 사용한다.
	// 객체 생성시 자동으로 1번 실행
	Member(String ID, String Email, String Name, int Level) { // <-- 괄호안 내용 : "파라미터" or "매개변수"
		super(); // 항상 super();는 맨 위에 존재해야함 , 없어도 됨
		System.out.println("-----Member 첫번째 생성자 실행-----");
		this.Level = Level; // "this"는 내 객체 내 에서 접근할때 사용
		this.ID = ID; // "this 생성자" 라고 한다.
		this.Name = Name; // 객체가 존재하는 동안 인스턴스 변수를 대입해 백업
		this.Email = Email; // 이 매개변수들은 '지역변수' 
	}
	// 메소드 오버로딩 - 이름이 같은 메소드가 여러개(하지만 매개변수 순서,자료형,개수 등이 달라야한다.)
	public Member(String iD, String name, String email) { // 메소드의 시그니처
//		super(); // 부모 클래스의 생성자 호출(없으면 JAVA가 알아서 생성)
//		ID = iD;
//		Name = name;
//		Email = email;
		this(iD,name,email,1); // "this 생성자"의 호출
		System.out.println("-----Member 두번째 생성자 실행-----");
	}
	
	// 메소드 생성
	
	void PrintMemberInfo() { // Member 정보 출력
		System.out.println("-------------------------------");
		
		System.out.println("메소드에서 출력한 회원의 아이디는: "+this.ID); 
		System.out.println("메소드에서 출력한 회원의 이메일은: "+this.Email);
		System.out.println("메소드에서 출력한 회원의 이름은: "+this.Name);
		System.out.println("메소드에서 출력한 회원의 레벨은: "+this.Level);
	}

}