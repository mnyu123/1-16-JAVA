package 2-22-SecondTime;

package Pack3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		// Enumeration -> 열거형
		Vector v = new Vector();
		for (int i = 1; i < 6; i++) {
			v.add(i);
		}
		// Vector객체에 저장되어 있는 값을 불러오기 위해
		// Enumeration 프레임워크를 사용하여 출력하는 것.

		// 장점 : 메소드 3개로 처리가능 , 모든 프레임워크 구조에 접근가능
		// 단점 : 속도 느림 , 값 추가/삭제 어려움
		Enumeration e = v.elements();
		System.out.println("Enumeration출력");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		Iterator it = v.iterator(); // Vector는 Iterator지원함
		System.out.println("Iterator출력");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 기존의 Iterator , Enumeration 메소드의 단점을 보완한
		// ListIterator 메소드 사용 내용
		ListIterator lit = v.listIterator();
		System.out.println("ListIterator출력");
		while (lit.hasNext()) { // 다음 요소 반복 출력
			System.out.println(lit.next());
		}
		System.out.println("ListIterator 이전 요소 출력");
		lit.add(6);
		while (lit.hasPrevious()) { // 다른점: 이전요소를 출력할 수 있다.
			System.out.println(lit.previous());
		}
	}

}



