package com.travel.api.quote.request;

import java.time.LocalDate;
import java.util.List;

public class QuickQuoteRequest {
	
	private List<InsuredDetailsRequest> insuredDetailsRequests;
	private LocalDate policyStartDate;
	private LocalDate policyEndDate;
	private int sumInsured;
	private Integer idPlan;
	
	public List<InsuredDetailsRequest> getInsuredDetailsRequests() {
		return insuredDetailsRequests;
	}
	public void setInsuredDetailsRequests(List<InsuredDetailsRequest> insuredDetailsRequests) {
		this.insuredDetailsRequests = insuredDetailsRequests;
	}
	public LocalDate getPolicyStartDate() {
		return policyStartDate;
	}
	public void setPolicyStartDate(LocalDate policyStartDate) {
		this.policyStartDate = policyStartDate;
	}
	public LocalDate getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolicyEndDate(LocalDate policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	public int getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}
	public Integer getIdPlan() {
		return idPlan;
	}
	public void setIdPlan(Integer idPlan) {
		this.idPlan = idPlan;
	}
	
	

}
