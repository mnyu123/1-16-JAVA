package Practice2;

public class LocalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local local = new Local();
		System.out.println("인스턴스 변수 초기화 전: "+local.name); // 아직 초기화가 되지 않아서 "null" 출력
		local.process(); // name 인스턴스 변수에 초기화 함
		System.out.println("인스턴스 변수 초기화 후: "+local.name); // 이름이 정상적으로 출력
		
		local.PrintAge1();
		local.PrintAge2();
		
		System.out.println("-------------------------------");
		for(int i = 0; i<10; i++) {
			int temp = 0;
			temp += i;
			System.out.println(temp);
		}
		
//		System.out.println(temp); // temp변수가 메소드 내부에서만 생성된 '지역 변수'이므로
                                  // 변수를 확인할 수 없어 에러 발생
	}

}

class Local {
	String name; // 인스턴스 변수 , 객체는 null로 초기화
	int age; // 인스턴스 변수 , 숫자는 0으로 초기화
	char ch; // 인스턴스 변수 , char형은 값을 안넣으면 공백으로 초기화
	// 위의 3개는 같은 '객체' 안에 존재
	
	void process() {
		name = "조영재";
	}

	void PrintAge1() {
		int age = 23; // 지역 변수 , 초기화 하지 않으면 에러가 발생
		System.out.println("-------------------------------");
		System.out.println("PrintAge1의 지역변수 값 출력: " + age);
		System.out.println("-------------------------------");
		System.out.println("인스턴스 변수 'age' 출력: "+this.age);
		System.out.println("인스턴스 변수 'ch' 출력: "+this.ch);
	}
	// 지역 변수들은 각각의 메소드 내부에서만 존재, 메소드가 실행될때 생성

	void PrintAge2() {
		int age = 25; // 지역 변수는 반드시 초기화 할것.
		System.out.println("-------------------------------");
		System.out.println("PrintAge2의 지역변수 값 출력: " + age);
	}
}
