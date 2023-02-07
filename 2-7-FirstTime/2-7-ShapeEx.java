package Practice5;

public class ShapeEx {
	public static void main(String[] args) {
		Shape[] sh = new Shape[2]; // 얘는 Shape '타입'의 객체를 갖고있을 "배열"을 생성하는 것이므로 정상 작동
//		Shape ss = new Shape(); // 추상 클래스는 미완성된 클래스 , 그래서 인스턴스 생성을 하면 에러
		sh[0] = new Circle(10);
		sh[1] = new Rectangle(5, 10);

		for (Shape s : sh) { // 개선된 for문 , 단점은 배열의 주소를 모른다
			System.out.println(s); // toString()에 의해 실행
			System.out.println("넓이: " + s.area() + " 둘레: " + s.length());
		}
	}
}
