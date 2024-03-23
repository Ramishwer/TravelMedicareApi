package com.travel.api.user.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.travel.api.user.entity.UserEntity;
import com.travel.api.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

	
	public UserEntity createUser(UserEntity user) {
		 try {
		        return userRepository.save(user);
		    } catch (Exception e) {
		        throw new RuntimeException("Error creating user: " + e.getMessage(), e);
		    }
	}
	
    public UserEntity getUserById(Integer userId) {
    	Optional<UserEntity> optionaluser= userRepository.findById(userId);
    	return optionaluser.get();
    }
    
    public UserEntity getUserByEmail(String emailId) {
    	return userRepository.findByEmail(emailId);
    }
}





















