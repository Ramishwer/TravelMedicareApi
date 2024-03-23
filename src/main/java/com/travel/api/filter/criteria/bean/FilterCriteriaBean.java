package com.travel.api.filter.criteria.bean;

public class FilterCriteriaBean {

	private String attribute;

	private String operation;

	private String value;

	public FilterCriteriaBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FilterCriteriaBean(String attribute, String operation, String value) {
		super();
		this.attribute = attribute;
		this.operation = operation;
		this.value = value;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
