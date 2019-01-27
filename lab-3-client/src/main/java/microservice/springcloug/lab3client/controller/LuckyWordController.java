package microservice.springcloug.lab3client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController
{
    @Value("${lucky-word:}")
    String luclyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord()
    {
        return "The lucky word is:" + luclyWord;
    }
}

