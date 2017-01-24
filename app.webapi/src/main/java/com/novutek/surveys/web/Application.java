package com.novutek.surveys.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.novutek.surveys.data")
@EntityScan("com.novutek.surveys.entities")
@ComponentScan("com.novutek.surveys")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
