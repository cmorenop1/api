package com.simple.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApplication.class, args);
        System.out.println("\uD83D\uDE80 Server Started ➡\uFE0F http://localhost:8080/api/v1");
    }

}
