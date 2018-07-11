package com.khan.testzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestzuulApplication.class, args);
	}
	
	@RequestMapping(value = "/available")
	  public String available() {
		System.out.println("TestzuulApplication.available()");
	    return "Spring in Action";
	  }

	  @RequestMapping(value = "/checked-out")
	  public String checkedOut() {
		  System.out.println("TestzuulApplication.checkedOut()");
	    return "Spring Boot in Action";
	  }
}
