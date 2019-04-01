package com.zwj.dao;


import com.zwj.entity.Team;

public interface TeamDao {
    boolean AddTeam(Team team);

    Team queryTeam(String founder);
}
