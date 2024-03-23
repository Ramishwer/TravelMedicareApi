package com.travel.api.quote.request;

import java.time.LocalDate;

public class InsuredDetailsRequest {
	
	private String insuredName;
	private LocalDate insuredDOB;
	private String insurredGender;
	
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public LocalDate getInsuredDOB() {
		return insuredDOB;
	}
	public void setInsuredDOB(LocalDate insuredDOB) {
		this.insuredDOB = insuredDOB;
	}
	public String getInsurredGender() {
		return insurredGender;
	}
	public void setInsurredGender(String insurredGender) {
		this.insurredGender = insurredGender;
	}
}
