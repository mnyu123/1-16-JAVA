package Test9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "휴대폰 번호:010-1342-1234" + "집 전화 번호:02-123-1231" + "이메일 주소:Test@gmail.com 계좌번호: 123412-12-532312";
		String tpattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		String epattern = "(\\w+)@(\\w+).(\\w+)";
		String spattern = "(\\d{6})-(\\d{2})-(\\d{6})";

		Pattern p = Pattern.compile(tpattern);
		Matcher m = p.matcher(source);

		System.out.println("전화번호: ");
		while (m.find()) { // 지정된 패턴에 맞는 문자열 검색
			System.out.println(m.group() + ":" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}

		p = Pattern.compile(epattern);
		m = p.matcher(source);
		System.out.println("이메일: ");
		while (m.find()) { // 지정된 패턴에 맞는 문자열 검색
			System.out.println(m.group() + ":" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}

		p = Pattern.compile(spattern);
		m = p.matcher(source);
		System.out.println("계좌번호: ");
		while (m.find()) { // 지정된 패턴에 맞는 문자열 검색
			System.out.println(m.group() + ":" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
	}

}
