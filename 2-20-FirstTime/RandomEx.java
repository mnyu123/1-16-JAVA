package Test9;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t = Math.random(); // 0~1 사이의 랜덤값
//		System.out.println("Math클래스의 Random메소드: "+t);

		// java.util 패키지 - Random 메소드
//		Random r1 = new Random(); // 42는 '시드값'
//		Random r2 = new Random(); // 둘이 시드값이 같아 랜덤값이 똑같이 나옴(진짜 랜덤이 아닌 난수표를 기준으로 계산)
//
//		System.out.println("-----r1-----");
//		for (int i = 0; i < 5; i++) {
//			System.out.println(r1.nextInt(20)); // 20까지의 랜덤한 정수숫자 
//		}
//		System.out.println("-----r2-----");
//		for (int i = 0; i < 5; i++) {
//			System.out.println(r2.nextInt(50));
//		}

		// date 클래스보다 'calendar' 클래스 사용을 권장.

		// Arrays 클래스
		String[] arr = { "피곤", "졸림", "잠", "커피" };
//		Arrays.fill(arr, "졸림"); // 배열의 모든 원소를 졸림으로 바꿈
//		Arrays.fill(arr, 1, 3, "수면"); // 1~2 원소를 수면으로 바꿈
		Arrays.sort(arr); // 배열을 오름차순으로 정렬
		for (String i : arr) {
			System.out.println(i + ",");
		}
	}

}
