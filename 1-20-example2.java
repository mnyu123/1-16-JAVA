public class 1-20-example2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		char R = 'r';  //바위
		char S = 's';  //가위
		char P = 'p';  //보
		
		Scanner scan = new Scanner(System.in); // 사람의 키보드 입력
		
		int human = scan.nextInt(); // 사람의 1,2,3 입력
		
		int Com = (int) (Math.random()*3)+1; // 1부터 3까지의 컴퓨터 선택 
		
//		System.out.println(Com); // 컴퓨터 선택 테스트
		
		System.out.println("가위는 2 바위는 1 보는 3을 입력하세요: ");
		
		if(human == Com) {
			System.out.println("비겼습니다.");
		}
}
