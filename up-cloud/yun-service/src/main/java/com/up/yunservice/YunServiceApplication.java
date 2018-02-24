package com.up.yunservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class YunServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(YunServiceApplication.class).web(true).run(args);
	}

}
