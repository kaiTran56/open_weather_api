package com.team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class OpenWeatherApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenWeatherApiApplication.class, args);
	}

}
