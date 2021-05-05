package com.dev.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HrpayRollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrpayRollApplication.class, args);
	}

}
