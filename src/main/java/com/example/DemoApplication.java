package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public static Integer additionner(Integer a, Integer b) throws Exception {
		if (a != null && b != null) {
			return a+b;
		}
		throw new Exception();
	}

	public static Integer soustraire(Integer a, Integer b) throws Exception {
		if (a != null && b != null) {
			return a-b;
		}
		throw new Exception();
	}
}
