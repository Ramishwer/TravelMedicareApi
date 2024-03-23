package com.travel.api.adminUser.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.travel.api.adminUser.bean.AdminUserBean;
import com.travel.api.adminUser.entity.AdminUserEntity;
import com.travel.api.adminUser.repository.AdminUserRepository;
import com.travel.api.exceptionHandling.util.Errors;
import com.travel.api.util.FmkException;

public class AdminUserServiceImpl implements AdminUserService {
	
	@Autowired
	AdminUserRepository adminUserRepository; 

	@Override
	public void createUser(AdminUserBean adminUserBean) throws FmkException {
		// TODO Auto-generated method stub
		if(adminUserBean!=null)
		{
			AdminUserEntity adminUserEntity= new AdminUserEntity();
			if(adminUserRepository.existsByEmail(adminUserBean.getEmail()))
			{
				adminUserEntity.setEmail(adminUserBean.getEmail());
			}
			else
			{
				throw new FmkException("U1001",
						Errors.getValue("U1001", new String[] { adminUserBean.getEmail() }));
			}
			
			adminUserRepository.save(adminUserEntity);
		}
		
	}

}
