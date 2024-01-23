package com.rickmoorty;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
@SpringBootApplication
public class RickmoortyApplication {

    public static void main(String[] args) {
        SpringApplication.run(RickmoortyApplication.class, args);
    }

}
