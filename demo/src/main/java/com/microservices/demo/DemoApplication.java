package com.microservices.demo;

import com.microservices.demo.dao.TeamDao;
import com.microservices.demo.domain.Player;
import com.microservices.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer
{

    @Autowired
    TeamDao teamDao;

    /**
     * User wwhen I run as a jar
     *
     * @param args
     */
    public static void main(String[] args)
    {

        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * User when I run as a War
     *
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
    {
        return builder.sources(DemoApplication.class);
    }


    @PostConstruct
    public void init()
    {
        Set<Player> players = new HashSet<>();
        players.add(new Player("Charly Brown", "pitcher"));
        players.add(new Player("Snoopy", "shortstop"));

        Team team = new Team("California", "Peanuts", players);
        teamDao.save(team);
    }
}
