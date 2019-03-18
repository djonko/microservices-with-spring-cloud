package com.microservices.demo;


import com.microservices.demo.dao.TeamDao;
import com.microservices.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WhateverIWant
{

    @Autowired
    private TeamDao teamDao;


    @RequestMapping("/hi")
    public @ResponseBody
    String hiThereHtmlBody()
    {
        return "hello world";
    }


    @RequestMapping("/hi/{name}")
    public String hiThere(Map model, @PathVariable String name)
    {
        model.put("name", name);
        return "hello";
    }

    @RequestMapping(value = "/hitekkam", produces = {"application/json", "application/xml"})
    public Team hiTeam()
    {
        return teamDao.findByName("Peanuts");
    }

    @RequestMapping("/team/{name}")
    public Team hiteam(@PathVariable String name)
    {
        return teamDao.findByName(name);
    }
}
