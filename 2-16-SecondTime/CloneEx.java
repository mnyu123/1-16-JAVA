package Test9;

public class CloneEx {
	public static void main(String[] args) {
		String[] arr = { "자바2", "12장", "기본API" };
		String[] arr2 = arr.clone(); // clone() API 사용
		System.out.println("arr과 arr2 배열(객체)는 같은가?: " + (arr == arr2));
		String[] arr3 = new String[arr.length]; // 아직 배열 초기화 전이라서 전부 null값
		System.out.println("배열 초기화 전 0번지 내용: "+arr3[0]);
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		System.out.println("배열 초기화 후 0번지 내용: "+arr3[0]);
		System.out.println("arr과 arr3 배열(객체)는 같은가?: " + (arr == arr3));
	}
}
