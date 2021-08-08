package com.java.spring.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@GetMapping(value = "/test")
	public String test () {
		return "Hello World! \n 공부시작~~!";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
