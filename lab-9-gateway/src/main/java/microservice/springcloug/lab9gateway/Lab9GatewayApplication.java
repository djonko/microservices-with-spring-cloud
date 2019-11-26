package microservice.springcloug.lab9gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Lab9GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab9GatewayApplication.class, args);
    }

}

