package Pack4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();

		String[] names = { "자바", "파이썬", "스프링", "리액트", "자바" };
		int[] nums = { 11, 22, 33, 44, 55 };

		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
			           // 키 , 값(value) 입력
		}

		Set entry = map.entrySet(); // map에 있는걸 "Set"형태로 만들어 주는것

		for (Object o : entry) {
			Map.Entry m = (Map.Entry) o;
			System.out.println("key: " + m.getKey() + "  value: " + m.getValue());
		}
		System.out.println(map.get("파이썬")); // "파이썬"의 키값을 얻을때(활용)

		Set<String> keys = map.keySet(); // "키"들의 집합을 모아놓는것.
		System.out.println(keys); // map형태로 키들의 집합이 출력된다.
		System.out.println(map.values()); // 값들만 출력한다.

		for (String key : (Set<String>) map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		// key|value 장점: 탐색이 빠르다.
	}

}
