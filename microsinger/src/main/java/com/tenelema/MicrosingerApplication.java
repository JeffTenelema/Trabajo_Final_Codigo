package com.tenelema;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages="com.tenelema")
@EnableDiscoveryClient
@EnableRabbit
public class MicrosingerApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicrosingerApplication.class, args);
	}
}
