package Test2;

public class Wizard extends Character {
	int heal;

	public void healing(Object target) { // Object class명 -> 자바에 존재하는 모든 클래스를 받겠다
		System.out.println("치료");
	}

	@Override
	public void attack(Object target) {
		// TODO Auto-generated method stub
		// 마법사만 오버라이딩 하면 마법사만 '마법공격'이 출력됨
		System.out.println("마법공격");
	}
	
	
}
