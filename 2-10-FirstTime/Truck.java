package Test1;

public class Truck extends CAR {

	Truck(String color, int max_Speed, int seat, boolean power, int fuel) {
		super(color, max_Speed, seat, power, fuel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("트럭이 전진");
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		System.out.println("트럭이 후진");
	}

}
