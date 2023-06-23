package com.pack.SpringBoot2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String Hello() {
		return "helloworld from controller";
	}
}
