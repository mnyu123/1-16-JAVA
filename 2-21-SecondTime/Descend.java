package 2-21-SecondTime;

package Pack2;

import java.util.Comparator;

public class Descend implements Comparator {

	@Override
	public int compare(Object o1, Object o2) { // 객체의 비교 - compare
		// TODO Auto-generated method stub
//		Comparable<T> // <T>이 제네릭을 안쓰겠다 = 모든 타입을 받아들이겠다.
		Comparable c1 = (Comparable) o1; // 무엇을 기준으로 정할것인지 정하는 내용들
		Comparable c2 = (Comparable) o2;
		return c1.compareTo(c2) * (-1); // 역순으로 정렬한다.
	}

}

