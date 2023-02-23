package Pack4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericEx {

	public static void main(String[] args) {
		// 제네릭 예시
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> hm = new HashMap<String,Object>();
		        // 아무타입이나 들어올수있음
		
		hm.put("name", "조영재");
		hm.put("ID", "JOE");
		hm.put("age", 25);
		list.add(hm);
		
		hm = new HashMap<String,Object>();
		
		hm.put("name", "룸메");
		hm.put("ID", "Fail");
		hm.put("age", 20);
		list.add(hm);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).get("name"));
			System.out.println(list.get(i).get("ID"));
			System.out.println(list.get(i).get("age"));
		}
	}

}
