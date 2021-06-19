package com.ytm.pinctootm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class YtmPincToOtmApplication {

	public static void main(String[] args) {
		SpringApplication.run(YtmPincToOtmApplication.class, args);
	}

}
