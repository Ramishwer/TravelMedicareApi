package com.travel.api.exceptionHandling.bean;

public class ExceptionHandlerBean {

	private String message;

	private int statusCode;

	private String errorCode;

	public ExceptionHandlerBean() {
		super();
	}

	public ExceptionHandlerBean(String message, int statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}

	public ExceptionHandlerBean(String message, String code, int statusCode) {
		super();
		this.message = message;
		this.errorCode = code;
		this.statusCode = statusCode;

	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
