package org.boilerplate.ticketboxgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TicketBoxGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketBoxGatewayServiceApplication.class, args);
    }

}
