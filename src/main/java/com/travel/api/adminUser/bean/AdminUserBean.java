package com.travel.api.adminUser.bean;

import java.time.LocalDateTime;

import com.travel.api.generic.bean.GenericBean;

public class AdminUserBean extends GenericBean{
	
	private Integer idAdmin;
	
	private Integer parentId;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private LocalDateTime emailVerifiedAt;
	
	private String phone;
	
	private int otp;
	
	private LocalDateTime otpUpdatedTime;
	
	private String country;
	
	private String address;
	
	private boolean status;
	
	private String remeberToken;
	
	private String menuAccess;

	public Integer getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getEmailVerifiedAt() {
		return emailVerifiedAt;
	}

	public void setEmailVerifiedAt(LocalDateTime emailVerifiedAt) {
		this.emailVerifiedAt = emailVerifiedAt;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public LocalDateTime getOtpUpdatedTime() {
		return otpUpdatedTime;
	}

	public void setOtpUpdatedTime(LocalDateTime otpUpdatedTime) {
		this.otpUpdatedTime = otpUpdatedTime;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRemeberToken() {
		return remeberToken;
	}

	public void setRemeberToken(String remeberToken) {
		this.remeberToken = remeberToken;
	}

	public String getMenuAccess() {
		return menuAccess;
	}

	public void setMenuAccess(String menuAccess) {
		this.menuAccess = menuAccess;
	}
	
	

}
