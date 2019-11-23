package microservice.springcloug.lab8client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "word-config")
@RestController
@Component
public class LuckyWordController
{


    private String preamble;


    private String luckyWord;


    @GetMapping("/lucky-word")
    public String showLuckyWord()
    {
        return preamble + ": " + luckyWord;
    }

    public String getLuckyWord()
    {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord)
    {
        this.luckyWord = luckyWord;
    }

    public String getPreamble()
    {
        return preamble;
    }

    public void setPreamble(String preamble)
    {
        this.preamble = preamble;
    }


}
