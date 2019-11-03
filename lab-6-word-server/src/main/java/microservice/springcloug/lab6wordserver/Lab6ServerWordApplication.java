package microservice.springcloug.lab6wordserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Lab6ServerWordApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(Lab6ServerWordApplication.class, args);
    }

}

