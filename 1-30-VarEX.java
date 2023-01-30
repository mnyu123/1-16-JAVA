package Practice2;

public class VarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avante avante = new Avante();
		
		// 클래스 변수는 객체를 만들지 않아도 바로 출력 가능하다. 메모리 공간에 계속 존재하기 때문
		System.out.println("클래스 변수 출력: "+Avante.company);
		
		System.out.println(avante.color);
	}

}
class Avante{ // 하나의 클래스 안에 클래스를 또 생성가능('내부 클래스')
	String color = "블랙"; // 인스턴스 변수
	static String company = "현대";
}
