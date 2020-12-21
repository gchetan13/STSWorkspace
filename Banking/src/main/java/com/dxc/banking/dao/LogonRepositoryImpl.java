package com.dxc.banking.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.banking.models.UserCredentials;

public class LogonRepositoryImpl {
	@Autowired
	LogonRepository logonRepository;
	
	public UserCredentials login(UserCredentials credentials) {
	List<UserCredentials> users = logonRepository.findAll();
	users.forEach(user-> System.out.println(user.getLoginId()));
	Optional<UserCredentials> user= users.stream().filter(u->u.getLoginId().equalsIgnoreCase(credentials.getLoginId())).findAny();
	
	if(user.isPresent()) { 
	 System.out.println("user found in db");
		return user.get();
	}
	else { 
		System.out.println("user not exist");
		return null;
	}
}
}