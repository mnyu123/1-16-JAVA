package Test6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method method[] = UserClass.class.getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			String methodname = method[i].getName();
			UserAnnot annot = method[i].getAnnotation(UserAnnot.class);

			System.out.println(methodname + " 의 어노테이션");
			System.out.println("value: " + annot.value() + " ");
			System.out.println("number: " + annot.number() + " ");
			System.out.println();

			try {
				method[i].invoke(new UserClass(), null);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 메소드 실행
		}
	}

}
