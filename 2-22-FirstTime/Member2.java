package 2-22-FirstTime;

package Pack3;

public class Member2 implements Comparable { // 인터페이스 구현
	String name;
	int age;

	Member2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + name + "," + age + ")";
	}

	@Override
	public int compareTo(Object o) { // 비교
		// TODO Auto-generated method stub
		Member2 m = (Member2) o; // 이 문구가 비교하는 내용
		return this.name.compareTo(m.name);
	}

}

