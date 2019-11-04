package microservice.springcloug.lab7sentence.service;

import org.springframework.cloud.openfeign.FeignClient;


public interface SentenceService
{

    String buildSentence();
}
