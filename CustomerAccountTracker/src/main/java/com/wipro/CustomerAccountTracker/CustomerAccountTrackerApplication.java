package com.wipro.CustomerAccountTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.wipro.CustomerAccountTracker.CustomerController"})
public class CustomerAccountTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerAccountTrackerApplication.class, args);
		System.out.println("Running");
	}

}
