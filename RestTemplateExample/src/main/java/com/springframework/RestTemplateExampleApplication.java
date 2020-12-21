package com.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
public class RestTemplateExampleApplication {
	static RestTemplate template = new RestTemplate();
	static String baseUrl = "https://still-shore-77174.herokuapp.com/";
	public static void main(String[] args) {
		//SpringApplication.run(RestTemplateExampleApplication.class, args);
		getExchange();
	}

	private static void getExchange() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);;
		HttpEntity<Object> entity = new HttpEntity<Object>(headers);
		ResponseEntity<String> responseEntity = template.exchange(baseUrl+"getting_started", HttpMethod.GET, entity, String.class);
		HttpStatus status = responseEntity.getStatusCode();
		System.out.println("Http Status Code"+status);
		System.out.println("Body "+responseEntity.getBody());
		System.out.println("Headers "+responseEntity.getHeaders());
	}

}
