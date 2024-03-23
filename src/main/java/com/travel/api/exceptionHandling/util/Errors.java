package com.travel.api.exceptionHandling.util;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Errors {

	private static final String BUNDLE_NAME = "com.wms.api.exceptionHandling.util.message";

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private Errors() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static String getValue(String key, String[] args) {
		return MessageFormat.format(getString(key), args);
	}

	public static String getValue(String key, Object[] arguments) {
		return MessageFormat.format(getString(key), arguments);
	}

	public static String getValue(String key) {
		return getString(key);
	}
}
