package test;
import java.util.Scanner;
public class Rps_For_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// 배열을 이용한 가위바위보 게임
		String[][] game = {
				{"무승부","컴퓨터승","사람승"},
				{"사람승","무승부","컴퓨터승"},
				{"컴퓨터승","사람승","무승부"}
		};
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = {"가위","바위","보"}; // name[0] = "가위"
		
		System.out.print("사람의 입력 : ");
		
		int human = scan.nextInt();
		
		int com = (int) (Math.random()*3); // 0~2 의 랜덤숫자 발생
		
		System.out.println("키보드 입력 확인 : "+name[human]);
		System.out.println("컴퓨터 랜덤 확인 : "+name[com]);
		
		
		if(human>-1 && human<3) {
			System.out.println("결과 : "+game[human][com]+"입니다.");
		}
		else
		{
			System.out.println("가위,바위,보 중 하나를 입력하십시오.");
		}
	}

}