package Pack6;

import java.util.Arrays;
import java.util.List;

public class Filter { // 데이터의 형태를 바꾼다 -> 스트림
	public static void main(String[] args) {
		List<String> list = Arrays
            .asList("스트림", "필터", "예제코드", "자바7주차", "스트림", "스파게티");

		System.out.println("리스트에서 중복 제거후 출력");
		list.stream().distinct()// <-distinct가 중복제거 함
				.forEach(n -> System.out.println(n));

		System.out.println("");
		System.out.println("스 라고 시작하는 단어로 필터링 하고 출력");

		list.stream().filter(n -> n.startsWith("스"))
            .forEach(n -> System.out.println(n));

		System.out.println("");
		System.out.println("중복을 먼저 제거하고 스 라고 시작하는 단어 출력");

		list.stream().distinct().filter(n -> n.startsWith("스"))
            .forEach(n -> System.out.println(n));
	}
}
