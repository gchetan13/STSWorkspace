package com.dxc.banking.models;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;

import com.dxc.banking.annotation.ValidPassword;

@Document(collection = "credentials")
//@Component
public class UserCredentials {

	@NotEmpty(message = "Login Id can not be empty")
	private String username;
	@NotEmpty(message = "Password can not be empty")
	@ValidPassword(message = "Not a valid password")
	private String password;

	public String getLoginId() {
		return username;
	}

	public void setLoginId(String loginId) {
		this.username = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
