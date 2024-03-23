package com.travel.api.util;

import javax.naming.NamingException;

public class FmkException extends Exception {

	private static final long serialVersionUID = 1L;

	private String key;

	private String defaultMessage;

	private Object[] params;

	private String code;

	private boolean rollbackOnly = true;

	public FmkException() {
		super();
		rollbackOnly = true;
	}

	public FmkException(Throwable cause) {
		super(cause);
		if (cause instanceof FmkException) {
			FmkException fmkException = (FmkException) cause;
			this.key = fmkException.getKey();
			defaultMessage = fmkException.getDefaultMessage();
			params = fmkException.params;
		}
	}

	public FmkException(String defaultMessage) {
		super();
		this.defaultMessage = defaultMessage;
	}

	public FmkException(String code, String message) {
		super(message);
		this.defaultMessage = message;
		this.code = code;
	}

	public FmkException(String code, Throwable cause, String message) {
		super(code);
		this.defaultMessage = message;
	}

	public FmkException(NamingException ee) {
		// TODO Auto-generated constructor stub
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	public void setDefaultMessage(String defaultMessage) {
		this.defaultMessage = defaultMessage;
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isRollbackOnly() {
		return rollbackOnly;
	}

	public void setRollbackOnly(boolean rollbackOnly) {
		this.rollbackOnly = rollbackOnly;
	}
}
