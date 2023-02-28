package FinalPack;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamEx2 {

	public static void main(String[] args) {
		try {
			// buffer,reader가 사람이 쓰기 쉬운 형태
			Reader in 
				= new InputStreamReader(System.in); // 키보드 입력
			int data = 0;
			int count = 0;
			while ((data = in.read()) != -1) { // 계속 반복을 돌면서 입력을 받는다.
				System.out.print((char) data); // 입력한 것을 출력하게 함
				count++;
			} // ctrl+z를 누르면 키보드 입력 중지
				// 입력한 내용 개행되는거 ln지워야 함
			System.out.println("버퍼: " + count);
		} catch (IOException e) {

		}

	}

}

