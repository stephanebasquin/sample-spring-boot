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
		System.out.println("i:"+i);
		i = 2;
		System.out.println("i:"+i);
		i = 3;
		System.out.println("i:"+i);
		i = 4;
		System.out.println("i:"+i);
		i = 5;
		System.out.println("i:"+i);
		i = 6;
		System.out.println("i:"+i);
		i = 7;
		System.out.println("i:"+i);
		i = 8;
		System.out.println("i:"+i);
		i = 9;
		System.out.println("i:"+i);
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
		System.out.println("i:"+i);
		i = 2;
		System.out.println("i:"+i);
		i = 3;
		System.out.println("i:"+i);
		i = 4;
		System.out.println("i:"+i);
		i = 5;
		System.out.println("i:"+i);
		i = 6;
		System.out.println("i:"+i);
		i = 7;
		System.out.println("i:"+i);
		i = 8;
		System.out.println("i:"+i);
		i = 9;
		System.out.println("i:"+i);
		i = 10;
		System.out.println("i:"+i);
		
		throw new Exception();
	}
}
