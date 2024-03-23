package com.travel.api.generic.entity;

import java.time.LocalDateTime;



import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class GenericEntity {

	@CreatedBy
	@Column(name = "CREATED_BY")
	protected String createdBy;

	@CreatedDate
	@Column(name = "CREATED_AT")
	protected LocalDateTime createdDate;

	@LastModifiedBy
	@Column(name = "MODIFIED_BY")
	protected String lastModifiedBy;

	@LastModifiedDate
	@Column(name = "MODIFIED_AT")
	protected LocalDateTime lastModifiedDate;
	
	@Version
	@Column(name ="VERSION")
	protected int version;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	

}
