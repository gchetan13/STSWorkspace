package com.dxc.banking.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dxc.banking.models.UserCredentials;
import com.dxc.banking.service.LogonService;

@CrossOrigin(
		origins = {"*"}
		, exposedHeaders = {"Authorization"}
		, allowedHeaders = {"*"}
		, methods = { RequestMethod.OPTIONS,RequestMethod.POST, RequestMethod.GET, RequestMethod.HEAD })
@RestController()
public class LoginController {

	@Autowired
	LogonService service;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<String> login(@RequestBody Map<String, String> map) {
		String username = map.get("userName");
		String password = map.get("userPassword");
		UserCredentials credentials = new UserCredentials();
		credentials.setLoginId(username);
		credentials.setPassword(password);
		System.out.println("In logincontroller"+username);
		return service.login(credentials);

	}

	/*
	 * @RequestMapping(value = "/login" , method = RequestMethod.OPTIONS) public
	 * ResponseEntity<String> loginpreflight(@RequestBody Map<String, String> map) {
	 * 
	 * String username=map.get("username"); String password = map.get("password");
	 * UserCredentials credentials = new UserCredentials();
	 * credentials.setLoginId(username); credentials.setPassword(password);
	 * 
	 * System.out.println("In Otions method"); return new
	 * ResponseEntity<String>(HttpStatus.OK);
	 * 
	 * }
	 */

}
