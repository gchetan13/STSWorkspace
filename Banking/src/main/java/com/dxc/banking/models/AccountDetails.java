package com.dxc.banking.models;

import javax.validation.constraints.NotEmpty;

public class AccountDetails {
	@NotEmpty(message = "Name can not be empty")
	private String name;
	@NotEmpty(message = "Address can not be empty")
	private String address;
	private int accountNo;
	private int amount;
	private boolean isCurrentAccount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public boolean isCurrentAccount() {
		return isCurrentAccount;
	}
	public void setCurrentAccount(boolean isCurrentAccount) {
		this.isCurrentAccount = isCurrentAccount;
	}
	
}
