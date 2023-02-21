package Pack2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); // Arraylist 생성
		LinkedList list2 = new LinkedList(); // 연결리스트 생성
		for (int i = 0; i < 100000; i++) { // 10만개의 데이터를 넣고 가져오는데
			// 누가 더 빠른 자료구조 인가? 체크
			list.add(i); // Arraylist에 데이터 넣기
			list2.add(i); // 연결리스트에 데이터 넣기
		}
		System.out.println("ArrayList Access");
		long start = System.currentTimeMillis(); // 시스템 시간체크
		for (int i = 0; i < 10000; i++) {
//			list.get(i); // Arraylist 데이터 가져오기

			// 중간에 추가한다면?
			list.add(500, i); // 500번지에 i를 추가한다면
			// 연속적인 데이터 구조
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		System.out.println("LinkedList Access");
		long start2 = System.currentTimeMillis(); // 시스템 시간체크
		for (int i = 0; i < 10000; i++) {
//			list2.get(i); // Arraylist 데이터 가져오기

			// 중간에 추가한다면?
			list2.add(500, i); // 500번지에 i를 추가한다면
			// 비 연속적인 데이터구조
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - start2);
	}

}

