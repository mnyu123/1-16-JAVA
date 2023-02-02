package Practice2;

import java.util.ArrayList;

public class TestArr {
	public static void main(String[] args) {
		// TestMember의 이름을 쓴다
		ArrayList<TestMember> list = new ArrayList<TestMember>();
		// 컬렉션 프레임워크 'ArrayList' 사용(13장)
		list.add(new TestMember("테스트4", "NewTest4", 30)); // 여기에는 '멤버 객체'를 넣는다.
		list.add(new TestMember("테스트5", "NewTest5", 35));
		list.add(new TestMember("테스트6", "NewTest6", 41));
		// list.add(null); // 에러 발생

		for (int i = 0; i < list.size(); i++) { // 리스트에서는 length->size가 있다.
			System.out.println("이름 출력: " + list.get(i).getName());
			System.out.println("아이디 출력: " + list.get(i).getId());
			System.out.println("나이 출력: " + list.get(i).getAge());
		}
	}
}
