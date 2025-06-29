package com.example.springboot.first_rest_api.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public List<String> getMap(){
		//Arrays.asList("akashd","sj");
		return Arrays.asList("akashd","sj");
	}
}
