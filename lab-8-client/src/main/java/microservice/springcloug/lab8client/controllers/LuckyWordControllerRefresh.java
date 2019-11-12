package microservice.springcloug.lab8client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;


@RestController
@RefreshScope
public class LuckyWordControllerRefresh
{


    @Value("${wordConfig.preamble}")
    private String preamble;


    @Value("${wordConfig.luckyWord}")
    private String luckyWord;

    private String fullStatement;

    @PostConstruct
    public void postConstructer(){
        fullStatement =  preamble + ": " + luckyWord;
        System.out.println("from here");
    }


    @GetMapping("/lucky-word2")
    public String showLuckyWord()
    {
        return preamble + ": " + luckyWord+"/n"+fullStatement;
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
