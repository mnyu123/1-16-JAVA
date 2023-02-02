package test3;

public class SingleTonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingleTon s = new SingleTon(); // 에러

		SingleTon s1 = SingleTon.getInstance(); // static이 있기 때문에 new가 없어도 바로 접근 가능
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();

		System.out.println("---");
	}

}
