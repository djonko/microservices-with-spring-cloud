package microservice.springcloug.lab7sentence.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import microservice.springcloug.lab7sentence.dao.*;
import microservice.springcloug.lab7sentence.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WordServiceImpl implements WordService
{

    @Autowired
    VerbClient verbClient;
    @Autowired
    SubjectClient subjectClient;
    @Autowired
    ArticleClient articleClient;
    @Autowired
    AdjectiveClient adjectiveClient;
    @Autowired
    NounClient nounClient;

    @HystrixCommand(fallbackMethod = "getFallbackSubject")
    @Override
    public Word getSubject()
    {
        return subjectClient.getWord();
    }

    @Override
    public Word getFallbackSubject()
    {
        return new Word("Someone");
    }

    @Override
    public Word getVerb()
    {
        return verbClient.getWord();
    }

    @Override
    public Word getFallbackVerb()
    {
        return null;
    }

    @Override
    public Word getArticle()
    {
        return articleClient.getWord();
    }

    @Override
    public Word getFallbackArticle()
    {
        return null;
    }

    @HystrixCommand(fallbackMethod = "getFallbackAdjective")
    @Override
    public Word getAdjective()
    {
        return adjectiveClient.getWord();
    }

    @Override
    public Word getFallbackAdjective()
    {
        return new Word("");
    }

    @HystrixCommand(fallbackMethod = "getFallbackNoun")
    @Override
    public Word getNoun()
    {
        return nounClient.getWord();
    }

    @Override
    public Word getFallbackNoun()
    {
        return new Word("something");
    }
}
