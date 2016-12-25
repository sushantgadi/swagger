package com.elegant.swagger.exception;

import javax.activation.UnsupportedDataTypeException;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.elegant.swagger.to.ErrorLog;
import com.elegant.swagger.to.ErrorStatus;

@ControllerAdvice
public class ExceptionProcessor {

	ErrorStatus status = new ErrorStatus();
	
	static final Logger LOGGER = Logger.getLogger(ExceptionProcessor.class);

	@ExceptionHandler
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ErrorStatus badRequest(HttpMessageNotReadableException e) {
		LOGGER.error("Error in ExceptionProcessor :: ", e);
		status.setStatusCode("0");
		status.setErrorLog(new ErrorLog(HttpStatus.BAD_REQUEST));
		return status;
	}

	@ExceptionHandler
	@ResponseBody
	public ErrorStatus badRequest(NullPointerException e) {
		LOGGER.error("Error in ExceptionProcessor :: ", e);
		status.setStatusCode("0");
		status.setErrorLog(new ErrorLog(e.getClass().getName(), e.getMessage()));
		return status;
	}

	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.UNSUPPORTED_MEDIA_TYPE)
	@ResponseBody
	public ErrorStatus unsupportedMediaType(UnsupportedDataTypeException ex) {
		LOGGER.error("Error in ExceptionProcessor :: ", ex);
		status.setStatusCode("0");
		status.setErrorLog(new ErrorLog(HttpStatus.UNSUPPORTED_MEDIA_TYPE));
		return status;
	}

}