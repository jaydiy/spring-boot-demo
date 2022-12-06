package com.naive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot01QuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01QuickstartApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Welcome to your first springboot project";
    }
}
