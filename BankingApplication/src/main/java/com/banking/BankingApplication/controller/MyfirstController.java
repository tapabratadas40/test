package com.banking.BankingApplication.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.websocket.Decoder.Text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.BankingApplication.service.UserService;

@RestController
public class MyfirstController {
	
	@Autowired
	public UserService service;
	@RequestMapping("/")
	public void myFirstController() {
		System.out.println("akash");
	}
	
	@PostMapping("/file")
	public Map Readfile(@RequestBody Text<String> text) {
		Map<String,String> str = null;
		try {
			 str = service.readText(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
		
	}
	
@PostMapping("/file1")
	public Map Readfile1(@RequestBody Text<String> text) {
		Map<String,String> str = null;
		try {
			 str = service.readText(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
		
	}
	

}
