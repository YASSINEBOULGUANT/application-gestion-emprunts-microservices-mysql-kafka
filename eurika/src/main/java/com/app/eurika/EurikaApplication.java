package com.app.eurika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class EurikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurikaApplication.class, args);
	}

}
