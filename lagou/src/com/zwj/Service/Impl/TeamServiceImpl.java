package com.zwj.Service.Impl;

import com.zwj.Service.TeamService;
import com.zwj.dao.Impl.TeamDaoImpl;
import com.zwj.entity.Team;

public class TeamServiceImpl implements TeamService {
    TeamDaoImpl teamDao = new TeamDaoImpl();

    @Override

    public boolean AddTeam(Team team) {
        return teamDao.AddTeam(team);
    }

    @Override
    public Team queryTeam(String founder) {
        return teamDao.queryTeam(founder);
    }
}
