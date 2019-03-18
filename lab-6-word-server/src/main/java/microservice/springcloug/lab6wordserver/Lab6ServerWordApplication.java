package microservice.springcloug.lab6wordserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Lab5ServerWordApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(Lab5ServerWordApplication.class, args);
    }

}

