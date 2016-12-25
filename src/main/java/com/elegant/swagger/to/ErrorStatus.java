package com.elegant.swagger.to;

import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ErrorStatus {

	private String statusCode;
	private String message;
	private List<String> messageList;

	private ErrorLog errorLog;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<String> messageList) {
		this.messageList = messageList;
	}

	public ErrorLog getErrorLog() {
		return errorLog;
	}

	public void setErrorLog(ErrorLog errorLog) {
		this.errorLog = errorLog;
	}

}
