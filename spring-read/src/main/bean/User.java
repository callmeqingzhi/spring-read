package bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("u")
public class User {
	@PostConstruct
	public void a(){

		System.out.println("after user construct");
	}
	public User() {
		System.out.println("user init");
	}
}
