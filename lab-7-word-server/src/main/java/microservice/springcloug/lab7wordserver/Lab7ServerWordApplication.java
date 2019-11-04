package microservice.springcloug.lab7wordserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Lab7ServerWordApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(Lab7ServerWordApplication.class, args);
    }

}

