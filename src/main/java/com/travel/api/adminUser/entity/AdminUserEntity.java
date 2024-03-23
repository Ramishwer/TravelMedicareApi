package com.travel.api.adminUser.entity;

import java.time.LocalDateTime;

import com.travel.api.generic.entity.GenericEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TM_ADMIN_USER")
public class AdminUserEntity extends GenericEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_admin")
	private Integer idAdmin;
	
	@Column(name = "parent_id")
	private Integer parentId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email", unique = true)	
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email_verified_at")
	private LocalDateTime emailVerifiedAt;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "otp")
	private int otp;
	
	@Column(name = "otp_updated_time")	
	private LocalDateTime otpUpdatedTime;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "remeber_token")
	private String remeberToken;
	
	@Column(name = "menu_acsess")	
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
