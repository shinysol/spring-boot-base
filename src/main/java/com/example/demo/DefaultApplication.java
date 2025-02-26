package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DefaultApplication {
	public DefaultApplication() {
		super();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DefaultApplication.class, args);
	}

}
