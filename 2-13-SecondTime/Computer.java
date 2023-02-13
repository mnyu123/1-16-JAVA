package Test4;

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GraphicCard gc = new Amd(); // '그래픽카드'타입의 amd클래스(형 변환이 자동으로 일어남)
		// Amd타입인 클래스의 객체가 GraphicCard타입으로 자동 형 변환

		GraphicCard[] gc = new GraphicCard[2];
		gc[0] = new Amd();
		gc[1] = new Nvidia();

		Game g = new Game();
//		g.display(gc[0]);
//		g.display(gc[1]);

		for (int i = 0; i < gc.length; i++) {
			gc[i].process();
			g.display(gc[i]);
		}

//		System.out.println("메모리: " + gc.Memory);

//		gc.process();
//
//		gc = new Nvidia(); // 자동 형 변환
//		gc.process();
	}

}
