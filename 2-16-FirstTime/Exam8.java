package Test8;

import java.util.Scanner;

//import javax.security.auth.login.LoginException; // 자바에서 기본으로 제공해주는 예외처리

public class Exam8 {

	static String user_id = "mnyu";
	static String user_pw = "mnyu123";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Scanner scan = null;
		try (Scanner scan = new Scanner(System.in);) { // Try 실행하다 오류가 나면 자동으로 scan.close -> 자원 절약
//			scan = new Scanner(System.in);
			System.out.print("아이디: ");
			String input_id = scan.nextLine();

			System.out.print("비밀번호: ");
			String input_pw = scan.nextLine();

//			scan.close();

			if (!user_id.equals(input_id)) {
				throw new LoginException("아이디가 올바르지 않습니다.");
			} else if (!user_pw.equals(input_pw)) {
				throw new LoginException("비밀번호가 올바르지 않습니다.");
			} else {
				System.out.println("로그인 성공");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
//			scan.close(); // 안뜸 왜?-> scan이 지역변수임
		}

	}

}
