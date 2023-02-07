package Practice5;

public class Rectangle extends Shape {
	int width;
	int height;

	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() { // 메소드 재정의 하지만 추상메소드를 재정의 한것 = implements(강제로 해야함)
		// TODO Auto-generated method stub
		return width * width;
	}

	@Override
	double length() { // 그냥 메소드 오버라이딩과 다른것은 강제로 재정의를 하지않으면 에러
					  // 왜? 
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	@Override
	public String toString() { // 필수X 개인적으로 생성한것
		// TODO Auto-generated method stub
		return "Shape [type=" + type + ", width=" + width + ", height=" + height + "]";
	}

}


