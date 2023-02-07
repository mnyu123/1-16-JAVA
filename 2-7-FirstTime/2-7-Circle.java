package Practice5;

public class Circle extends Shape {
	int r;

	Circle(int r) {
		super("원");
		this.r = r;
	}

	@Override // 직접 작성하지 말고 source에서 자동 생성하라.(오타 문제)
	double area() { // 이 미완성된 추상메소드 area를 완성시켜야 할 의무가 있다.
		// TODO Auto-generated method stub
		return r * r * Math.PI;
	}

	@Override
	double length() { // 이 미완성된 추상메소드 length를 완성시켜야 할 의무가 있다.
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}

	@Override
	public String toString() { // 필수 아님 따로 그냥 생성한거임
		// TODO Auto-generated method stub
		return "Shape [type=" + type + ", r=" + r + "]";
	}

}

