package com.dxc.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}
	
	
	  @Bean public WebMvcConfigurer corsConfigurer() { return new
	  WebMvcConfigurer() {
	  
	  @Override public void addCorsMappings(CorsRegistry registry) {
	  System.out.println("Cors Configurer");
	  registry
	  .addMapping("/login")
	  .allowedOrigins("http://localhost:4200/")
	  //.allowedHeaders("Access-Control-Allow-Origin","Content-Type","Access-Control-Allow-Methods","Access-Control-Allow-Headers","Authorization")
	  .exposedHeaders("Access-Control-Request-Method,Content-Type");
	  } }; }
	 

}
