package microservice.springcloug.lab7sentence.dao;

import microservice.springcloug.lab7sentence.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("article")
public interface ArticleClient
{
    @GetMapping("/word")
    Word getWord();
}
