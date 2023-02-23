package Pack4;

public class GenericEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen3 g3 = new Gen3();
		       //? ~~ 내용으로 제한을 건다
		Generic5<? super Gen2> g2 = new Generic5<Gen1>(g3);
		        //Gen2의 부모까지 참조가능하다-> Gen1 |T에 입력됨
		Gen1 t2 = (Gen3) g2.getObj();
		Object t1 = g2.getObj();

		System.out.println(t2.name);
		System.out.println(t2.getName());

		Generic5<? extends Gen2> g4 = new Generic5<Gen3>(g3);
		Gen2 t3 = g4.getObj();
		Gen3 t4 = (Gen3) g4.getObj();

		Generic5<?> g6 = new Generic5<Gen3>(g3);
		Object t5 = g6.getObj();
		Gen3 t6 = (Gen3) g6.getObj();

		      //그냥 "?"면 모두 참조 가능하다고 표현한것
		Generic5<?> g7 = new Generic5<Integer>(1);
		System.out.println(g7.getObj());
	}

}

class Gen1 {
	String name = "Gen1";

	public String getName() {
		return name;
	}

}

class Gen2 extends Gen1 {
	String name = "Gen2";

	public String getName() {
		return name;
	}

}

class Gen3 extends Gen2 {
	String name = "Gen3";

	public String getName() {
		return name;
	}

}
            //Gen1이 들어가게 됨
class Generic5<T> { // 클래스를 만드는데 <T>(타입)변수가 선언됨
	T obj; // 현재 T에 String이 들어간다면 다 String타입이 
		  // 밑에 메소드에 전부 입력되고 , Integer타입이면 Integer타입이 전부 입력됨
		  // 즉 , 어떤 자료형이든 받아들일 수 있음(형 변환 없이)

	Generic5(T obj) {
		     //g3 입력
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}

