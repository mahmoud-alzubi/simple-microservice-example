package com.example.simplemicroserviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.simplemicroserviceexample.beans", "com.example.simplemicroserviceexample.controller"})
public class SimpleMicroserviceExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleMicroserviceExampleApplication.class, args);
    }

}
