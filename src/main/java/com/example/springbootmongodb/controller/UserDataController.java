package com.example.springbootmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmongodb.service.UserDataService;
import com.example.springbootmongodb.vo.UserDataVo;

@CrossOrigin
@RestController
public class UserDataController {
	
	@Autowired
	@Qualifier("com.example.springbootmongodb.service.UserDataServiceImpl")
	private UserDataService userDataService;
	
	@GetMapping("/getAllUsers")
	public List<UserDataVo> getAllUsers() {
		
		List<UserDataVo> entities = userDataService.getAllUsers();
		return entities;
		
	}
	
	@PostMapping("/createUser")
	public List<UserDataVo> createUser(@RequestBody UserDataVo userDataVo) {
		return userDataService.createUser(userDataVo);
	}
	
}
