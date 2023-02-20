package Test9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sleep   Sleeeep   Sleeeeeep";

		// String클래스의 "replaceAll"이 정규표현식을 사용가능하다.
		// 정규표현식으로 위의 다른 3글자의 패턴을 전부 치환하다.
		String str2 = str.replaceAll("Sle+ep", "soso");
		// 치환하는 replaceAll은 자주 사용하니 아주 유용
		// 정규표현식
		System.out.println(str2);

		// 정규표현식
//		Pattern p = Pattern.compile("b[a-z]*"); // b는 고정 a~z까지 *은 0번이상 반복
		// b+(a~z)+(a~z)...
//		Matcher m;
//
//		m = p.matcher("bat");
//		System.out.println("bat = " + m.matches());
//
//		m = p.matcher("cat");
//		System.out.println("cat = " + m.matches());
//
//		m = p.matcher("bedd");
//		System.out.println("bedd = " + m.matches());

		// 02|010-\d[0-9]+-[0-9]+ 전화번호 정규 표현식

		Pattern p = Pattern.compile("(02|010)-(\\d[0-9]+)-([0-9]+)");
		Matcher m;

		m = p.matcher("010-5312-1234");
		System.out.println("phone number: " + m.matches());

	}

}

