package com.dxc.banking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dxc.banking.dao.LogonRepository;
import com.dxc.banking.dao.LogonRepositoryImpl;
import com.dxc.banking.dao.UserDAO;
import com.dxc.banking.models.UserCredentials;

@Service
public class LogonService {

	@Autowired
	LogonRepositoryImpl repo;
	
	@Autowired
	PasswordEncoder passwordencoder;

	public ResponseEntity<String> login(UserCredentials credentials) {
		System.out.println(credentials.getLoginId());
		UserCredentials account = repo.login(credentials);
//		System.out.println(account.getLoginId());
		if (null != account) {
			if (passwordencoder.matches(credentials.getPassword(), account.getPassword())) {
				return new ResponseEntity<String>("{status : success}",HttpStatus.OK);
			} else {
				return new ResponseEntity<String>("{status : incorrect password}", HttpStatus.UNAUTHORIZED);
			}
		} else {
			return new ResponseEntity<String>("{status : not a valid user}", HttpStatus.UNAUTHORIZED);
		}

		// return new ResponseEntity<String>("Not a valid User", HttpStatus.OK);
	}
	

}
