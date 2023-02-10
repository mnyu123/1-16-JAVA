package 2-8-FirstTime;

package Test1;

public class Human {
//---------------human 클래스의 사람의 정보가 들어가는 내용-----------------
	String name; // 앞에 접근제한자가 없으면 default
	private int money;
	int license;
//-------------------------------------------------------------------

	public static int LICENSE_Type_1 = 1; // 1종 보통
	public static int LICENSE_Type_2 = 2; // 2종 오토
	public static int LICENSE_Type_3 = 3; // 무면허
	// 만약 사용자 입력을 받는다면 해당 글자를 입력중에
	// 띄어쓰기 , 오타 등 문제가 생기는것을 방지하기 위해 static 상수를 사용함

	Human(String name, int license, int money) {
		super();
		this.name = name;
		this.money = money;
		this.license = license;
	}

	// 운전 , 기름넣기 , 돈벌기

	public void Check() {
		int Check_license = 0;
		Check_license = LICENSE_Type_1;

		if (Check_license % 3 == 0) {
			System.out.println("무면허 운전불가");
		} else if (Check_license % 3 == 2) {
			System.out.println("면허확인: " + LICENSE_Type_2);
		} else {
			System.out.println("면허확인: " + LICENSE_Type_1);
		}
	}

	public void drive() {
		Check();
		System.out.println("운전");
	}

	public void addFuel() {
		System.out.println("기름을 넣습니다.");

	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

//	public int addMoney(int money) {
//		int sum = 0;
//		while (true) {
//			money += 1000;
//			sum += 1;
//			if (money == 1000000)
//				break;
//
//		}
//		System.out.println("벌어낸 돈: " + money + " 돈을 번 횟수: " + sum);
//		return money;
//
//	}

}

