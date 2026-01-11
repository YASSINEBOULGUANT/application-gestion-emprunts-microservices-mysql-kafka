package com.org.emprunt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmpruntServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpruntServiceApplication.class, args);
    }
}
