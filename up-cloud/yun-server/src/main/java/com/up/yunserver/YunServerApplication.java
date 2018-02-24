package com.up.yunserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YunServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YunServerApplication.class, args);
	}
}
