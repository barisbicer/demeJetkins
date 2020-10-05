package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemeJetkinsApplication {
	
	public static Logger logger =org.slf4j.LoggerFactory.getLogger(DemeJetkinsApplication.class);
	
	@PostConstruct
	public void init() {
		
		logger.info("Application started.......");
		System.out.println("new test");
	}

	public static void main(String[] args) {
		logger.info("Application executed.......");
		SpringApplication.run(DemeJetkinsApplication.class, args);
	}

}
