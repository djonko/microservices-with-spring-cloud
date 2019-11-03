package microservice.springcloug.lab6wordserver.controller;

import microservice.springcloug.lab6wordserver.domain.Word;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WordController
{
    private static final Logger logger = LoggerFactory.getLogger(WordController.class);

    @Value("${words:}")
    private String[] words;

    private Random random = new Random();

    @GetMapping("/word")
    public Word getWordAction()
    {
        String value = words[random.nextInt(words.length)];
        logger.info(value);
        Word word = new Word();
        word.setWord(value);
        return word;
    }
}
