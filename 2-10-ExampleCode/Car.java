package test01;
public class Car{
	// 필드 (인스턴스 변수)
	private boolean power; // 전원. boolean타입은 기본값이 false
	private int seat;  // 좌석수
	private String color; // 색상
	private int speed;	// 최고속도
	private Human[] human;  // 탑승자
	private int hcnt;		// 탑승자 수
	public Car(int seat, String color, int speed) {
		super(); // 부모클래스의 기본생성자 호출(무조건 첫번째줄)
		this.seat = seat;
		this.color = color;
		this.speed = speed;
		this.human = new Human[seat];
	}
	public void power() {
		this.power = !this.power;  // 참은 거짓으로, 거짓은 참으로
	}
	public void go() {
		if(!power) {  // 시동이 꺼져있는 경우
			System.out.println("시동이 꺼져있습니다.");
			return;
		}
		System.out.println("전진하다.");
	}
	public void back() {
		if(!power) {  // 시동이 꺼져있는 경우
			System.out.println("시동이 꺼져있습니다.");
			return;
		}
		System.out.println("후진하다.");
	}
	/**
	 * 자동차에 사람 탑승
	 * @param h 사람
	 * @param n 좌석번호
	 * @return 탑승자 수
	 */
	public int addHuman(Human h, int n) {
		if(human[n] == null) {
			human[n] = h;
			hcnt++;
		}
		return hcnt;
	}
	/**
	 * 자동차에 사람 탑승 (여러명)
	 * @param h 사람 배열
	 * @param n 시작 좌석번호
	 * @return 탑승자 수
	 */
	public int addHuman(Human[] h, int n) {
		for(int i=n, j=0; i<h.length+n; i++, j++) {
			if(human[i] == null) {
				human[i] = h[j];
				hcnt++;
			}
		}
		return hcnt;
	}
	public void printCarInfo() {
		System.out.println("---자동차 정보---");
		System.out.println("전원 : "+power);
		System.out.println("좌석수 : "+seat);
		System.out.println("색상 : "+color);
		System.out.println("최고속도 : "+speed);
		System.out.println("탑승자 수 : "+hcnt);
		//try {
			for(int i=0; i<human.length; i++) {
				if(human[i] != null) {
					System.out.println("["+i+"번째 탑승자]");
					System.out.println(human[i].name); // default여서 .으로 바로 접근
					System.out.println(human[i].license);
					System.out.println(human[i].getMoney());// private이여서 별도의 메소드로 접근
				}
			}
		//}catch(NullPointerException e) { 
			// 에러 발생시 대응할 것..
		//}
	}
}






