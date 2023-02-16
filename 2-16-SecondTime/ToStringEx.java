package Test9;

public class ToStringEx {
	public static void main(String[] args) {
		Fruit f = new Fruit("사과", "녹색");
		System.out.println(f);

	}
}

class Fruit {
	String name;
	String color;

	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "과일 색상: "+this.color;
	}

//	@Override
//	public String toString() {
//		return color;
//	}
	
	

}
