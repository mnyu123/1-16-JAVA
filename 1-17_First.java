package Java_1_17;

public class SecondJava {
	static int ab; // 중괄호는 지역을 나누는것 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl+space 단축키
		
		int a = 16;
		int b;
		b=0;
		System.out.println("integer 1 :" + a);
		System.out.println("integer 2 :" + b);
//		a = 20;
//		System.out.printf("a : %d\n",a);
		
		// long 타입이면 꼭 뒤에 'L'을 작성
		long c = 2241984102L;
//		c=a; // long -> integer 형 변환
		System.out.println("integer long :" + c);
		
		double d = 3.141592;
		System.out.println("integer double :" + d);
		
		
		// float 일때도 마찬가지로 뒤에 'F'를 써서 float형이라고 알려준다
		float e = 1.59234F;
		System.out.println("integer float :" + e);
		
		boolean f = true;
		System.out.println("boolean :"+ f);
		
		char g = 'a'-32; // +4는 아스키코드 65A에서 4를 더한 69가 대문자 E가 출력 된다
		System.out.println("ASCII code after: "+(int)(g+1)); // 연산 우선순위 때문에 int 내부에 소괄호로 묶었음
		// -------------- 여기까지 기본 자료형 ---------------
		
		// 문자열 선언 , 참조 자료형
		String h = "String";
		System.out.println("String type :"+h);
		
		String i = "";
		System.out.println("void String :"+i);
		
		final double J = 4.5123123; // 상수화 되었다고 표현함 , 이름있는 상수 라고도 함
		System.out.println("Final :"+J);
		
		// 리터럴 상수 , 코드상에서 이미 입력된 값들 , \n의 경우는 개행을 하라고 입력되어 있다
		System.out.println("literal : \\n , \\t , \\ , \\'");
		
		String message = "\"쌍따옴표 출력하려면 이렇게\"";
		System.out.println(message);
		
		ab = 12;
		System.out.println(ab); // 전역변수 출력
	}

}