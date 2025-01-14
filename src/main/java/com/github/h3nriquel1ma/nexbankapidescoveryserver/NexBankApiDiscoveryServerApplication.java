package com.github.h3nriquel1ma.nexbankapidescoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NexBankApiDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexBankApiDiscoveryServerApplication.class, args);
    }

}
