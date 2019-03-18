package microservice.springcloug.lab4configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab4ConfigServerApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(Lab4ConfigServerApplication.class, args);
    }


}

