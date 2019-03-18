package microservice.springcloug.lab6sentence.service;

import microservice.springcloug.lab6sentence.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService
{
    private AdjectiveClient adjectiveClient;
    private ArticleClient articleClient;
    private NounClient nounClient;
    private VerbClient verbClient;
    private SubjectClient subjectClient;


    @Override
    public String buildSentence()
    {
        String sentence = "There was a problem assembling the sentence!";
        sentence = String.format("%s %s %s %s %s",
                subjectClient.getWord(),
                verbClient.getWord(),
                articleClient.getWord(),
                adjectiveClient.getWord(),
                nounClient.getWord());
        return sentence;
    }



    @Autowired
    public void setAdjectiveClient(AdjectiveClient adjectiveClient)
    {
        this.adjectiveClient = adjectiveClient;
    }

    @Autowired
    public void setArticleClient(ArticleClient articleClient)
    {
        this.articleClient = articleClient;
    }

    @Autowired
    public void setNounClient(NounClient nounClient)
    {
        this.nounClient = nounClient;
    }

    @Autowired
    public void setVerbClient(VerbClient verbClient)
    {
        this.verbClient = verbClient;
    }

    @Autowired
    public void setSubjectClient(SubjectClient subjectClient)
    {
        this.subjectClient = subjectClient;
    }
}
