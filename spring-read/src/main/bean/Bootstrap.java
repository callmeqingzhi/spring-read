package bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		System.out.println("hello");

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(applicationContext.getBean("u"));
	}
}
