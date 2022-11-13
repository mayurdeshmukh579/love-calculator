package com.maytech.lc.api;

import java.util.MissingFormatArgumentException;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "* Username cannot be blank")
	@Size(min = 3,max = 15,message = "* Characters should between 3-15")
	private String userName;
	@NotBlank(message = "* Crush name cannot be blank")
	@Size(min = 3,max = 15,message = "* Characters should between 3-15")
	private String crushName;
	private String password;
	private boolean termAndCondition;
	
	@AssertTrue(message = "You have to agree to use app")
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + ", password=" + password + "]";
	}
	
	
	
}
