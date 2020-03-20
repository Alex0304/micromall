package com.ch.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerMain6000 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerMain6000.class,args);
    }
}
