package Test;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal eagle = new Eagle();

		eagle.sleep();
//		eagle.eat(); // 인터페이스에 없는 메소드라 에러가 남

		// eat 메소드를 쓰려면 어떻게 해야하나? -> 강제 형 변환(Eagle 타입으로 <-왜? Eagle클래스에 eat메소드가 있음)

		// 강제 형 변환
		Eagle eaObj = (Eagle) eagle;

		eaObj.eat(); // eat메소드 사용가능함
	}

}
