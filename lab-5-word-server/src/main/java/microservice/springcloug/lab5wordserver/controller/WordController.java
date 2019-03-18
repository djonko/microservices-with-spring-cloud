package microservice.springcloug.lab5wordserver.controller;

import microservice.springcloug.lab5wordserver.domain.Word;
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
    public Word getWordAction()
    {
        String returnWord = null;
        returnWord = words[random.nextInt(words.length)];
        Word word = new Word(returnWord);
        return word;
    }
}
