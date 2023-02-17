package 2-17-FirstTime;

package Pack1;

public class StringEx {
	public static void main(String[] args) {
		String str = "hello my name is hong";

		System.out.println(str.charAt(6));
		// 앞에서부터 h=0번지 e=1번지 ... 해서 6번지는 'm'의 문자가 갖고있다.

		System.out.println(str.equals("hello my name is honk"));
		//

		System.out.println(str.indexOf("hong"));
		// 없는 문자열은 -1 , 있으면 앞에서부터 순서를 세서 보여줌

		System.out.println(str.indexOf('o'));
		// 같은 문자가 있으면 앞에있는 문자를 기준으로 출력함

		System.out.println(str.substring(17));
		// 17번지 인덱스부터 끝까지 잘라냄

		System.out.println(str.substring(6, 13));
		// 6번지 부터 13번지까지 내용을 잘라냄
	}
}
