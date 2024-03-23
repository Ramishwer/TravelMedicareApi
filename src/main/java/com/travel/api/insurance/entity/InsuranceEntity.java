package com.travel.api.insurance.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.travel.api.generic.entity.GenericEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="INSURANCE_PLAN")
public class InsuranceEntity{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_INSURANCE")
	private Integer idInsurance;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	
	@Column(name="PLAN_PRICE")
	private String planPrice;
	
	@Column(name="INSURANCE_PLAN_DATA")
	private String insurancePlanData;

	@Column(name="STATUS")
	private boolean status;

	
	@Column(name="ID_COUNTRY")
	private Integer idCountry;
	
	@Column(name="DELETED_AT")
	private LocalDateTime deletedAt;
	
	@Column(name="CREATED_AT")
	private LocalDateTime createdAt;
	
	@Column(name="UPDATED_AT")
	private LocalDateTime updatedAt;

	public InsuranceEntity() {
		super();
		
	}

	public Integer getIdInsurance() {
		return idInsurance;
	}

	public void setIdInsurance(Integer idInsurance) {
		this.idInsurance = idInsurance;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanPrice() {
		return planPrice;
	}

	public void setPlanPrice(String planPrice) {
		this.planPrice = planPrice;
	}

	public String getInsurancePlanData() {
		return insurancePlanData;
	}

	public void setInsurancePlanData(String insurancePlanData) {
		this.insurancePlanData = insurancePlanData;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Integer idCountry) {
		this.idCountry = idCountry;
	}

	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "InsuranceEntity [idInsurance=" + idInsurance + ", planName=" + planName + ", planPrice=" + planPrice
				+ ", status=" + status + ", idCountry=" + idCountry
				+ ", deletedAt=" + deletedAt + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

	
	
	
	
}
