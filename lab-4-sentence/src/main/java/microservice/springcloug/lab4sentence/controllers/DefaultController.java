package microservice.springcloug.lab4sentence.controllers;

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

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/sentence")
    public @ResponseBody
    String getSentence()
    {
        return
                getWorld("lab-4-subject") + " " +
                        getWorld("lab-4-verb") + " " +
                        getWorld("lab-4-article") + " " +
                        getWorld("lab-4-adjective") + " " +
                        getWorld("lab-4-noun") + " . ";
    }

    public String getWorld(String service)
    {
        String value = null;
        List<ServiceInstance> list = client.getInstances(service);
        if (list != null && list.size() > 0) {
            URI uri = list.get(0).getUri();
            if (uri != null) {
                RestTemplate restTemplate = new RestTemplate();
                value = restTemplate.getForObject(uri, String.class);
            }
        }
        return value;
    }

}
