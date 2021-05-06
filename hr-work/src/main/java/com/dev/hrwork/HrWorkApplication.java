package com.dev.hrwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HrWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrWorkApplication.class, args);
	}

}
