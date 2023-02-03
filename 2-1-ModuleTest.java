// Module-info.java에 requires를 통해 이미 프로젝트가 import 되어있음을 가정.
package Practice2;

import Second_JAVA_Project_2_1.NewMember; // 2번째 프로젝트의 클래스가 import

public class ModuleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewMember n = new NewMember();
		n.test();
	}

}
