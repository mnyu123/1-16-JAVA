package Pack2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListEx {
	public static void main(String[] args) {
//		List list = new ArrayList();
		List<Integer> list = new ArrayList<Integer>();
		// 이것은 '제네릭'이다.
		// 위의 arraylist는 Integer형으로 되있기 때문에 "3"같은 것에서는 오류가 난다.
		list.add(1);
		list.add(2);
//		list.add("3"); // 타입이 달라도 실행 가능한 이유는 
		// Object클래스 타입으로 관리중 -> 더 높은 자료형이라 모든것을 포괄 가능
//		list.add(4.4);
//		list.add("Five");
		list.add(6);
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));// Object로 리턴함
		}

		// 벡터
		Vector list2 = new Vector();
		list2.add(1.2);
		list2.addElement(3.4);
		for (Object o : list2) {
			System.out.println("Vector: " + o);
		}
	}
}
