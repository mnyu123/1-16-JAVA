package test4;

public class Game1 {
	void Display(GraphicCard g) { // 부모클래스 타입을 매개변수로 정의
		g.GraphicProcess(); // '그래픽 프로세스' 라는 이름으로 실행하게 되면 
							// --> 자식 클래스의 내용이 실행이 가능함. => 다형성
	}
}
