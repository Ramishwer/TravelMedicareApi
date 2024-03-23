package com.travel.api.adminUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.api.adminUser.entity.AdminUserEntity;

public interface AdminUserRepository extends JpaRepository<AdminUserEntity, Integer> {

	boolean existsByEmail(String email);

}
