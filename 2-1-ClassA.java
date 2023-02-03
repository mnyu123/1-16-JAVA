package Practice2;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB cb = new ClassB(); // 'default'는 같은 패키지에서는 접근 가능함
		cb.print();
	}

	public void print() {
		System.out.println("여기는 ClassA");
	}

}

class ClassB { // 아무것도 없으면 'default'
	void print() { // 아무것도 없으면 'default'
		System.out.println("여기는 ClassB");
	}
}

