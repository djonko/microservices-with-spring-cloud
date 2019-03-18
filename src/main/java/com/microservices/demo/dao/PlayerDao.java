package com.microservices.demo.dao;

import com.microservices.demo.domain.Player;
import com.microservices.demo.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RestResource(path = "players", rel = "players")
public interface PlayerDao extends CrudRepository<Player, Long>
{

}
