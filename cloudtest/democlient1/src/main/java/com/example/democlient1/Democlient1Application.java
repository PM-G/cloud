package com.example.democlient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Democlient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Democlient1Application.class, args);
	}

}
