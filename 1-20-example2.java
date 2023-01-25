package test;

import java.util.Scanner;

public class 가위바위보게임 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		
		Scanner scan = new Scanner(System.in); // 사람의 키보드 입력
		System.out.println("가위는 2 바위는 1 보는 3을 입력하세요: ");
		int human = scan.nextInt(); // 사람의 1,2,3 입력
		
		int Com = (int) (Math.random()*3)+1; // 1부터 3까지의 컴퓨터 선택 
		
//		System.out.println(Com); // 컴퓨터 선택 테스트
		
//		System.out.println("가위는 2 바위는 1 보는 3을 입력하세요: ");
	
		if(human<4 && human>0) {
			if(human==1 && Com==2 || human==2 && Com==3 || human==3 && Com==1) {
				System.out.println("사람 승");
			}
			else if(human==1 && Com==3 || human==2 && Com==1 || human==3 && Com==2) {
				System.out.println("컴퓨터 승");
			}
			else {
				System.out.println("비겼습니다.");
			}
		}
	}
}
