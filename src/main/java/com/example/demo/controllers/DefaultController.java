package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.DefaultService;

@RestController
public class DefaultController {
	private DefaultService defaultService;
	@GetMapping(path = "/")
	public String get() {
		return this.defaultService.get();
	}

	public DefaultController(DefaultService defaultService) {
		this.defaultService = defaultService;
	}
}
