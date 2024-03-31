package dev.moshiur.JpaSpringBali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaSpringBaliApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(JpaSpringBaliApplication.class, args);
		MyFirstClass myFirstClass= ctx.getBean(MyFirstClass.class);
		System.out.println(myFirstClass.sayHello());
	}

//	@Bean
//	public MyFirstClass myFirstClass(){
//		return new MyFirstClass();
//	}

}
