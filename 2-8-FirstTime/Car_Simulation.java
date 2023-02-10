package 2-8-FirstTime;

package Test1;

public class Car_Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human("영재", Human.LICENSE_Type_3, 10000000);
		Human human2 = new Human("상연", Human.LICENSE_Type_1, 5000000);
		Human human3 = new Human("준패", Human.LICENSE_Type_2, 7000000);

		Human[] hs = new Human[2];
		hs[0] = human1;
		hs[1] = human3;

		CAR car1 = new CAR("파랑", 200, 4, false, 5000);

//		human1.Check();
//		car1.TurnOn();
//		car1.move();
//		car1.whoSeat();

		// int n, Human h
//		car1.addHuman(0, human2); // 0번은 운전석 , 운전석에 현재 human2번이 타고있다.

		// 메소드 오버로딩 된 메소드 , 여러명의 사람 탑승
		car1.addHuman(hs, 1); // 1번지 부터
		car1.printcarInfo();

//		car1.printhuman();
//		car1.printcarInfo();
	}

}

