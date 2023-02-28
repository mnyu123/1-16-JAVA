package FinalPack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderEx {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("C:/sample.txt");
			br = new BufferedReader(fr);
			String text = null;
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
		} catch (IOException e) {

		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
