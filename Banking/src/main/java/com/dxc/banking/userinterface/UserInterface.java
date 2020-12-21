package com.dxc.banking.userinterface;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import com.dxc.banking.models.UserCredentials;

public interface UserInterface {
	public boolean createAccount(@Valid @RequestBody UserCredentials account);
	public boolean deposit(long accountNumber, int amount);
	public boolean withdraw(int amount);
	public boolean transfer(UserCredentials sourceAccount, UserCredentials destAccount, int amount);
	public String getStatement();
	public boolean changePassword();

}
