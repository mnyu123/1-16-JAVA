package Practice2;

public class CarMain3 {
	// 교재의 CarMain 1,2 예제는 생략하고 넘어갔음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = new Car[3]; // 밑에서 new Car(); 에서 객체가 생성될때 그 주소들을
									// 객체 주소들을 배열에 저장(객체 배열)

		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car("화이트", "현대", "승용차"); // 실제로 객체가 생성되는 곳은 이 내용
			System.out.println("-------------------------------");
			cars[i].Print();
//			cars[i].color = "화이트"; // 0 : 화이트 , 1 : 화이트, 2 : 화이트
//			cars[i].company = "현대"; // 생성자가 있으면 이 내용들은 필요없음
//			cars[i].type = "승용차"; // 
		}

//		System.out.println("-------------------------------");
//		System.out.println("cars[0]번 인덱스 = " + cars[0].color);
//		System.out.println("cars[1]번 인덱스 = " + cars[1].color);
//		System.out.println("cars[2]번 인덱스 = " + cars[2].color);

		cars[0].color = "블랙";
//		// 0 : 블랙 , 1 : 화이트, 2 : 화이트

		System.out.println("-------------------------------");

		for (int i = 0; i < cars.length; i++) { // 0번지의 'color'를 '블랙'으로 변경한 이후 출력
			System.out.println(i + "번지: ");
			cars[i].Print();
			System.out.println("-------------------------------");
		}

//		System.out.println("-------------------------------");
//		System.out.println("cars[0]번 인덱스 = " + cars[0].color);
//		System.out.println("cars[1]번 인덱스 = " + cars[1].color);
//		System.out.println("cars[2]번 인덱스 = " + cars[2].color);

	}

}
