package com.example.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springbootmongodb.vo.UserDataVo;

public interface UserDataRepository extends MongoRepository<UserDataVo, String>{

}
