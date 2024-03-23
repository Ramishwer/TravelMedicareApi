package com.travel.api.user.service;

import java.util.List;

import com.travel.api.user.entity.UserEntity;

public interface UserService {

	  List<UserEntity> getAllUsers();
	  
	  UserEntity createUser(UserEntity user);
	  
	  UserEntity getUserById(Integer userId);
	  
	  UserEntity getUserByEmail(String emailId);

}
