package test;

import java.util.Arrays;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 동적할당 - 런타임 =>배열 , 클래스
		
		int[] arrayint = {1,2,3};
		int[] arrayint2 = null;
		
//		for(int i=0;i<arrayint.length;i++) {
//			System.out.println(arrayint[i]);
//			arrayint2[i]=arrayint[i]; // 반복문을 이용한 배열 복사
//		}
//		System.out.println("-----------배열 복사-------------");
//		for(int i=0;i<arrayint2.length;i++) {
//			System.out.println(arrayint2[i]);
//		}
//		
//		System.out.println("-----------system.arraycopy()메소드를 이용해 복사------------");
//		
//		System.arraycopy(arrayint, 0, arrayint2, 0, arrayint.length);
//		            //   복사할 배열,인덱스 0부터,어느배열에 복사할것인지,인덱스 0부터 복사함, 길이는 얼마나 할것인지
//		
//		for(int i=0;i<arrayint2.length;i++) {
//			System.out.println(arrayint2[i]);
//		}
		
		System.out.println("-------------arrays 클래스를 이용해 복사-----------------");
		
		arrayint2 = Arrays.copyOf(arrayint, arrayint.length);
		                         // 원본    ,  원본의 길이만큼
		                         // int배열을 return
		
		for(int i=0;i<arrayint2.length;i++) {
			System.out.println(arrayint2[i]);
		}
	}

}
