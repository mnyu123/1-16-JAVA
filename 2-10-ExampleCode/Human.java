package test01;
public class Human {
	String name; // default 접근제한자
	int license; // default 접근제한자
	private int money;
	public static int LICENSE_TYPE_0 = 0; // 무면허
	public static int LICENSE_TYPE_1 = 1; // 1종보통
	public static int LICENSE_TYPE_2 = 2; // 2종보통
	public static int LICENSE_TYPE_3 = 3; // 1종대형
	public Human(String name, int license, int money) {
		super();
		this.name = name;
		this.license = license;
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
