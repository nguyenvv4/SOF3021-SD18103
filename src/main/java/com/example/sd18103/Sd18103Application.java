package com.example.sd18103;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Sd18103Application {

    public static void main(String[] args) {
        SpringApplication.run(Sd18103Application.class, args);
    }

}
