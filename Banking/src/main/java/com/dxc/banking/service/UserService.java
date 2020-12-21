package com.dxc.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dxc.banking.dao.UserDAO;
import com.dxc.banking.models.UserCredentials;
import com.dxc.banking.userinterface.UserInterface;

@Service
public class UserService implements UserInterface {

	@Autowired
	UserDAO dao;

	@Autowired
	PasswordEncoder passwordencoder;

	public ResponseEntity<String> login(String username, String password) {
		UserCredentials credentials = new UserCredentials();
		credentials.setLoginId(username);
		credentials.setPassword(password);
		UserCredentials account = dao.login(credentials);
		if (null != account) {
			if (passwordencoder.matches(password, account.getPassword())) {
				return new ResponseEntity<String>(HttpStatus.OK);
			} else {
				return new ResponseEntity<String>("Password is incorrect", HttpStatus.OK);
			}
		} else {
			return new ResponseEntity<String>("Not a valid User", HttpStatus.OK);
		}
	}

	public boolean createAccount(UserCredentials account) {
		return dao.createAccount(account);

	}

	public boolean deposit(long accountNumber, int amount) {
		return true;
	}

	public boolean withdraw(int amount) {
		return true;
	}

	public boolean transfer(UserCredentials sourceAccount, UserCredentials destAccount, int amount) {
		return true;
	}

	public String getStatement() {
		return "Empty Statement";
	}

	public boolean changePassword() {
		return true;
	}

}
