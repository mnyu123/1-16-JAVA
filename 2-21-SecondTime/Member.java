package 2-21-SecondTime;
package Pack2;

public class Member {
	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + name + "," + age + ")";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) // obj클래스가 Member클래스에 있냐 하면
		{
			Member m = (Member) obj; // Member클래스로 형 변환 하라
			return this.name.equals(m.name) && this.age == m.age;
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() { // 해쉬코드 재정의
		// TODO Auto-generated method stub
		return this.name.hashCode() + this.age; // member의 구조물을 가지고 해쉬코드를 만들어라.
		// 중복을 허용하지 않게 바뀐다.
		// 왜 hash코드로만 중복을 제거 가능한가?
		// member 클래스는 자바에 미리 정의된게 아니고 내가 직접 만든 클래스이므로
		// 자바가 member 구조를 모르기 때문에 알려주기 위해 재정의 해서 사용한다.
	}

}

