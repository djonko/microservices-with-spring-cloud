package com.microservices.demo.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement
@Entity
public class Team {

    private Long id;
    private String name;
    private String location;
    private String mascotte;

    private Set<Player> players;

    public Team(String location, String name , Set<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public Team() {
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
