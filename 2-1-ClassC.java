// 이것은 다른 패키지에 있는 자바 파일
package test3;
import Practice2.ClassA;
public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ca = new ClassA(); // ClassA는 'public' 접근 제한자이므로 어디든 접근 가능함
		ca.print();
//		ClassB cb = new ClassB(); // ClassB는 'default' 접근 제한자이므로 같은 패키지에서만 접근 가능하므로
		// 해당 내용은 에러가 발생한다.
	}

}

