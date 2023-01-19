public class 1-19_First {
    int a = 20;
		System.out.println("a value:" + a);
		double b = 2.714;
		System.out.println("b value:" + b);
		
		String str = "10";
		System.out.println(a+Integer.parseInt(str));
		
		String d = a+""; // 정수형인 a를 문자열로 명시적 형 변환
		System.out.println(a+d);
		
		String e = String.valueOf(a);
		System.out.println("String Class Result:"+(e+d));

        // -----------제어문-----------------------

		int a = 10;

		if(33 > -1 && 33 < a) { // 첫번째 조건문은 꼭 실행되어야 함
			System.out.println("False");
		}
		else if(a<10) { // 선택사항 
			System.out.println("True");
		}
		else { // 선택사항 2
			System.out.println("why");
		}
		
		System.out.println("other");
        // 조건문을 10번이상 보통 사용하지 않음

        Scanner sc = new Scanner(System.in);
		
		System.out.println("몇월인가요:");
		int month = sc.nextInt();

		switch (month) {
		case 1:
			System.out.println("1월");
			break;
		case 2:
			System.out.println("2월");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("augest");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("december");
			break;

		default:
			System.out.println("kidding me?");

		}

		System.out.println("몇월 인가요:");
		int Month = sc.nextInt();
		

		switch (Month) {
		case 1:case 2:case 12:
			System.out.println("winter");
			break;
		case 3:case 4:case 5:
			System.out.println("spring");
			break;
		case 6:case 7:case 8:
			System.out.println("summer");
			break;
		case 9:case 10:case 11:
			System.out.println("fall");
			break;
		
		default:
			System.out.println("not season");
		}

        Scanner sc = new Scanner(System.in);
		int i = 10;
		int sum = 0;
		
		do {
			System.out.println("누적해서 더할 값 입력 0을 더하면 프로그램 종료");
			i = sc.nextInt();
			sum += i ;
			
		}while(i != 0); { // 0을 입력받으면 True가 되어 반복문 실행
			System.out.println("누적 합:"+sum);
		}
		sc.close(); // scanner를 종료하는 내용 없어도 됨
}
