package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general")
public class GenericController {
	
	
	@GetMapping
	public String fetchData() {
		return "Hello World";
	}
	

}
