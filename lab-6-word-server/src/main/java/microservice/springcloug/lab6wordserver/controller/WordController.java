package microservice.springcloug.lab6wordserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WordController
{

    @Value("${words:}")
    private String[] words;

    private Random random = new Random();

    @GetMapping("/word")
    public @ResponseBody
    String getWordAction()
    {
        return words[random.nextInt(words.length)];
    }
}
