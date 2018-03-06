package com.up.yunservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class YunServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YunServiceApplication.class, args);
//		new SpringApplicationBuilder(YunServiceApplication.class).web(true).run(args);
	}

}
