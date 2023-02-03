package Practice2;

public class VarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avante avante = new Avante();

		// 클래스 변수는 객체를 만들지('new') 않아도 바로 출력 가능하다. 메모리 공간에 계속 존재하기 때문
		System.out.println("클래스 변수 출력: " + Avante.company);

		System.out.println(avante.color);
		
		System.out.println("-------------------------------");
		
		System.out.println(avante.getColor());
		System.out.println(avante.getSpeed());
		
		avante.color = "화이트";
		avante.speed = 200;
		
		System.out.println("-------------------------------");
		
		System.out.println("변경 후: "+avante.getColor());
		System.out.println("변경 후: "+avante.getSpeed());
		
		System.out.println("-------------------------------");
		
		Avante avante2 = new Avante();
		avante2.color = "레드";
		System.out.println("기존의 색: "+avante.color);
		System.out.println("avante2 객체의 색: "+avante2.color);
		System.out.println("-------------------------------");
		System.out.println(Avante.company);
		System.out.println(avante2.company);
	}

}

class Avante { // 하나의 클래스 안에 클래스를 또 생성가능('내부 클래스')
	String color = "블랙"; // 인스턴스 변수
	static String company = "현대"; // 클래스 변수 , 객체가 생성되지 않아도 미리 생성됨. 클래스 이름을 통해 접근
	int speed = 150;

	// 예제와 달리 직접 작성한 메소드
	public String getColor() {
		return color;
	}

// 우클릭 -> source -> getter & setter탭에서 생성한 코드	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

// 직접 타이핑한 speed값을 get 하는 내용
//	public int getSpeed() {
//		return speed;
//	}
}