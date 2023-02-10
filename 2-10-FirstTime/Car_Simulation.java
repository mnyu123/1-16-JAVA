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

//		CAR sa = new Sadan("블랙", 170, 6, false, 5000);
//		sa.go();
//		sa.back();
//
//		CAR bus = new Bus("노랑", 140, 20, false, 10000);
//		bus.go();
//		bus.back();
//
//		CAR tr = new Truck("파랑", 150, 2, false, 7000); // 타입을 truck이 아닌 CAR로 바꿔도
		// 자동 형 변환이 일어난다,작성 가능함

//		Object truck = new Truck("파랑", 150, 2, false, 7000); 
//		truck.printcarInfo(); // 에러가 나는 이유 'Object' 클래스에는 printcarInfo라는 메소드가 정의되지않음
		// truck이 객체에 접근하는 타입이 Object 이므로 Object 클래스에 접근은 가능하지만 CAR 클래스에는 접근 불가함

//		tr.go();
//		tr.back();
//
//		sa.printcarInfo();
//		bus.printcarInfo();
//		tr.printcarInfo();

		CAR car[] = new CAR[3];
		car[0] = new Sadan("블랙", 170, 6, false, 5000);
		car[1] = new Bus("노랑", 140, 20, false, 10000);
		car[2] = new Truck("파랑", 150, 2, false, 7000);

		for (int i = 0; i < car.length; i++) { // 배열 객체로 선언 가능함 -> 비슷한 클래스끼리 있기 때문
			car[i].printcarInfo();
			if (car[i] instanceof Sadan) { // Sadan만이 갖고있는 메소드를 CAR 타입으로 자동 형 변환 한것.
				Sadan sadan = (Sadan) car[i];
				sadan.SadanMethod();
			}
		}

//		CAR car1 = new CAR("파랑", 200, 4, false, 5000); // 추상 car 클래스는 객체 생성불가 -> 에러

//		human1.Check();
//		car1.TurnOn();
//		car1.move();
//		car1.whoSeat();

		// int n, Human h
//		car1.addHuman(0, human2); // 0번은 운전석 , 운전석에 현재 human2번이 타고있다.
//
//		// 메소드 오버로딩 된 메소드 , 여러명의 사람 탑승
//		car1.addHuman(hs, 1); // 1번지 부터
//		car1.printcarInfo();

//		car1.printhuman();
//		car1.printcarInfo();
	}

}