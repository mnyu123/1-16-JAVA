package test4;

public class Computer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicCard g = new GraphicCard();
		g.GraphicProcess(); // 원래 그래픽 카드 클래스의 메소드

		System.out.println("------------------");

		g = new AmdRadeon();
		g.GraphicProcess();
		// RadeonOver라는 메소드를 사용하기 위해 형 변환
		((AmdRadeon) g).RadeonOver(); // GraphicCard의 자료형을 Amd로 변경하여 RadeonOver 메소드 호출

		if (g instanceof AmdRadeon) {
			((AmdRadeon) g).RadeonOver();
		}

		System.out.println("------------------");

		g = new Nvidia();
		g.GraphicProcess();
		// RayTracing라는 메소드를 사용하기 위해 형 변환
		((Nvidia) g).RayTracing(); // GraphicCard --> Nvidia 변경 및 메소드 호출

		if (g instanceof Nvidia) {
			((Nvidia) g).RayTracing();
		}

		System.out.println("------------------");
	}

}
