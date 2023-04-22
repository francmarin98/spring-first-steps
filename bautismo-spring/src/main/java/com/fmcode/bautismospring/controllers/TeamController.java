package com.fmcode.bautismospring.controllers;

import com.fmcode.bautismospring.models.Team;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("teams")
public class TeamController {
    ArrayList<Team> teams = new ArrayList<>(
            List.of(
              new Team("Argentina", "Conmebol"),
              new Team("Ecuador", "Conmebol"),
              new Team("Brasil", "Conmebol"),
              new Team("Uruguay", "Conmebol")
            )
    );

    @GetMapping
    public List<Team> getAll(){
        return teams;
    }

    @GetMapping("/{name}")
    public Team findOne(@PathVariable String name){
        for (Team team : teams) {
            if (team.getCountry().equalsIgnoreCase(name)){
                return team;
            }
        }
        return null;
    }

    @PostMapping
    public void create(@RequestBody Team team){
        teams.add(team);
    }

    @PutMapping
    public void update(@RequestBody Team team){
        for (Team teamItem:teams) {
            if(teamItem.getCountry().equalsIgnoreCase(team.getCountry())){
                teamItem.setCountry(team.getCountry());
                teamItem.setCountry(team.getConfederation());
            }
        }
    }

    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name){
        teams.removeIf(team -> team.getCountry().equalsIgnoreCase(name));
    }
}
