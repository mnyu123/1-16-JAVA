package Test9;

public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = "abc";
		String str4 = "abc";
		System.out.println("str1의 hashcode: " + str1.hashCode());
		System.out.println("str2의 hashcode: " + str2.hashCode());
		// ---------- hash코드 값은 같아도 고유한 hashcode값은 다르다.
		System.out.println("str1의 identity-hashcode: " + System.identityHashCode(str1));
		System.out.println("str2의 identity-hashcode: " + System.identityHashCode(str2));
		// ---------- str3와 str4는 new로 새로 객체를 만든것이 아니라서 같은 해쉬코드 값을 가짐
		System.out.println("str3의 identity-hashcode: " + System.identityHashCode(str3));
		System.out.println("str4의 identity-hashcode: " + System.identityHashCode(str4));

		if (str1 == str2) { // 문자열을 비교하는게 아닌 , 참조변수가 가지고있는 객체를 비교하는 것
			System.out.println("str1의 생성된 객체와 str2의 생성된 객체는 같다.");
		} else {
			System.out.println("str1의 생성된 객체와 str2의 생성된 객체는 다르다.");
		}

		if (str1.equals(str2)) { // 문자열을 비교함(내용을 비교한다.)
			System.out.println("str1의 문자열과 str2의 문자열은 같다.");
		} else {
			System.out.println("str1의 문자열과 str2의 문자열은 다르다.");
		}

		if (str1 == str3) { // 문자열을 비교하는게 아닌 , 참조변수가 가지고있는 객체를 비교하는 것
			System.out.println("str1의 생성된 객체와 str3의 생성된 객체는 같다.");
		} else {
			System.out.println("str1의 생성된 객체와 str3의 생성된 객체는 다르다.");
		}

		if (str1.equals(str3)) { // 문자열을 비교함(내용을 비교한다.)
			System.out.println("str1의 문자열과 str3의 문자열은 같다.");
		} else {
			System.out.println("str1의 문자열과 str3의 문자열은 다르다.");
		}

		if (str3 == str4) { // 문자열을 비교하는게 아닌 , 참조변수가 가지고있는 객체를 비교하는 것
			System.out.println("str3의 생성된 객체와 str4의 생성된 객체는 같다.");
		} else {
			System.out.println("str3의 생성된 객체와 str4의 생성된 객체는 다르다.");
		}
	}

}

