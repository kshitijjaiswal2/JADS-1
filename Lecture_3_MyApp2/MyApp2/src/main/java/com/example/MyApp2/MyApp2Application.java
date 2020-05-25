package com.example.MyApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class MyApp2Application {

	public static void main(String[] args) {

		SpringApplication.run(MyApp2Application.class, args);
	}

}
