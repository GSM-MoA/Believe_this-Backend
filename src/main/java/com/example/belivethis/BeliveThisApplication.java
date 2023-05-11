package com.example.belivethis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BeliveThisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeliveThisApplication.class, args);
    }

}
