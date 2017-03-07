package com.x.project.application.layer.authentication.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

/**
 * Spring boot launcher class.
 * 
 * @author Esteban Cristóbal
 */
@SpringBootApplication
@EnableEurekaClient
@ImportResource("classpath:/META-INF/spring/authentication-manager*.xml")
public class AuthenticationManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationManagerApplication.class, args);
    }

}