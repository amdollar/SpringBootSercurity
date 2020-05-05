package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String home() {
		return ("h1<> Welcome <h1>");
	}
	@GetMapping("/ADMIN")
	public String homeAdmin() {
		return ("h1<> Welcome admin<h1>");
	}
	@GetMapping("/USER")
	public String homeUser() {
		return ("h1<> Welcome user<h1>");
	}
}
