package 2-22-FirstTime;

package Pack3;

import java.util.Comparator;

public class AgeDesc implements Comparator { // 인터페이스 구현

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Member2 m1 = (Member2) o1;
		Member2 m2 = (Member2) o2;
		return m2.age - m1.age; // 높은순 -> 낮은순 정렬
//		return m1.age - m2.age; // 낮은순 -> 높은순 정렬
	}

}
