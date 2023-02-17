package 2-17-SecondTime;

package Pack1;

public class StringEx2 {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "abcd";
		System.out.println("str1 = " + System.identityHashCode(str1));
		System.out.println("str2 = " + System.identityHashCode(str2));
		// identity해쉬코드는 같다.

		str1 = str1 + "efg";
		// 그냥 더하기 연산을 하게되면 '다른 객체'가 되어버린다.
		System.out.println("str1 = " + System.identityHashCode(str1));
		// str1이 변경되어 hashcode가 변경된것을 확인.

//		StringBuffer sb1 = new StringBuffer("abcd");
		StringBuffer sb1 = new StringBuffer(str1);
		System.out.println("문자열 연결 전 sb1의 고유 hashcode : " + System.identityHashCode(sb1));
		sb1.append("efgh"); // 문자열 연결 메소드 -> append

		System.out.println("문자열 연결 후 sb1의 고유 hashcode : " + System.identityHashCode(sb1));
		// 결과를 보듯이 내부적으로 관리가 되어 '같은 객체'인것을 확인할 수 있다.
		System.out.println(sb1.toString().equals("abcdefgh"));
		// 문자열이 내용이 긴데 자주 변경한다면 StringBuffer'클래스' 로 바꾸는것이 좋다.

//		String         :  문자열 연산이 '적고' '멀티쓰레드 환경'일 경우
//		StringBuffer   :  문자열 연산이 '많고' '멀티쓰레드 환경'일 경우
//		StringBuilder  :  문자열 연산이 '많고' '단일쓰레드'이거나 '동기화를 고려하지 않아도 되는' 경우  

		// 백만번 String연산을 실행하는 경우 "StringBuilder"가 유리하다.
	}
}


