package com.travel.api.user.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.sql.Timestamp;

@Table(name="tm_user")
@Entity
public class UserEntity {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="id") 
	@Id
	private Integer idUser;
	
	@Column(name="parent_id") 
	private Integer parentId;
	
	@Column(name="user_type") 
	private Integer userType;
	
	@Column(name="role") 
	private Integer role;
	
	@Column(name="first_name") 
	private String firstName;
	
	@Column(name="last_name") 
	private String lastName;
	
	@Column(name="advisor_name") 
	private String advisorName;
	
	@Column(name="fundserv_code") 
	private String fundservCode;
	
	@Column(name="wealthserv_code") 
	private String wealthservCode;
	
	@Column(name="email") 
	private String email;
	
	@Column(name="phone") 
	private String phone;
	
	@Column(name="otp") 
	private Integer otp;
	
	@Column(name="otp_updated_time") 
	private Integer otpUpdatedTime;
	
	@Column(name="country") 
	private String country;
	
	@Column(name="website") 
	private String website;
	
	@Column(name="fax") 
	private String fax;
	
	@Column(name="password") 
	private String password;
	
	@Column(name="address") 
	private String address;
	
	@Column(name="province_licensed") 
	private String provinceLicensed;
	
	@Column(name="licence_expiry_date") 
	private LocalDate licenceExpiryDate;
	 
	@Column(name="e_o_policy_no") 
	private String eopolicyNo;
	
	@Column(name="e_o_policy_expiry_date") 
	private LocalDate eopolicyExpiryDate;
	
	
	@Column(name="eo_insurance") 
	private String eoInsurance;
	
	@Column(name="provider") 
	private String provider;
	
	@Column(name="corporation_paper_doc") 
	private String corporationPaperDoc;
	
	@Column(name="corporation_licence_doc") 
	private String corporationLicenceDoc;
	
	@Column(name="corporation_name") 
	private String corporationName;
	
	@Column(name="bin_no_of_corporation") 
	private String binnoofCorporation;
	
	@Column(name="corporation_licence_expiry_date") 
	private String corporationLicenceExpirydate;
	
	@Column(name="e_o_corporation_name") 
	private String eocorporationName;
	
	@Column(name="corporation_e_o_policy_expiry_date") 
	private String corporationeoPolicyexpiryDate;
	
	@Column(name="driving_licence_no") 
	private String drivingLicenceno;
	
	@Column(name="sin_no") 
	private String sinNo;
	
	@Column(name="copy_of_id_proof") 
	private String copyofidProof;
	
	@Column(name="refrence_details") 
	private String refrenceDetails;
	
	@Column(name="province") 
	private String province;
	
	@Column(name="licence_no") 
	private String licenceNo;
	
	@Column(name="is_firm") 
	private String isFirm;
	
	@Column(name="bank_name") 
	private Integer bankName;
	
	@Column(name="email_verified_at") 
	private Integer emailVerifiedAt;
	
	@Column(name="remember_token") 
	private Integer rememberToken;
	
	@Column(name="any_complaint") 
	private Integer anyomplaint;
	
	@Column(name="criminal_case") 
	private Integer criminalCase;
	
	@Column(name="default_commision") 
	private Integer defaultCommision;
	
	@Column(name="credit_score") 
	private Integer creditScore;
	
	@Column(name="pending_case") 
	private Integer pendingCase;
	
	@Column(name="bank_doc") 
	private String bankDoc;
	
	@Column(name="account_no") 
	private String accountNo;
	
	@Column(name="transit_no") 
	private String transitNo;
	
	@Column(name="institution_no") 
	private Integer institutionNo;
	
	@Column(name="status") 
	private Integer status;	
	
	@Column(name="is_approved") 
	private Integer isApproved;	
	
	@Column(name="created_at") 
	private Timestamp createdAt;	
	
//	  @Temporal(TemporalType.TIMESTAMP)
//		@Column(name="created_at") 
//	    private Timestamp created_at;
	
	@Column(name="updated_at") 
	private Timestamp updatedAt;
	
	@Column(name="deleted_at") 
	private Timestamp deletedAt;
	
	@Column(name="profile_complete_status") 
	private Integer profileCompleteStatus;
	
	@Column(name="is_profile_complete") 
	private Integer isProfileComplete;
	
	@Column(name="commission") 
	private Integer commission;
	
	
	@Column(name="mga_aga_commission") 
	private Integer mgaAgaCommission;


	public UserEntity(Integer idUser, Integer parentId, Integer userType, Integer role, String firstName,
			String lastName, String advisorName, String fundservCode, String wealthservCode, String email, String phone,
			Integer otp, Integer otpUpdatedTime, String country, String website, String fax, String password,
			String address, String provinceLicensed, LocalDate licenceExpiryDate, String eopolicyNo,
			LocalDate eopolicyExpiryDate, String eoInsurance, String provider, String corporationPaperDoc,
			String corporationLicenceDoc, String corporationName, String binnoofCorporation,
			String corporationLicenceExpirydate, String eocorporationName, String corporationeoPolicyexpiryDate,
			String drivingLicenceno, String sinNo, String copyofidProof, String refrenceDetails, String province,
			String licenceNo, String isFirm, Integer bankName, Integer emailVerifiedAt, Integer rememberToken,
			Integer anyomplaint, Integer criminalCase, Integer defaultCommision, Integer creditScore,
			Integer pendingCase, String bankDoc, String accountNo, String transitNo, Integer institutionNo,
			Integer status, Integer isApproved, Timestamp createdAt, Timestamp updatedAt, Timestamp deletedAt,
			Integer profileCompleteStatus, Integer isProfileComplete, Integer commission, Integer mgaAgaCommission) {
		super();
		this.idUser = idUser;
		this.parentId = parentId;
		this.userType = userType;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.advisorName = advisorName;
		this.fundservCode = fundservCode;
		this.wealthservCode = wealthservCode;
		this.email = email;
		this.phone = phone;
		this.otp = otp;
		this.otpUpdatedTime = otpUpdatedTime;
		this.country = country;
		this.website = website;
		this.fax = fax;
		this.password = password;
		this.address = address;
		this.provinceLicensed = provinceLicensed;
		this.licenceExpiryDate = licenceExpiryDate;
		this.eopolicyNo = eopolicyNo;
		this.eopolicyExpiryDate = eopolicyExpiryDate;
		this.eoInsurance = eoInsurance;
		this.provider = provider;
		this.corporationPaperDoc = corporationPaperDoc;
		this.corporationLicenceDoc = corporationLicenceDoc;
		this.corporationName = corporationName;
		this.binnoofCorporation = binnoofCorporation;
		this.corporationLicenceExpirydate = corporationLicenceExpirydate;
		this.eocorporationName = eocorporationName;
		this.corporationeoPolicyexpiryDate = corporationeoPolicyexpiryDate;
		this.drivingLicenceno = drivingLicenceno;
		this.sinNo = sinNo;
		this.copyofidProof = copyofidProof;
		this.refrenceDetails = refrenceDetails;
		this.province = province;
		this.licenceNo = licenceNo;
		this.isFirm = isFirm;
		this.bankName = bankName;
		this.emailVerifiedAt = emailVerifiedAt;
		this.rememberToken = rememberToken;
		this.anyomplaint = anyomplaint;
		this.criminalCase = criminalCase;
		this.defaultCommision = defaultCommision;
		this.creditScore = creditScore;
		this.pendingCase = pendingCase;
		this.bankDoc = bankDoc;
		this.accountNo = accountNo;
		this.transitNo = transitNo;
		this.institutionNo = institutionNo;
		this.status = status;
		this.isApproved = isApproved;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.profileCompleteStatus = profileCompleteStatus;
		this.isProfileComplete = isProfileComplete;
		this.commission = commission;
		this.mgaAgaCommission = mgaAgaCommission;
	}

	
	

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Integer getIdUser() {
		return idUser;
	}


	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}


	public Integer getParentId() {
		return parentId;
	}


	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}


	public Integer getUserType() {
		return userType;
	}


	public void setUserType(Integer userType) {
		this.userType = userType;
	}


	public Integer getRole() {
		return role;
	}


	public void setRole(Integer role) {
		this.role = role;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAdvisorName() {
		return advisorName;
	}


	public void setAdvisorName(String advisorName) {
		this.advisorName = advisorName;
	}


	public String getFundservCode() {
		return fundservCode;
	}


	public void setFundservCode(String fundservCode) {
		this.fundservCode = fundservCode;
	}


	public String getWealthservCode() {
		return wealthservCode;
	}


	public void setWealthservCode(String wealthservCode) {
		this.wealthservCode = wealthservCode;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Integer getOtp() {
		return otp;
	}


	public void setOtp(Integer otp) {
		this.otp = otp;
	}


	public Integer getOtpUpdatedTime() {
		return otpUpdatedTime;
	}


	public void setOtpUpdatedTime(Integer otpUpdatedTime) {
		this.otpUpdatedTime = otpUpdatedTime;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getProvinceLicensed() {
		return provinceLicensed;
	}


	public void setProvinceLicensed(String provinceLicensed) {
		this.provinceLicensed = provinceLicensed;
	}


	public LocalDate getLicenceExpiryDate() {
		return licenceExpiryDate;
	}


	public void setLicenceExpiryDate(LocalDate licenceExpiryDate) {
		this.licenceExpiryDate = licenceExpiryDate;
	}


	public String getEopolicyNo() {
		return eopolicyNo;
	}


	public void setEopolicyNo(String eopolicyNo) {
		this.eopolicyNo = eopolicyNo;
	}


	public LocalDate getEopolicyExpiryDate() {
		return eopolicyExpiryDate;
	}


	public void setEopolicyExpiryDate(LocalDate eopolicyExpiryDate) {
		this.eopolicyExpiryDate = eopolicyExpiryDate;
	}


	public String getEoInsurance() {
		return eoInsurance;
	}


	public void setEoInsurance(String eoInsurance) {
		this.eoInsurance = eoInsurance;
	}


	public String getProvider() {
		return provider;
	}


	public void setProvider(String provider) {
		this.provider = provider;
	}


	public String getCorporationPaperDoc() {
		return corporationPaperDoc;
	}


	public void setCorporationPaperDoc(String corporationPaperDoc) {
		this.corporationPaperDoc = corporationPaperDoc;
	}


	public String getCorporationLicenceDoc() {
		return corporationLicenceDoc;
	}


	public void setCorporationLicenceDoc(String corporationLicenceDoc) {
		this.corporationLicenceDoc = corporationLicenceDoc;
	}


	public String getCorporationName() {
		return corporationName;
	}


	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}


	public String getBinnoofCorporation() {
		return binnoofCorporation;
	}


	public void setBinnoofCorporation(String binnoofCorporation) {
		this.binnoofCorporation = binnoofCorporation;
	}


	public String getCorporationLicenceExpirydate() {
		return corporationLicenceExpirydate;
	}


	public void setCorporationLicenceExpirydate(String corporationLicenceExpirydate) {
		this.corporationLicenceExpirydate = corporationLicenceExpirydate;
	}


	public String getEocorporationName() {
		return eocorporationName;
	}


	public void setEocorporationName(String eocorporationName) {
		this.eocorporationName = eocorporationName;
	}


	public String getCorporationeoPolicyexpiryDate() {
		return corporationeoPolicyexpiryDate;
	}


	public void setCorporationeoPolicyexpiryDate(String corporationeoPolicyexpiryDate) {
		this.corporationeoPolicyexpiryDate = corporationeoPolicyexpiryDate;
	}


	public String getDrivingLicenceno() {
		return drivingLicenceno;
	}


	public void setDrivingLicenceno(String drivingLicenceno) {
		this.drivingLicenceno = drivingLicenceno;
	}


	public String getSinNo() {
		return sinNo;
	}


	public void setSinNo(String sinNo) {
		this.sinNo = sinNo;
	}


	public String getCopyofidProof() {
		return copyofidProof;
	}


	public void setCopyofidProof(String copyofidProof) {
		this.copyofidProof = copyofidProof;
	}


	public String getRefrenceDetails() {
		return refrenceDetails;
	}


	public void setRefrenceDetails(String refrenceDetails) {
		this.refrenceDetails = refrenceDetails;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getLicenceNo() {
		return licenceNo;
	}


	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}


	public String getIsFirm() {
		return isFirm;
	}


	public void setIsFirm(String isFirm) {
		this.isFirm = isFirm;
	}


	public Integer getBankName() {
		return bankName;
	}


	public void setBankName(Integer bankName) {
		this.bankName = bankName;
	}


	public Integer getEmailVerifiedAt() {
		return emailVerifiedAt;
	}


	public void setEmailVerifiedAt(Integer emailVerifiedAt) {
		this.emailVerifiedAt = emailVerifiedAt;
	}


	public Integer getRememberToken() {
		return rememberToken;
	}


	public void setRememberToken(Integer rememberToken) {
		this.rememberToken = rememberToken;
	}


	public Integer getAnyomplaint() {
		return anyomplaint;
	}


	public void setAnyomplaint(Integer anyomplaint) {
		this.anyomplaint = anyomplaint;
	}


	public Integer getCriminalCase() {
		return criminalCase;
	}


	public void setCriminalCase(Integer criminalCase) {
		this.criminalCase = criminalCase;
	}


	public Integer getDefaultCommision() {
		return defaultCommision;
	}


	public void setDefaultCommision(Integer defaultCommision) {
		this.defaultCommision = defaultCommision;
	}


	public Integer getCreditScore() {
		return creditScore;
	}


	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}


	public Integer getPendingCase() {
		return pendingCase;
	}


	public void setPendingCase(Integer pendingCase) {
		this.pendingCase = pendingCase;
	}


	public String getBankDoc() {
		return bankDoc;
	}


	public void setBankDoc(String bankDoc) {
		this.bankDoc = bankDoc;
	}


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getTransitNo() {
		return transitNo;
	}


	public void setTransitNo(String transitNo) {
		this.transitNo = transitNo;
	}


	public Integer getInstitutionNo() {
		return institutionNo;
	}


	public void setInstitutionNo(Integer institutionNo) {
		this.institutionNo = institutionNo;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public Integer getIsApproved() {
		return isApproved;
	}


	public void setIsApproved(Integer isApproved) {
		this.isApproved = isApproved;
	}


	public Timestamp getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}


	public Timestamp getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}


	public Timestamp getDeletedAt() {
		return deletedAt;
	}


	public void setDeletedAt(Timestamp deletedAt) {
		this.deletedAt = deletedAt;
	}


	public Integer getProfileCompleteStatus() {
		return profileCompleteStatus;
	}


	public void setProfileCompleteStatus(Integer profileCompleteStatus) {
		this.profileCompleteStatus = profileCompleteStatus;
	}


	public Integer getIsProfileComplete() {
		return isProfileComplete;
	}


	public void setIsProfileComplete(Integer isProfileComplete) {
		this.isProfileComplete = isProfileComplete;
	}


	public Integer getCommission() {
		return commission;
	}


	public void setCommission(Integer commission) {
		this.commission = commission;
	}


	public Integer getMgaAgaCommission() {
		return mgaAgaCommission;
	}


	public void setMgaAgaCommission(Integer mgaAgaCommission) {
		this.mgaAgaCommission = mgaAgaCommission;
	}
	
	
	
	
	
	
	
}
