package microservice.springcloug.lab7sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService
{


    @Autowired
    private WordService wordService;


    @Override
    public String buildSentence()
    {
        String sentence = "There was a problem assembling the sentence!";
        sentence = String.format("%s %s %s %s %s",
                wordService.getSubject(),
                wordService.getVerb(),
                wordService.getArticle(),
                wordService.getAdjective(),
                wordService.getNoun());
        return sentence;
    }


}
