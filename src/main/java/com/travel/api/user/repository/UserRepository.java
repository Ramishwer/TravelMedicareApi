package com.travel.api.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.api.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	 UserEntity findByEmail(String emailId);
}
