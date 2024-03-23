package com.travel.api.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.api.insurance.entity.InsuranceEntity;

public interface InsuranceRepository extends JpaRepository<InsuranceEntity,Integer>{

	
}



