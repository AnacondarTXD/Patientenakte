package com.anacondartxd.patientenakte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PatientenakteApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientenakteApplication.class, args);
    }
}
