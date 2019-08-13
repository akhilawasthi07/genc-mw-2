package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookDataStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookDataStoreApplication.class, args);
	}

}
