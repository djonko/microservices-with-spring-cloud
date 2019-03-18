package microservice.springcloug.lab6sentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableFeignClients(basePackages = {"microservice.springcloug.lab6sentence.dao"})
@EnableDiscoveryClient
public class Lab6SentenceApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(Lab6SentenceApplication.class, args);
    }

    //  This "LoadBalanced" RestTemplate
    //  is automatically hooked into Ribbon:
    @Bean
    @LoadBalanced
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

}

