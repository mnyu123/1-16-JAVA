package FinalPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnectionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url = null;
		String address = "https://www.google.co.kr/";
		BufferedReader br = null;
		String readline = "";
		try {
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			while ((readline = br.readLine()) != null) {
				System.out.println(readline);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
