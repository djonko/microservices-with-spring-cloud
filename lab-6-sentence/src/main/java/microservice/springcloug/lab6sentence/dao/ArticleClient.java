package microservice.springcloug.lab6sentence.dao;

import microservice.springcloug.lab6sentence.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ARTICLE")
public interface ArticleClient
{
    @GetMapping("/word")
    public Word getWord();
}
