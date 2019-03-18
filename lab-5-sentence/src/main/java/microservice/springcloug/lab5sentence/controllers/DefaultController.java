package microservice.springcloug.lab5sentence.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class DefaultController
{

    private static final String HTTP = "http://";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sentence")
    public @ResponseBody
    String getSentence()
    {
        return
                getWorld("subject") + " " +
                        getWorld("verb") + " " +
                        getWorld("article") + " " +
                        getWorld("adjective") + " " +
                        getWorld("noun") + " . ";
    }

    public String getWorld(String service)
    {

        String value = null;
        value = restTemplate.getForObject(HTTP + service + "/word", String.class);


        return value;
    }

}
