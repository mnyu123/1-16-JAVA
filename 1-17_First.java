package Java_1_17;

public class SecondJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl+space 단축키
		
		int a = 16;
		int b;
		b=0;
		System.out.println("integer 1 " + a);
		System.out.println("integer 2 " + b);
		
		// long 타입이면 꼭 뒤에 'L'을 작성
		long c = 2241984102L;
		System.out.println("integer long " + c);
		
		double d = 3.141592;
		System.out.println("integer double " + d);
		
		// float 일때도 마찬가지로 뒤에 'F'를 써서 float형이라고 알려준다
		float e = 1.59234F;
		System.out.println("integer float " + e);
		
		boolean f = true;
		System.out.println(f);
		
		char g = 'A'+4; // +4는 아스키코드 65A에서 4를 더한 69가 대문자 E가 출력 된다
		System.out.println(g);
		// -------------- 여기까지 기본 자료형 ---------------
		
		// 문자열 선언 , 참조 자료형
		String h = "String";
		System.out.println(h);
		
	}

}