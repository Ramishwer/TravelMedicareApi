package com.travel.api.exceptionHandling.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.travel.api.exceptionHandling.bean.ExceptionHandlerBean;
import com.travel.api.exceptionHandling.service.ExceptionHandlerService;
import com.travel.api.exceptionHandling.util.FmkException;

@RestControllerAdvice
public class ExceptionHandlingController {

	@Autowired
	private ExceptionHandlerService exceptionHandlerService;

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionHandlerBean> handleException(Exception e) {

		ExceptionHandlerBean exceptionHandlerBean = exceptionHandlerService.composeExceptionBody(e);
		return new ResponseEntity<ExceptionHandlerBean>(exceptionHandlerBean, new HttpHeaders(),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(FmkException.class)
	public ResponseEntity<ExceptionHandlerBean> handleFmkException(FmkException e) {

		ExceptionHandlerBean exceptionHandlerBean = new ExceptionHandlerBean(e.getMessage(), e.getCode(),
				HttpStatus.INTERNAL_SERVER_ERROR.value());
		return new ResponseEntity<ExceptionHandlerBean>(exceptionHandlerBean, new HttpHeaders(),
				HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
