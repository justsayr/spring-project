package com.example.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general")
public class GenericController {
	
	
	@GetMapping
	public String fetchData() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$" );
		return "home";
	}
	
	@PostMapping
	public String postData(@RequestBody Map<String, String> reBody) {
		String a = reBody.get("a");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$" + a);
		
		return "received";
		
	}

}
