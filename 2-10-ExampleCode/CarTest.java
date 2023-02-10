package test01;
public class CarTest {
	public static void main(String[] args) {
		Human h1 = new Human("이순신", Human.LICENSE_TYPE_1, 100000);
		Human h2 = new Human("유관순", Human.LICENSE_TYPE_2, 150000);
		Human h3 = new Human("김구", Human.LICENSE_TYPE_0, 200000);
		Human[] hs = new Human[2];
		hs[0] = h2;
		hs[1] = h3;
		Car car1 = new Car(5, "black", 200); // 5인승
		car1.addHuman(h1, 0); // 운전석에 사람 탑승
		car1.printCarInfo();
		car1.addHuman(hs, 1);
		car1.printCarInfo();
	}
}
