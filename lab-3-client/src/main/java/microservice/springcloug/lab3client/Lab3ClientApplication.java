package microservice.springcloug.lab3client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Lab3ClientApplication extends SpringBootServletInitializer
{

    public static void main(String[] args)
    {
        SpringApplication.run(Lab3ClientApplication.class, args);
    }

    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder builder)
    {
        return builder.sources(Lab3ClientApplication.class);
    }

}

