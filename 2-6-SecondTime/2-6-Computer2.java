package test4;

public class Computer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game1 ga = new Game1();
		
		// Amd나 Nvidia는 모두 GraphicCard에서 상속 되었기 때문에 사용 가능함.
		ga.Display(new AmdRadeon());
		
		ga.Display(new Nvidia());
		
		GraphicCard gc = new GraphicCard();
	}

}

