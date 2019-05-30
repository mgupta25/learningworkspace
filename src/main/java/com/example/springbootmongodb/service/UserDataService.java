package com.example.springbootmongodb.service;

import java.util.List;

import com.example.springbootmongodb.vo.UserDataVo;

public interface UserDataService {
	
	List<UserDataVo> getAllUsers();

	List<UserDataVo> createUser(UserDataVo userDataVo);
	
}
