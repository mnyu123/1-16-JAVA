package Pack5;

public class LambdaFuncEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterFaceEx ie = (x, y) -> x + y;
		System.out.println(ie.sum(1, 3));
	}

}

interface InterFaceEx {
	public int sum(int x, int y);
}
