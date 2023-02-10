package 2-8-FirstTime;

package Test1;

class CAR {
	private String color; // 색상
	private int Max_Speed; // 최고속도
	private int seat; // 좌석 수
	private boolean Power = false; // 시동 = 기본값(false)
	private int fuel; // 연료
	private int hcount; // 탑승자 수

	// 자료형 변수명
	private Human[] human_seat; // 좌석수 관리할 배열 - 탑승자 관리
	// 정해져 있는 수의 다수의 데이터 관리 - 배열
	// 유동적인 데이터 관리 - ArrayList

	CAR(String color, int max_Speed, int seat, boolean power, int fuel) {
		super(); // 부모클래스 'Object' 클래스의 기본으로 생성되는 생성자 호출
		this.color = color;
		Max_Speed = max_Speed;
		this.seat = seat;
		Power = power;
		this.fuel = fuel;

		// 배열 객체 이제야 초기화
		this.human_seat = new Human[seat]; // Human[4]
		// 아직 초기화를 하지않아서 모든 배열 인덱스에 null값이 있음
	}

	public void move() {
		if (!Power) { // 시동이 꺼져있는 경우를 봄 앞에 '!' not을 붙여서
			System.out.println("시동이 켜져있지 않습니다.");
			return; // return을 붙여주지 않으면 밑에있는 내용을 출력하게 되어 프로그램이 꼬인다.
			// 조건이 맞았으면(시동이 꺼져있으면) return을 해 나머지 내용을 동작 못하게 한다.
		}
		System.out.println("자동차 이동");
	}

	public void TurnOn() {
		this.Power = !this.Power; // Power = false -> not 연산 이후 -> true
		System.out.println("시동 켬: " + Power);
	}

//	public void addSeat() {
//		int seat = 4;
//		int temp = 0;
//		while (true) {
//			seat -= 1;
//			temp += 1;
//			if (seat == 0) {
//				break;
//			}
//		}
//		System.out.println("좌석에 모두 앉았습니다.");
//		System.out.println("남은좌석 수: " + seat + " 앉은 사람수: " + temp);
//	}

	public void whoSeat() {
//		seat = 4;
		System.out.println("몇명 탔는가: " + seat);
		for (int i = 0; i < human_seat.length; i++) {
			System.out.println(human_seat[i]);
		}
	}

	/**
	 * 사람이 탑승하는 메소드
	 * 
	 * @param n 좌석 번호
	 * @param h 사람(human1,human2,human3)
	 * @return 탑승자 수
	 */

	public int addHuman(int n, Human h) { // 현재는 n에는 0 h는 human2의 정보
		// 여기에서 human_seat 배열 객체에 0번지에 human2의 정보가 들어갔다
		// 하지만 나머지 배열에는 아직 전부 null값이 있다.
		// human_seat[상연 , null , null , null] 이렇게 존재중
		if (hcount == seat) {
			System.out.println("빈 좌석이 없습니다.");
			return n;
		}

		if (human_seat[n] == null) { // human이 좌석에 아무도 안앉았는지
			System.out.println(n + "번 좌석 비어있음");
			human_seat[n] = h; // 현재 human2의 정보를 0번 좌석에 대입
			hcount++; // 사람이 한명 배열에 채워졌기 때문에 count + 1
			// 현재
			// human_seat[0]<- human2사람 배열 추가
			// human_seat[1]~[3] 모두 비어있음
		}

		else {
			System.out.println(n + "번 좌석은 사람있음");
		}
		return hcount;
	}

	/**
	 * 
	 * @param h 사람 배열
	 * @param n 시작 좌석 번호
	 * @return 탑승자 수
	 */
	// 메소드 오버로딩 예제 실습
	public int addHuman(Human[] h, int n) { // 여러명의 사람을 동시에 입력
		for (int i = n, j = 0; i < h.length + n; i++, j++) { // for문에 여러개의 조건을 작성가능함
			if (human_seat[n] == null) {
				human_seat[n] = h[j];
				hcount++;
			}
		}
		return hcount;
	}

	/**
	 * 자동차의 현재 정보를 모두 출력하는 메소드
	 * 
	 * 예외 처리 과정도 존재
	 */

	public void printcarInfo() { // 자동차의 모든 정보를 출력할 메소드
		System.out.println("--------자동차의 정보를 출력하는 메소드 동작함--------");
		System.out.println("현재 Power(시동 여부): " + Power);
		System.out.println("현재 color(색상): " + color);
		System.out.println("현재 Max_Speed(최고 속도): " + Max_Speed);
		System.out.println("현재 seat(좌석 수): " + seat);
		System.out.println("현재 fuel(연료): " + fuel);
		System.out.println("현재 hcount(탑승자 수): " + hcount);

		// 예외 처리 실습
		try {
			for (int i = 0; i < human_seat.length; i++) {
				System.out.println("[" + i + "번째 탑승자]");
				System.out.println(human_seat[i].name + " <-이 사람이 타고있음."); // 이름,면허는 default라 .으로 접근
				System.out.println(human_seat[i].license + " <-이 사람의 면허.");
				System.out.println(human_seat[i].getMoney() + " <-이 사람의 돈을 가져와라."); // 돈은 private라 get으로 접근
			}
		} catch (NullPointerException e) {
			System.out.println("예외 처리됨.");
		}

		// if 조건으로 예외 처리하는 내용(주석)

//		for (int i = 0; i < human_seat.length; i++) {
//			if (human_seat[i] != null) { // 배열의 i번지가 null이 '아니라면'
//				System.out.println("["+i+"번째 탑승자]");
//				System.out.println(human_seat[i].name + " <-이 사람이 타고있음."); // 이름,면허는 default라 .으로 접근
//				System.out.println(human_seat[i].license + " <-이 사람의 면허.");
//				System.out.println(human_seat[i].getMoney() + " <-이 사람의 돈을 가져와라."); // 돈은 private라 get으로 접근
//			}
//
//		}

	}

	public void printhuman() {
		for (int i = 0; i < human_seat.length; i++) {
			System.out.println(human_seat[i]);
		}
	}

	// 메소드 오버로딩 - 메소드의 이름은 같은데 매개변수의 순서나 타입이 다른거

}

