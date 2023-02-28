package FinalPack;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis 
				= new FileInputStream("C:/sample.txt");
			// byte단위로만 읽어온다.
			int data = 0;
			int count = 0;
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
				count++;
			}
			System.out.println("버퍼 카운트: " + count);
		} catch (Exception e) {

		}

	}

}
