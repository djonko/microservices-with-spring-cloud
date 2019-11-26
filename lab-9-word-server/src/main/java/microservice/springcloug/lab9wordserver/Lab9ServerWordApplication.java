package microservice.springcloug.lab9wordserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Lab9ServerWordApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(Lab9ServerWordApplication.class, args);
    }

}

