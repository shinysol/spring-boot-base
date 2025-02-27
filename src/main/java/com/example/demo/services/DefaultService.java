package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class DefaultService {
	public DefaultService() {
		super();
	}

	public String get() {
		return "Hello World!";
	}
}
