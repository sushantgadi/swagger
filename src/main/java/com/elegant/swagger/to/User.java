package com.elegant.swagger.to;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "username cannot be null")
	private String userName;
	
	@NotNull(message = "emailId cannot be null")
	@Email(message="Enter valid emailId")
	private String emailId;
	
	@NotNull(message = "department cannot be null")
	private String contactNo;
	
	@NotNull(message = "address cannot be null")
	private String address;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(String userName, String emailId, String contactNo, String address) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
