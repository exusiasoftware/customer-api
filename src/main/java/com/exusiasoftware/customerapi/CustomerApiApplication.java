package com.exusiasoftware.customerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.exusiasoftware" })
public class CustomerApiApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApiApplication.class, args);
	}

}
