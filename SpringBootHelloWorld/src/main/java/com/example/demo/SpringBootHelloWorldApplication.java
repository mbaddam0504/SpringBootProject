package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		System.out.println(" Executing my first Springboot application");
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

}
