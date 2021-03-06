package com.leone.boot.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * <p>
 *
 * @author leone
 * @since 2018-03-06
 **/
@EnableEurekaServer
@SpringBootApplication
public class DockerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }
}
