package Test6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 만들때 부터 어노테이션으로 만듬
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnot { // 지금 직접 어노테이션을 간단하게 만듬
	String value();

	int number() default 5;
}
