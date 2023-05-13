package com.example.demo.fun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestMapping {
	@GetMapping("/")
	public String helloWordl() {
		return "Hello Worlds";
	}
}
