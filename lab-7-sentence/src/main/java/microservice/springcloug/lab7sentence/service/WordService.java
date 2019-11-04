package microservice.springcloug.lab7sentence.service;

import microservice.springcloug.lab7sentence.domain.Word;

public interface WordService
{

    Word getSubject();

    Word getFallbackSubject();

    Word getVerb();

    Word getFallbackVerb();

    Word getArticle();

    Word getFallbackArticle();


    Word getAdjective();

    Word getFallbackAdjective();

    Word getNoun();

    Word getFallbackNoun();
}
