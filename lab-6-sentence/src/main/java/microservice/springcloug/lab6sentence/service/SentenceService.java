package microservice.springcloug.lab6sentence.service;

import org.springframework.cloud.openfeign.FeignClient;


public interface SentenceService
{

    String buildSentence();
}
