package 2-8-FirstTime;

class CAR {
	private String color; // 색상
	private int Max_Speed; // 최고속도
	private int seat; // 좌석 수
	private boolean Power = false; // 시동 = 기본값(false)
	private int fuel; // 연료
	private String who; // 동승자

	private Human[] human_seat; // 좌석수 관리할 배열
	// 정해져 있는 수의 다수의 데이터 관리 - 배열
	// 유동적인 데이터 관리 - ArrayList

	CAR(String color, int max_Speed, int seat, boolean power, int fuel, String who) {
		super(); // 부모클래스 'Object' 클래스의 기본으로 생성되는 생성자 호출
		this.color = color;
		Max_Speed = max_Speed;
		this.seat = seat;
		Power = power;
		this.fuel = fuel;
		this.who = who;

		this.human_seat = new Human[seat];
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
		this.Power =! this.Power; // Power = false -> not 연산 이후 -> true
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
		seat = 4;
		System.out.println(seat);
		for (int i = 0; i < human_seat.length; i++) {
			System.out.println(human_seat[i]);
		}
	}

}
