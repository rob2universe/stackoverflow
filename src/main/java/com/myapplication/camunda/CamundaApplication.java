package com.myapplication.camunda;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableProcessApplication("camunda-all")
@ComponentScan("com.myapplication.camunda")
@ComponentScan("com.springboot.camunda")
public class CamundaApplication extends SpringBootServletInitializer {

    public static void main(String... args) {
        SpringApplication.run(CamundaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CamundaApplication.class);
    }
}