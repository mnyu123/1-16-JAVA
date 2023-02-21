package 2-21-SecondTime;

package Pack2;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] arr = { "배열", "연결리스트", "hashset", 1, 2, "3", "c" };
		Set set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		// hashset은 순서를 보장하지 않음
	}

}

