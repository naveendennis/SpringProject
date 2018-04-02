package com.dennis.pojo;

public class UserDetails {
	long userId;
	String userName;
	String emailId;
	String[] preferredCategories;
	String password;
	ROLE role;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ROLE getRole() {
		return role;
	}

	public void setRole(ROLE role) {
		this.role = role;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

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

	public String[] getPreferredCategories() {
		return preferredCategories;
	}

	public void setPreferredCategories(String[] preferredCategories) {
		this.preferredCategories = preferredCategories;
	}

}
