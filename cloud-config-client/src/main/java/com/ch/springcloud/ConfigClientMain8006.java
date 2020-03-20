package com.ch.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain8006.class,args);
    }
}
