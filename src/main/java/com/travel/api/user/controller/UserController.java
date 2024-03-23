package com.travel.api.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travel.api.user.entity.UserEntity;
import com.travel.api.user.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getListofAlluser")
	public ResponseEntity<List<UserEntity>> getAllUsers(){
	    List<UserEntity> users = userService.getAllUsers();
	    return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	 @PostMapping("createuser")
	 public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
		    UserEntity savedUser = userService.createUser(user);
	        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	  }
	 
	 @GetMapping("{id}")
	 public ResponseEntity<UserEntity> getUserById(@PathVariable("id") Integer userId){
		    UserEntity userEntity=userService.getUserById(userId);
		    return new ResponseEntity<>(userEntity,HttpStatus.OK);
	 }
	 
	 @GetMapping("/email")
	 public ResponseEntity<UserEntity> getUserByEmail(@RequestParam("email") String emailId){
		 UserEntity userEntity= userService.getUserByEmail(emailId);
		 
		 if(userEntity!=null) {
			 return new ResponseEntity<>(userEntity,HttpStatus.OK);
		 }else {
			 return new ResponseEntity<>(userEntity,HttpStatus.NOT_FOUND);
		 }
	 }
	 
	 
}

