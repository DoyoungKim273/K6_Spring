package edu.pnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.pnu", "com.ruby"})
public class Mission3Application {

	public static void main(String[] args) {
		SpringApplication.run(Mission3Application.class, args);
	}

}
