package 2-21-SecondTime;

package Pack2;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet set = new TreeSet();
		String from = "bat";
		String to = "d";

		set.add("ant");
		set.add("alias");
		set.add("batman");
		set.add("aha");
		set.add("cola");
		set.add("Cola");
		set.add("ddr");
		set.add("dance");
		set.add("dEEE");
		set.add("deee");
		set.add("ever");
		set.add("giant");
		set.add("zoo");

		System.out.println(set);
		System.out.println("from: " + from + ",to: " + to);
		// 전체로부터 일부만 출력하도록 범위를 지정할 수 있으며 
		System.out.println(set.subSet(from, to)); // from부터 to로
		System.out.println("from: " + from + ",to: " + to + "zzzz");

		System.out.println(set.subSet(from, to + "zzzz"));

		// 내림차순 정렬
		set = new TreeSet(new Descend());

		set.add("ant");
		set.add("alias");
		set.add("batman");
		set.add("aha");
		set.add("cola");
		set.add("Cola");
		set.add("ddr");
		set.add("dance");
		set.add("dEEE");
		set.add("deee");
		set.add("ever");
		set.add("giant");
		set.add("zoo");

		System.out.println(set);
		System.out.println("from: " + from + ",to: " + to);

		System.out.println(set.subSet(to, from)); // 거꾸로 검색
	}

}

