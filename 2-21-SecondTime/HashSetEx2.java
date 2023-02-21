package 2-21-SecondTime;

package Pack2;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();

		set.add(new String("abc"));
		set.add(new String("abc"));

		set.add(new Member("멤버", 25));
		set.add(new Member("멤버", 25));

		System.out.println(set);
	}

}

