package 2-8-FirstTime;

public class Car_Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human("나", Human.LICENSE_Type_3, 10000000);
		Human human2 = new Human("상", Human.LICENSE_Type_1, 5000000);
		Human human3 = new Human("준", Human.LICENSE_Type_2, 7000000);

		CAR car1 = new CAR(null, 0, 0, false, 0, null);

		human1.Check();
		car1.TurnOn();
		car1.move();
		car1.whoSeat();
	}

}

