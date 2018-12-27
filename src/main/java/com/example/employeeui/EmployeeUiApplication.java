package com.example.employeeui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmployeeUiApplication {

	public static void main(String[] args) {
		System.out.println("Before RUN");
		SpringApplication.run(EmployeeUiApplication.class, args);

		System.out.println("After RUN");
	}


}

