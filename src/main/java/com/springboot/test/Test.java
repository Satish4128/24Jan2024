package com.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.springboot.controller")
public class Test {

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
		System.out.println("#####Testing Spring Boot Application########");
		

	}

}
