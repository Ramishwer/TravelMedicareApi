package com.travel.api.exceptionHandling.service;

import com.travel.api.exceptionHandling.bean.ExceptionHandlerBean;

public interface ExceptionHandlerService {

	public ExceptionHandlerBean composeExceptionBody(Exception e);

}
