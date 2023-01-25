package Practice;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R = 1; // 바위
		int S = 2; // 가위
		int P = 3; // 보

		Scanner scan = new Scanner(System.in); // 사람의 키보드 입력
		System.out.println("가위는 2 바위는 1 보는 3을 입력하세요: ");
		int human = scan.nextInt(); // 사람의 1,2,3 입력

		int Com = (int) (Math.random() * 3) + 1; // 1부터 3까지의 컴퓨터 선택

//		System.out.println(Com); // 컴퓨터 선택 테스트

		

		if (human >= 1 && human <= 3) { // 우선 사람이 1,2,3중 하나를 입력했는지 체크

			if (human == Com) {
				System.out.println("비겼습니다.");
			} else if ((human == R && Com == P) || // 바위<보 사람패배
					(human == S && Com == R) || // 가위<바위 사람패배
					(human == P && Com == S)) // 보<가위 사람패배
			{
				System.out.println("패배하셨습니다.");
			} else if ((human == 1 && Com == 2) || // 바위<보 사람패배
					(human == 2 && Com == 3) || // 가위<바위 사람패배
					(human == 3 && Com == 1)) {
				System.out.println("승리하셨습니다.");
			}
			else {
				System.out.println("이상한걸 입력하셨습니다.");
			}
		}
		
		System.out.println("컴퓨터가 낸것:"+Com);
	}
}