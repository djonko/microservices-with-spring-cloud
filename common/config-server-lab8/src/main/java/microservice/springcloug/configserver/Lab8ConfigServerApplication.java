package microservice.springcloug.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab8ConfigServerApplication
{

    public static void main(String[] args)
    {

        SpringApplication.run(Lab8ConfigServerApplication.class, args);
    }


}

