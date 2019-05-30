package com.example.springbootmongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootmongodb.repository.UserDataRepository;
import com.example.springbootmongodb.vo.UserDataVo;


@Service("com.example.springbootmongodb.service.UserDataServiceImpl")
public class UserDataServiceImpl implements UserDataService{
	
	@Autowired
	UserDataRepository userDataRepo;
	
	public List<UserDataVo> getAllUsers() {
		return userDataRepo.findAll();
	}

	public List<UserDataVo> createUser(UserDataVo userDataVo) {
		userDataRepo.insert(userDataVo);
		return getAllUsers();
		
	}
	
}
