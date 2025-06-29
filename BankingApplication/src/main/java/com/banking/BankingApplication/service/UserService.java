package com.banking.BankingApplication.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.Decoder.Text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.BankingApplication.entity.User;

@Service
public class UserService {
	
	/*
	 * public List<User> getListOfUser() { // TODO Auto-generated method stub
	 * 
	 * return userRepo.findAll(); }
	 * 
	 * public User createUser(User user) { User save = userRepo.save(user); return
	 * save; }
	 */
	
	/*
	 * public User updateUser(Integer id,User user) { User findUser =
	 * userRepo.findById(id); if(findUser!=null) {
	 * findUser.setEmail(user.getEmail());
	 * findUser.setFirstName(user.getFirstName());
	 * findUser.setLastName(user.getLastName()); } User updatedUser =
	 * userRepo.save(findUser); return updatedUser; }
	 * 
	 * public List<User> getAllUser(String lastName,int page){ List<User> user =
	 * userRepo.findByLastName(lastName,page); return user;
	 * 
	 * }
	 */
	public Map readText(Text<String> text) throws IOException {
		// TODO Auto-generated method stub
		Map<String,String> list1 = new HashMap<String,String>();
		String str=null;
		BufferedReader br = new BufferedReader((Reader) text);
		int count =0;
		while(br.readLine()!=null) {
			String line = br.readLine();
			String linenumber = "line"+count;
			list1.put(linenumber, line);
			count++;
		}
		return list1;
		
	}
}
