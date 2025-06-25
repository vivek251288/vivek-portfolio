package com.jiocoders.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Jiocoders2206javaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Jiocoders2206javaApplication.class, args);
		System.out.println("******Application Started******");
	}
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(Jiocoders2206javaApplication.class);
	    }
}
