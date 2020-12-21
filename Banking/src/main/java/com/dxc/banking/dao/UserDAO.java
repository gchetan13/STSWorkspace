package com.dxc.banking.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.dxc.banking.models.UserCredentials;

@Repository
public class UserDAO{
	
	public UserCredentials login(UserCredentials credentials) {
		// get usernames and passwords from database
		List<UserCredentials> users = new ArrayList<UserCredentials>();
		UserCredentials account1 = new UserCredentials();
		account1.setLoginId("gchetan");
		account1.setPassword("$2a$10$XKAKSzkBUWKmXx1m9Rcqo.JhbiOSdl7WHH3T/Z8BLoF3JhPpUDT4m"); 
		UserCredentials account2 = new UserCredentials();
		account2.setLoginId("aniruddha");
		account2.setPassword("$2a$10$HGq9iTJzXhxjy7ON1EG7Ru9PJVZCPGy8rOu84XWuDm046VY.Ovn9e"); 
		users.add(account1);
		users.add(account2);
		Optional<UserCredentials> userFound =	users.stream().filter(user->user.getLoginId().equalsIgnoreCase(credentials.getLoginId())).findFirst();
		if(userFound.isPresent())
			return userFound.get();
		else
		return null;
	}
	
	public boolean createAccount(UserCredentials account) {
		// Insert into users
		
		return true;
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
