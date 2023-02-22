package 2-22-SecondTime;

package Pack3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {
	public static void main(String[] args) {
		Iterator it = null; // Iterator
		List list = new ArrayList();
		Set set = new HashSet();

		for (int i = 0; i <= 5; i++) {
			list.add(i); // ArrayList의 번지를 가지고 접근
			set.add(i);
		}
		System.out.println(list);
		System.out.println(set);

		System.out.println("------------");

		it = list.iterator(); // list객체의 타입이
		// Iterator타입으로 변환되어 반환
		iteratorPrint(it);

		System.out.println("------------");

		it = set.iterator(); // Iterator
		iteratorPrint(it);

		System.out.println("출력후 하나씩 삭제했기 때문에 비어있다.");
		System.out.println(list);
		System.out.println(set);

	}

	static void iteratorPrint(Iterator it) {
		while (it.hasNext()) { // 커서가 가리키는 곳(다음 요소가)에 값이 존재하는지 확인하는 내용
			System.out.println(it.next()); // next는 Iterator의 다음값을 찾는것
			it.remove(); // 요소들을 제거한다.
		}
	}
}


