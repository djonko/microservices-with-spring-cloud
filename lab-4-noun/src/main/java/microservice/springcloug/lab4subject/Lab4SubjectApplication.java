package microservice.springcloug.lab4subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Lab4SubjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4SubjectApplication.class, args);
	}

}

