package com.springframework.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class User {

	@Value("#{systemProperties}")
	private String envt;
	@Value("${user.cname}")
	private String name;
	
	public String getEnvt() {
		return envt;
	}

	public void setEnvt(String envt) {
		this.envt = envt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [envt=" + envt + ", name=" + name + "]";
	}
	
	
}
