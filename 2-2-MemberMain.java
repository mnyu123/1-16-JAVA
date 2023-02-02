package Practice2;

import java.util.Scanner;

public class MemberMain_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMember t = new TestMember("테스트4", "NewTest4", 30);
		System.out.println("참조 변수로 접근: " + t.getName());
		System.out.println("-----------------------------");

		Scanner scan = new Scanner(System.in);

		System.out.print("이름 , id , 나이 입력: ");
		String name = scan.next();
		String id = scan.next();
		int age = scan.nextInt();

		TestMember[] arr = new TestMember[3];
		arr[0] = t; // 객체 참조변수를 배열객체에 넣는다.
		arr[1] = new TestMember(name, id, age); // 별도의 참조변수의 이름이 필요없기 때문에 직접 작성
		arr[2] = new TestMember("테스트6", "NewTest6", 41); // 배열의 arr<- 이 참조 변수로 접근.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getAge());
			System.out.println(arr[i].getId());
			System.out.println(arr[i].getName());
//			System.out.println(arr[i]);
		}
	}

}


