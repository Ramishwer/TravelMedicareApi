package com.travel.api.adminUser.service;

import com.travel.api.adminUser.bean.AdminUserBean;
import com.travel.api.util.FmkException;

public interface AdminUserService {

	public void createUser(AdminUserBean adminUserBean) throws FmkException;
}
