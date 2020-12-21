package com.dxc.banking.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dxc.banking.models.UserCredentials;
import com.dxc.banking.service.UserService;
import com.dxc.banking.userinterface.UserInterface;
@CrossOrigin
@RestController()
@Validated
public class UserController implements UserInterface{

	@Autowired
	private UserService service;

	@RequestMapping(path = "/createAccount",method = RequestMethod.POST)
	public boolean createAccount(@Valid @RequestBody UserCredentials account) {
		return service.createAccount(account);
	}

	@RequestMapping(value = "/deposit",method=RequestMethod.POST)
	public boolean deposit(long accountNumber, int amount) {
		return service.deposit(accountNumber, amount);
	}

	@RequestMapping(value = "/withdraw")
	public boolean withdraw(int amount) {
		return service.withdraw(amount);
	}

	@RequestMapping(value = "/transfer",method = RequestMethod.POST)
	public boolean transfer(UserCredentials sourceAccount, UserCredentials destAccount, int amount) {
		return service.transfer(sourceAccount, destAccount, amount);
	}

	@RequestMapping(value = "/statement",method = RequestMethod.GET )
	public String getStatement() {
		return service.getStatement();
	}
	@RequestMapping(value = "/changepassword" ,method = RequestMethod.POST)
	public boolean changePassword() {
		return service.changePassword();
	}

}
