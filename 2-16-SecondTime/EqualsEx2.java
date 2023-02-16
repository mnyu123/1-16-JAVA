package Test9;

public class EqualsEx2 {

	public static void main(String[] args) {
		Obj obj1 = new Obj(100);
		Obj obj2 = new Obj(100);

		if (obj1.equals(obj2)) {
			System.out.println("obj1의 생성된 객체와 obj2의 생성된 객체는 같다.");
		} else {
			System.out.println("obj1의 생성된 객체와 obj2의 생성된 객체는 다르다.");
		}

		Obj obj3 = obj1; // obj1이 가리키고 있는 객체를 obj3에도 같이 줌

		if (obj1.equals(obj3)) { // 같은 객체를 가리키고 있으니 당연히 true값이 나옴
			System.out.println("obj1의 생성된 객체와 obj3의 생성된 객체는 같다.");
		} else {
			System.out.println("obj1의 생성된 객체와 obj3의 생성된 객체는 다르다.");
		}

		ObjOverrid objo1 = new ObjOverrid(100);
		ObjOverrid objo2 = new ObjOverrid(100);

		if (objo1.equals(objo2)) {
			System.out.println("objo1의 생성된 객체와 objo2의 생성된 객체는 같다.");
		} else {
			System.out.println("objo1의 생성된 객체와 objo2의 생성된 객체는 다르다.");
		}
	}
}

class Obj {
	int obj_var;

	Obj(int obj_var) {
		this.obj_var = obj_var;
	}

}

class ObjOverrid {
	int obj_var;

	ObjOverrid(int obj_var) {
		this.obj_var = obj_var;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ObjOverrid) { // 두 객체가 같은 인스턴스면 true
			return true;
		} else {
			return false;
		}
	}
}
