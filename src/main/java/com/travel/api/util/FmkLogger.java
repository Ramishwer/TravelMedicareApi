package com.travel.api.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FmkLogger {

	private final Logger logger = LogManager.getLogger();

	private String functionalName;

	private static final String FQCN = FmkLogger.class.getName();

	private final static Logger loggerForErrors = LogManager.getLogger(FmkLogger.class);

	public void errorTechnicalJava(final FmkMessage.Visibility visibility, final Throwable throwable) {

		logger.log(Level.ERROR, FQCN,
				new FmkMessage(logger.getName(), logger.getName() + "." + "ERRORTECHNICALJAVA",
						new String[] { throwable.getMessage() }, "Error {}", visibility.NONE, functionalName),
				throwable);
	}
}
