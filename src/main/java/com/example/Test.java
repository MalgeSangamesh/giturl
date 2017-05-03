package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@RequestMapping("/version")
	public String version(){
		return "Spring boot 1.5.3";
		
	}

}
