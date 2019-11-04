package microservice.springcloug.lab7sentence.controllers;

import microservice.springcloug.lab7sentence.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController
{

    @Autowired
    private SentenceService sentenceService;

    @GetMapping("/sentence")
    public @ResponseBody
    String getSentence()
    {
        long start = System.currentTimeMillis();
        String output =
                "<h3>Some Sentences</h3><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>";
        long end = System.currentTimeMillis();
        return output + "Elapsed time (ms): " + (end - start);

    }


}
