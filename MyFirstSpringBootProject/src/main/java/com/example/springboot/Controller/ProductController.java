package com.example.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@RequestMapping("/")
	@ResponseBody
	public String newProduct() {
		
		System.out.println("akakaka");
		return "New product";
	}

}
