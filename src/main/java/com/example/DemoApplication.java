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
		
		// Test de code dupliqué
		Integer i = 0;
		i = 1;
		i = 2;
		i = 3;
		i = 4;
		i = 5;
		i = 6;
		i = 7;
		i = 8;
		i = 9;
		i = 10;
		i = 1;
		i = 2;
		i = 3;
		i = 4;
		i = 5;
		i = 6;
		i = 7;
		i = 8;
		i = 9;
		i = 10;
		System.out.println("i:"+i);
		
		throw new Exception();
	}

	public static Integer multiplier(Integer a, Integer b) throws Exception {
		if (a != null && b != null) {
			return a*b;
		}
		
		// Test de code dupliqué
		Integer i = 0;
		i = 1;
		i = 2;
		i = 3;
		i = 4;
		i = 5;
		i = 6;
		i = 7;
		i = 8;
		i = 9;
		i = 10;
		i = 1;
		i = 2;
		i = 3;
		i = 4;
		i = 5;
		i = 6;
		i = 7;
		i = 8;
		i = 9;
		i = 10;
		System.out.println("i:"+i);
		
		throw new Exception();
	}
}
