package com.inco.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class IncoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(IncoGatewayApplication.class, args);
    }

}
