package com.dari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.dari"})
public class DariApplication {

	public static void main(String[] args) {
		SpringApplication.run(DariApplication.class, args);
	}

}
