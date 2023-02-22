package Pack3;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet(); // 이름 순 정렬됨

		set.add(new Member2("조씨", 50));
		set.add(new Member2("이씨", 35));
		set.add(new Member2("박씨", 66));
		System.out.println("이름 순(가나다 순) 정렬");
		System.out.println(set);

		TreeSet set2 = new TreeSet(new Comparator() {
			// 나이 오름차순으로 출력하게 함
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Member2 m1 = (Member2) o1;
				Member2 m2 = (Member2) o2;
				return m1.age - m2.age;
			}

		});

		set2.add(new Member2("조씨", 50));
		set2.add(new Member2("이씨", 35));
		set2.add(new Member2("박씨", 66));
		System.out.println("나이를 오름차순(낮은순->높은순)으로 출력");
		System.out.println(set2);

		// 이름을 내림차순으로 정렬함
		TreeSet set3 = new TreeSet(new NameDesc()); // 인터페이스를 구현한 클래스
		set3.add(new Member2("조씨", 50));
		set3.add(new Member2("이씨", 35));
		set3.add(new Member2("박씨", 66));
		System.out.println("이름을 내림차순(하~가)으로 정렬");
		System.out.println(set3);

		// 나이를 내림차순으로 정렬
		TreeSet set4 = new TreeSet(new AgeDesc()); // 인터페이스를 구현한 클래스
		set4.add(new Member2("조씨", 50));
		set4.add(new Member2("이씨", 35));
		set4.add(new Member2("박씨", 66));
		System.out.println("나이를 내림차순(높은순->낮은순)으로 정렬");
		System.out.println(set4);
	}

}
