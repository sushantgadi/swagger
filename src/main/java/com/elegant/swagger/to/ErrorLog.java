package com.elegant.swagger.to;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.http.HttpStatus;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ErrorLog {

	private String errorCode;
	private String errorMessage;
	private List<String> errMessageList = new ArrayList<String>();

	private HttpStatus httpStatus;

	public ErrorLog() {
		super();
	}

	/**
	 * @param errorCode
	 * @param errorMessage
	 * @param errMessageList
	 */
	public ErrorLog(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public ErrorLog(HttpStatus httpStatus) {
		super();
		this.httpStatus = httpStatus;
	}

	public ErrorLog(String errorCode, List<String> errMessageList) {
		super();
		this.errorCode = errorCode;
		this.errMessageList = errMessageList;
	}

	public ErrorLog(String errorCode, String errorMessage, List<String> errMessageList) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errMessageList = errMessageList;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getErrMessageList() {
		return errMessageList;
	}

	public void setErrMessageList(List<String> errMessageList) {
		this.errMessageList = errMessageList;
	}

	/**
	 * @return the httpStatus
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param httpStatus
	 *            the httpStatus to set
	 */
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
