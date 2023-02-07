public class 1-29-example1 {
    package Prac2;
//--------------챕터5 연습문제--------------------
public class Chapter5_practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//--------------연습문제 1번--------------------
		int sum = 0;

		for (int i = 1; i < 101; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println("5의 배수의 합계는 " + sum);
//-------------------------------------------
		
//--------------연습문제 2번--------------------
		int evensum = 0;
		int oddsum = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2 == 1) {
				evensum += i;
			}
			else if(i%2 == 0) {
				oddsum += i;
			}
		}
		
		System.out.println("짝수의 합계는 :"+oddsum);
		System.out.println("홀수의 합계는 :"+evensum);
//-------------------------------------------
		
//--------------연습문제 3번--------------------
for (int x = 1; x <= 6; x++) {
	for (int y = 1; y <= 6; y++) {
		if (x + y == 6) {
			System.out.println("주사위의 합이 6이 되는 경우의 수: " + x + "," + y + " 주사위의 합: " + (x + y));
		}
	}
}
//-------------------------------------------

//--------------연습문제 4번--------------------
for (int i = 1; i <= 5; i++) {
	for (int j = 0; j < i; j++) {
		System.out.print("*");
	}
	System.out.println(" ");
}
//-------------------------------------------

//--------------연습문제 5번--------------------

for (int i = 5; i > 0; i--) {
	for (int j = 0; j < i; j++) {
		System.out.print("*");
	}
	System.out.println(" ");
}
//--------------연습문제 6번--------------------	
for(int i = 1; i <=5; i++) {
	for(int j = 1; j <= 5-i; j ++) {
		System.out.print(" "); // 공백
	}
	for(int k = 1; k <= (i*2)-1; k++) {
		System.out.print("*"); // 별
	} // 별찍을때는 ln붙여서 쓰지말자. 개행되서 별 모양 안보임
	System.out.println(" ");
}
//-------------------------------------------

//--------------연습문제 7번--------------------
int sum = 0;

//		int dice = (int) (Math.random() * 6) + 1; // 1~6의 랜덤한 숫자 발생

		// System.out.println(dice); // 숫자 나오는지 테스트

		while (true) {
			int dice = (int) (Math.random() * 6) + 1; // 1~6의 랜덤한 숫자 발생
			sum += 1;

			System.out.println("주사위 결과 : " + dice);
			System.out.println("총 주사위 굴린 횟수는 : " + sum + "회");
			if (dice == 6) {
				break;
			}
		}
//-------------------------------------------
	}

}

}
