package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	String[] urls = {"localhost:8080/hello","localhost:8080/bye"};
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Demo App");
		
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String greet() {
		return "Welcome to Spring Project done by Shrikant !";
		
	}
}
