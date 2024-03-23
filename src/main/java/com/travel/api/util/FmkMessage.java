package com.travel.api.util;

import java.text.MessageFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FmkMessage {
	
	private static final Logger logger = LogManager.getLogger(FmkMessage.class);

	private String messageKey;

	private final String messageKeySmall;

	private String loggerName;

	private Object[] messageArgs;

	private String messageDevLanguage;

	private Visibility logVisibility;

	private Date logDate;

	private final long threadId;

	private final String functionalName;

	public static enum Visibility {
		NONE(0), EVENTVIEWER(10);

		private int value;

		private Visibility(int value) {
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}
	}

	public FmkMessage(String loggerName, String messageKey, String messageKeySmall, Object[] messageArgs,
			String messageDevLanguage, Visibility logVisibility, String functionalName) {
		this.loggerName = loggerName;
		this.messageKey = messageKey;
		this.messageArgs = messageArgs;
		this.messageDevLanguage = messageDevLanguage;
		this.logVisibility = logVisibility;
		this.logDate = new Date();
		this.messageKeySmall = messageKeySmall;
		this.threadId = Thread.currentThread().getId();
		this.functionalName = functionalName;
	}

	public FmkMessage(String loggerName, String messageKey, Object[] messageArgs, String messageDevLanguage,
			Visibility logVisibility, String functionalName) {
		this(loggerName, messageKey, null, messageArgs, messageDevLanguage, logVisibility, functionalName);
	}

	public Object[] getMessageArgs() {
		return this.messageArgs;
	}

	public String getMessageKey() {
		return this.messageKey;
	}

	public Date getLogDate() {
		return this.logDate;
	}

	public Visibility getLogVisibility() {
		return this.logVisibility;
	}

	public String getMessageDevLanguage() {
		return this.messageDevLanguage;
	}

	public String getLoggerName() {
		return this.loggerName;
	}

	public long getThreadId() {
		return this.threadId;
	}

	public String getFunctionalName() {
		return this.functionalName;
	}

	public String toString() {
		String strMessage = null;
		StringBuffer stringBuffer = null;
		try {
			if (this.messageKeySmall == null) {
				stringBuffer = new StringBuffer(50).append("T[").append(this.threadId).append("] - ")
						.append(this.messageDevLanguage);
			} else {
				stringBuffer = new StringBuffer(50).append("T[").append(this.threadId).append("],[")
						.append(this.messageKeySmall).append("] - ").append(this.messageDevLanguage);
			}
			strMessage = MessageFormat.format(stringBuffer.toString(), this.messageArgs);
		} catch (IllegalArgumentException ex) {
			logger.error(ex);
			strMessage = this.messageDevLanguage;
		}
		return strMessage;
	}
}
