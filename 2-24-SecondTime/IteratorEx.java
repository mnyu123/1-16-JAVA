package Pack5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(new String[] 
				{ "제네릭", "람다식", "스트림", "자바" });

		System.out.println("-----for문 이용-----");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("-----외부 반복자 이용-----");
		Iterator<String> it = list.iterator(); // 외부 반복자인 Iterator 를 이용해 출력
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// 내부의 자료구조(List등...)를 스트림화 시킨다.
		System.out.println("-----내부 반복자 이용-----");
		list.stream().forEach(s -> System.out.println(s)); // 1줄로 끝난다.
							//s가 list에 있는 한개씩의 요소들
		System.out.println("------------------");
	}

}

