package com.example.myuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyUserApplication.class, args);
    }

}
