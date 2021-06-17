package com.ytm.pinctowtm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class YtmPincToWtmApplication {

	public static void main(String[] args) {
		SpringApplication.run(YtmPincToWtmApplication.class, args);
	}

}
