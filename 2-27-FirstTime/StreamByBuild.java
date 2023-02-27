package Pack6;

import java.util.stream.Stream;

public class StreamByBuilder {

	public static void main(String[] args) {
		Stream stream = Stream.builder() // build로 객체 생성함
				.add("스트림")
				.add("빌더")
				.add("연습")
				.add("예제코드")
				.build();

		// 람다식 구조
		stream.forEach(s -> System.out.println(s));
		
		Stream<String> stream2 = // 해당 문자열을 10번 반복하라
				Stream.generate(()->"7주 예제").limit(10);
		
		// 반복한 결과 출력
		stream2.forEach(s -> System.out.println(s));
		
		Stream<Integer> stream3 = // 0부터 2씩 증가하면서 10번 반복하라
				Stream.iterate(0, n->n+2).limit(10);
		
		// 반복한 결과 출력
		stream3.forEach(s -> System.out.println(s));

	}

}
