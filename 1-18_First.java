public class 1-18_First {
    public static void main(String[] args) {

        //-------------------구분-----------------------

        int a = 20; // 20이라는 값을 a에 "대입"하는 연산자 '='
        
        a += 1; // a에 있는 값에 1을 더한 결과를 a에 대입하라.
        
        System.out.println("result : " +a);
        
        int b = 10;
        int c = 3;
        int d = b/c;
        float e = (float)d;
        float f = (float)b/c;
        System.out.println("integer : "+d);
        System.out.println("float : "+e);
        System.out.println(f);
        
        //-------------------구분-----------------------

        int b = 10;

		int c = 3;

		System.out.println("before : " + b);
		b++; // 후위연산
		System.out.println("before : " + b);
		++c; // 전위연산

		System.out.println("after : " + c);

        //-------------------구분-----------------------
        int a = 10;
		int b = 5;

		System.out.println(a > b && b < a); // and 연산 기호 : &&
		System.out.println(a > b || a < b); // or연산 기호 : '||'
		System.out.println(a > b && b > a ^ a > b && a > b); // XOR 연산 기호 :'^'
		System.out.println(a^b); // 15가 나오는 이유
		// a의 2진수 1010 b의 이진수 0101 xor연산 이후 1111 = 10진수로 15
		System.out.println(!true); // not 연산 기호: '!'
        
        //-------------------구분-----------------------

        System.out.println(a > b ^ a == 10); // 연산자 우선순위 때문에 xor 연산이 가장 마지막에 연산함
		
		System.out.println(8|4); // 비트연산 or연산
		System.out.println(~7); // 보수 7의보수 7 이진수 0111 보수 및 부호반대 1000 10진수 -8
		
		System.out.println(Integer.toBinaryString(8)); // 2진법으로 10진수 입력을 변경
		//Integer.toBinaryString
		
		String A1 = "10";
		System.out.println(A1+3000); // 문자열 뒤에 3000이 연산이 되지않고 붙는다
		int A2 = Integer.parseInt(A1); //문자열 A1을 정수형으로 형 변환
		System.out.println(A2+3000); //A2가 정수형이라 3000이라는 정수형 숫자와 연산이 가능한것을 확인.
		
		System.out.println(Integer.MAX_VALUE); // integer의 최대 크기를 보는 내용
		int O1  = Integer.MAX_VALUE+1;
		System.out.println("overflow : "+ O1); // 오버플로우 integer의 범위를 넘어섰기 때문에 보수로 표현
		System.out.println(Integer.MIN_VALUE); // integer의 최소 크기를 보는 내용

        //-------------------구분-----------------------

        System.out.println(8 << 2); // 32가 나오는 이유
		// 8은 2진수로 1000 "<<2"는 왼쪽으로 2칸 비트이동 이므로 1000 00이 된다 100000은 10진수로 32
		System.out.println(8 >> 2); // 오른쪽으로 2칸 이동 1000 -> 0010 즉 , 2가된다
		System.out.println(8 >>> 3); // 오른쪽으로 3칸 이동 1000 -> 0001 결과가 1이 나온다

		System.out.println(-8>>>3);
		System.out.println("-8 is binary:" + Integer.toBinaryString(-8));
		System.out.println("-8 >>> 3 :   " + Integer.toBinaryString(-8 >>> 3));

		//-------------------구분-----------------------

		// 삼항 연산자
		// 조건식 ? 참일 경우 선택값 : 거짓일 경우 선택값

		int a = 10 > 5 ? 1 : 0;
		System.out.println(a); // 1이 나온다 1 == True

		//-------------------구분-----------------------
    } 
  
}
