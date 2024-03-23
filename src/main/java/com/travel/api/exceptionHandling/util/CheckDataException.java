package com.travel.api.exceptionHandling.util;

import java.text.MessageFormat;

public class CheckDataException extends Exception {

	private static final long serialVersionUID = 1L;

	private String key;

	private String defaultMessage;

	private Object[] params;

	public CheckDataException(String key) {
		super(key);
		this.key = key;
	}

	public CheckDataException(String key, Throwable cause) {
		super(key, cause);
		this.key = key;
	}

	public CheckDataException(String key, Object[] params) {
		super(key + " : " + params);
		this.key = key;
		this.params = params;
	}

	public CheckDataException(String key, String defaultMessage) {
		super(defaultMessage);
		this.key = key;
		this.defaultMessage = defaultMessage;
	}

	public CheckDataException(String key, String defaultMessage, Object[] params) {
		super(MessageFormat.format(defaultMessage, params));
		this.key = key;
		this.defaultMessage = defaultMessage;
		this.params = params;
	}

	public CheckDataException(FmkException fmkException) {
		super(fmkException.getMessage());
		key = fmkException.getKey();
		if (key == null) {
			defaultMessage = fmkException.getMessage();
			for (Throwable t = fmkException; t != null; t = t.getCause()) {
				if (t instanceof FmkException) {
					FmkException fmkExceptionChild = (FmkException) t;
					if (fmkExceptionChild.getKey() != null) {
						key = fmkExceptionChild.getKey();
						key = generateKeyFromSourceException(key, fmkExceptionChild);
						defaultMessage = fmkExceptionChild.getDefaultMessage();
						params = fmkExceptionChild.getParams();
						break;
					}
				}
			}
		} else {
			key = generateKeyFromSourceException(key, fmkException);
			defaultMessage = fmkException.getDefaultMessage();
			params = fmkException.getParams();
		}
	}

	private String generateKeyFromSourceException(String key, Throwable t) {
		String newKey = key;
		if (t != null) {

			StackTraceElement ste = t.getStackTrace()[0];
			String className = ste.getClassName();

			// LocationInfo li = new LocationInfo(t, t.getClass().getName());
			// String className = li.getClassName();

			newKey = className.substring(className.lastIndexOf('.') + 1) + ';' + key;
		}
		return newKey;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	public String getKey() {
		return key;
	}

	public Object[] getParams() {
		return params;
	}

}
