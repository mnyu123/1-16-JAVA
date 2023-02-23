package Pack4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		// 파일경로 작성 - 하지만 예외처리
		// 왜? 파일이 존재하지 않았을 경우를 생각함
		try {
			Properties pr = new Properties();

			FileInputStream reader = new FileInputStream("D:\\자바\\JavaCode\\src\\Pack4\\config.properties");
			// properties파일 우클릭->properties->location에서 경로 찾아 복사

			pr.load(reader);
			System.out.println(pr);
			System.out.println("이름: " + pr.get("name"));
			// key 와 value 값 구조로 키 name을 불러서 value인 홍길동이 출력됨

			pr.put("subject", "자바");
			pr.store(new FileOutputStream("D:\\자바\\JavaCode\\src\\Pack4\\test.properties"), "#save");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

