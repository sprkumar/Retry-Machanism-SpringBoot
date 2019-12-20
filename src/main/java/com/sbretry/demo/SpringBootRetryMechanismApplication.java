package com.sbretry.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
/**
 * @author ravindra
 *
 */
@SpringBootApplication
@EnableRetry
public class SpringBootRetryMechanismApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRetryMechanismApplication.class, args);
	}

}
